package lld.MachineCoding.TicTacToe.controllers;

import java.util.List;

import lld.MachineCoding.TicTacToe.enums.GameState;
import lld.MachineCoding.TicTacToe.exceptions.DuplicateSymbolException;
import lld.MachineCoding.TicTacToe.exceptions.InvalidPlayerCountException;
import lld.MachineCoding.TicTacToe.exceptions.TooManyBotsException;
import lld.MachineCoding.TicTacToe.models.Game;
import lld.MachineCoding.TicTacToe.models.Player;
import lld.MachineCoding.TicTacToe.winningStrategies.WinningStrategy;

public class GameController {
    // Game game; // makes the controller statefule & you can only work on one game
    // with one
    // GameController instance

    public Game startGame(int size, List<Player> players, List<WinningStrategy> winningStrategies)
            throws TooManyBotsException, InvalidPlayerCountException, DuplicateSymbolException {
        // Validations BUILDER PATTERN
        return Game.getBuilder()
                .setDimension(size)
                .setWinningStrategies(winningStrategies)
                .setPlayers(players)
                .build();
    }

    public void displayBoard(Game game) {
        game.printBoard();
    }

    public void makeMove(Game game) {
        // Make a move on the game that is passed
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void undo(Game game) {
        game.handleUndo();
    }

    /**
     * 1. Create new game
     * 2. Display board
     * Check winner and While the gameState is IN_PROGRESS
     * ----- 3. Make a move
     * ----- 4. Display updated board
     * 
     * Check game state and :
     * --- If draw -> handle draw
     * --- If winner -> display winner
     * 
     * Handle pause
     * 
     * Handle undo
     */

}
