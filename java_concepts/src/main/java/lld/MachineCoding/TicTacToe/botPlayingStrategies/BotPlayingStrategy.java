package lld.MachineCoding.TicTacToe.botPlayingStrategies;

import lld.MachineCoding.TicTacToe.models.Board;
import lld.MachineCoding.TicTacToe.models.Move;

public interface BotPlayingStrategy {
    public Move makeMove(Board board);
}