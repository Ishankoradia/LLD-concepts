package lld.MachineCoding.TicTacToe.winningStrategies;

import java.util.HashMap;
import java.util.Map;

import lld.MachineCoding.TicTacToe.models.Board;
import lld.MachineCoding.TicTacToe.models.Move;
import lld.MachineCoding.TicTacToe.models.Symbol;

public class ColumnWinningStrategy implements WinningStrategy {

    Map<Integer, Map<Symbol, Integer>> colCountMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if (!colCountMap.containsKey(col)) {
            colCountMap.put(col, new HashMap<>());
        }

        Map<Symbol, Integer> colMap = colCountMap.get(col);

        if (!colMap.containsKey(symbol)) {
            colMap.put(symbol, 0);
        }
        colMap.put(symbol, colMap.get(symbol) + 1);

        if (colMap.get(symbol) == board.getSize()) {
            return true;
        }

        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        Map<Symbol, Integer> rowMap = colCountMap.get(col);
        rowMap.put(symbol, rowMap.get(symbol) - 1);
    }

}