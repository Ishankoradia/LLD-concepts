package lld.MachineCoding.TicTacToe.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

    public Board getBoard() {
        return board;
    }
}
