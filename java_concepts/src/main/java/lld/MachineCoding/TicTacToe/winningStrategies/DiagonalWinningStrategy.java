package lld.MachineCoding.TicTacToe.winningStrategies;

import java.util.HashMap;
import java.util.Map;

import lld.MachineCoding.TicTacToe.models.Board;
import lld.MachineCoding.TicTacToe.models.Move;
import lld.MachineCoding.TicTacToe.models.Symbol;

public class DiagonalWinningStrategy implements WinningStrategy {

    Map<Symbol, Integer> leftDimensionCount = new HashMap<>();

    Map<Symbol, Integer> rightDimensionCount = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        // left diagonal
        if (row == col) {
            if (!leftDimensionCount.containsKey(symbol)) {
                leftDimensionCount.put(symbol, 0);
            }
            leftDimensionCount.put(symbol, leftDimensionCount.get(symbol) + 1);
        }

        // right diagonal
        if (row + col == board.getSize() - 1) {
            if (!rightDimensionCount.containsKey(symbol)) {
                rightDimensionCount.put(symbol, 0);
            }
            rightDimensionCount.put(symbol, rightDimensionCount.get(symbol) + 1);

            if (rightDimensionCount.get(symbol) == board.getSize()) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int col = move.getCell().getCol();
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        if (row == col) {
            leftDimensionCount.put(symbol, leftDimensionCount.get(symbol) - 1);
        }

        if (row + col == board.getSize() - 1) {
            rightDimensionCount.put(symbol, rightDimensionCount.get(symbol) - 1);
        }
    }

}