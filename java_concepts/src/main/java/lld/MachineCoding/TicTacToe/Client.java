package lld.MachineCoding.TicTacToe;

import java.util.ArrayList;
import java.util.List;

import lld.MachineCoding.TicTacToe.controllers.GameController;
import lld.MachineCoding.TicTacToe.enums.GameState;
import lld.MachineCoding.TicTacToe.exceptions.DuplicateSymbolException;
import lld.MachineCoding.TicTacToe.exceptions.InvalidPlayerCountException;
import lld.MachineCoding.TicTacToe.exceptions.TooManyBotsException;
import lld.MachineCoding.TicTacToe.models.Game;
import lld.MachineCoding.TicTacToe.models.Player;
import lld.MachineCoding.TicTacToe.winningStrategies.WinningStrategy;

public class Client {
    public static void main(String[] args) {
        // Client -> Controller -> Model/Service
        GameController gameController = new GameController();
        System.out.println("Game started");

        // Client inputs
        int dimensions = 3;
        List<Player> players = new ArrayList<>();
        List<WinningStrategy> winningStrategyList = new ArrayList<>();

        Game game = null;
        try {
            game = gameController.startGame(dimensions, players, winningStrategyList);
        } catch (DuplicateSymbolException e) {
            throw new RuntimeException();
        } catch (TooManyBotsException e) {
            throw new RuntimeException();
        } catch (InvalidPlayerCountException e) {
            throw new RuntimeException();
        }

        gameController.displayBoard(game); // stateless

        // Check winner; in the while loop
        while (checkWinner(game) && gameController.checkState().equals(GameState.IN_PROGRESS)) {
            gameController.makeMove(game);
            gameController.displayBoard(game);
        }

        if (gameController.checkState().equals(GameState.WON)) {
            System.out.println("The winner is " + gameController.getWinner().getName());
        }
    }
}
