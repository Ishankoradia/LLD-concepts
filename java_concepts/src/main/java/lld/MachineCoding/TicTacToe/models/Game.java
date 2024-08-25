package lld.MachineCoding.TicTacToe.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import lld.MachineCoding.TicTacToe.enums.CellState;
import lld.MachineCoding.TicTacToe.enums.GameState;
import lld.MachineCoding.TicTacToe.enums.PlayerType;
import lld.MachineCoding.TicTacToe.exceptions.DuplicateSymbolException;
import lld.MachineCoding.TicTacToe.exceptions.InvalidPlayerCountException;
import lld.MachineCoding.TicTacToe.exceptions.TooManyBotsException;
import lld.MachineCoding.TicTacToe.winningStrategies.WinningStrategy;

public class Game {
    private Board board;
    private List<Move> moves;
    private List<Player> players;
    private int nextMovePlayerIndex;
    private List<WinningStrategy> winningStrategies;
    private Player winner;
    private GameState gameState;

    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.moves = new ArrayList<>();
        this.players = players;
        this.nextMovePlayerIndex = 0;
        this.winningStrategies = winningStrategies;
        this.winner = null;
        this.gameState = GameState.IN_PROGRESS;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Game build() throws TooManyBotsException, InvalidPlayerCountException, DuplicateSymbolException {
            // Validations

            // Bot count
            validateBotCount();
            // Player count
            validatePlayerCount();
            // No duplicate symbols
            validateDuplicateSymbols();

            return new Game(this.dimension, this.players, this.winningStrategies);
        }

        private void validateBotCount() throws TooManyBotsException {
            int botCount = 0;
            for (Player player : players) {
                if (player.getPlayerType() == PlayerType.BOT) {
                    botCount++;
                }
            }

            if (botCount > 1) {
                throw new TooManyBotsException();
            }
        }

        private void validatePlayerCount() throws InvalidPlayerCountException {
            if (players.size() > dimension - 1) {
                throw new InvalidPlayerCountException();
            }
        }

        private void validateDuplicateSymbols() throws DuplicateSymbolException {
            HashSet<Symbol> set = new HashSet<>();
            for (Player player : players) {
                if (set.contains(player.getSymbol())) {
                    throw new DuplicateSymbolException();
                }
                set.add(player.getSymbol());
            }
        }
    }

    public Player getWinner() {
        return winner;
    }

    public Board getBoard() {
        return board;
    }

    public void printBoard() {
        board.printBoard();
    }

    public GameState getGameState() {
        return gameState;
    }

    public void makeMove() {
        // Find current player
        Player currentMovePlayer = players.get(nextMovePlayerIndex);
        System.out.println("It is " + currentMovePlayer.getName() + "'s move");

        // Make move
        Move move = currentMovePlayer.makeMove(board);
        if (!isValidateMove(move)) {
            System.out.println("Invalid move ! Please try again");
            return;
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToBeUpdated = board.getBoard().get(row).get(col);
        cellToBeUpdated.setPlayer(currentMovePlayer);
        cellToBeUpdated.setCellState(CellState.FILLED);

        // Add it to moves list (Undo)
        Move finalMove = new Move(cellToBeUpdated, currentMovePlayer);
        moves.add(finalMove);

        // Update nextMovePlayerIndex
        nextMovePlayerIndex += 1;
        nextMovePlayerIndex %= players.size(); // so the next round , first players gets the turn & circularly we keep
                                               // going

        // Update cell and board
        // Check Winner and update game state

        if (checkWinner(board, finalMove)) {
            // winner
            gameState = GameState.WON;
            winner = currentMovePlayer;
        } else if (moves.size() == board.getSize() + board.getSize()) {
            // draw
            gameState = GameState.DRAW;
        }
    }

    private boolean checkWinner(Board board, Move move) {
        for (WinningStrategy winningStrategy : winningStrategies) {
            if (winningStrategy.checkWinner(board, move)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidateMove(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if (row >= board.getSize() || col >= board.getSize()) {
            return false;
        }

        if (board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)) {
            return true;
        }

        return false;
    }

    public void handleUndo() {
        // One move must be there
        if (moves.isEmpty()) {
            System.out.println("No moves to UNDO");
            return;
        }
        // Get and remove last move
        Move move = moves.get(moves.size() - 1);
        moves.remove(move);

        // update cell state
        Cell cell = move.getCell();
        cell.setCellState(CellState.EMPTY);
        cell.setPlayer(null);

        // update next player index
        nextMovePlayerIndex -= 1;
        nextMovePlayerIndex = (nextMovePlayerIndex + players.size()) % players.size();

        // Revert winning strategy by 1 move
        for (WinningStrategy winningStrategy : winningStrategies) {
            winningStrategy.handleUndo(board, move);
        }

    }

}
