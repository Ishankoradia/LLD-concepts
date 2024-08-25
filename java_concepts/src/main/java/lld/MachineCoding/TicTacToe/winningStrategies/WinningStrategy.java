package lld.MachineCoding.TicTacToe.winningStrategies;

import lld.MachineCoding.TicTacToe.models.Board;
import lld.MachineCoding.TicTacToe.models.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);

    void handleUndo(Board board, Move move);
}
