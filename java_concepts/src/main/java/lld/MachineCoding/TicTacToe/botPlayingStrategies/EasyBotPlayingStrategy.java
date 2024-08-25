package lld.MachineCoding.TicTacToe.botPlayingStrategies;

import java.util.List;

import lld.MachineCoding.TicTacToe.enums.CellState;
import lld.MachineCoding.TicTacToe.models.Board;
import lld.MachineCoding.TicTacToe.models.Move;
import lld.MachineCoding.TicTacToe.models.Cell;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Move makeMove(Board board) {
        for (List<Cell> row : board.getBoard()) {
            for (Cell cell : row) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(cell, null);
                }
            }
        }
        return null;
    }
}