package lld.MachineCoding.TicTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import lld.MachineCoding.TicTacToe.controllers.GameController;
import lld.MachineCoding.TicTacToe.enums.DifficultyLevel;
import lld.MachineCoding.TicTacToe.enums.GameState;
import lld.MachineCoding.TicTacToe.enums.PlayerType;
import lld.MachineCoding.TicTacToe.exceptions.DuplicateSymbolException;
import lld.MachineCoding.TicTacToe.exceptions.InvalidPlayerCountException;
import lld.MachineCoding.TicTacToe.exceptions.TooManyBotsException;
import lld.MachineCoding.TicTacToe.models.BotPlayer;
import lld.MachineCoding.TicTacToe.models.Game;
import lld.MachineCoding.TicTacToe.models.Player;
import lld.MachineCoding.TicTacToe.models.Symbol;
import lld.MachineCoding.TicTacToe.winningStrategies.ColumnWinningStrategy;
import lld.MachineCoding.TicTacToe.winningStrategies.DiagonalWinningStrategy;
import lld.MachineCoding.TicTacToe.winningStrategies.RowWinningStrategy;
import lld.MachineCoding.TicTacToe.winningStrategies.WinningStrategy;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Client -> Controller -> Model/Service
        GameController gameController = new GameController();
        System.out.println("Game started");

        // Client inputs

        try {
            int dimensions = 3;

            List<Player> players = new ArrayList<>();

            players.add(new Player(1, "Shaurya", new Symbol('X'), PlayerType.HUMAN));
            players.add(new BotPlayer(1, "GPT", new Symbol('D'), PlayerType.BOT, DifficultyLevel.EASY));

            List<WinningStrategy> winningStrategyList = Arrays.asList(new RowWinningStrategy(),
                    new ColumnWinningStrategy(), new DiagonalWinningStrategy());

            Game game = gameController.startGame(dimensions, players, winningStrategyList);

            System.out.println("here");

            gameController.displayBoard(game); // stateless

            // Check winner; in the while loop
            while (gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
                gameController.makeMove(game);
                gameController.displayBoard(game);
                System.out.println("Do you want to undo (y/n) ??");
                String undoAns = scanner.next();
                if (undoAns.equalsIgnoreCase("Y")) {
                    gameController.undo(game);
                }
                gameController.displayBoard(game);
            }

            if (gameController.checkState(game).equals(GameState.WON)) {
                System.out.println("The winner is " + gameController.getWinner(game).getName());
            }
        } catch (DuplicateSymbolException e) {
            throw new RuntimeException();
        } catch (TooManyBotsException e) {
            throw new RuntimeException();
        } catch (InvalidPlayerCountException e) {
            throw new RuntimeException();
        }

    }
}
