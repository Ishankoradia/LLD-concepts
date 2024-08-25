package lld.MachineCoding.TicTacToe.models;

import lld.MachineCoding.TicTacToe.botPlayingStrategies.BotPlayingStrategy;
import lld.MachineCoding.TicTacToe.botPlayingStrategies.BotPlayingStrategyFactory;
import lld.MachineCoding.TicTacToe.enums.DifficultyLevel;
import lld.MachineCoding.TicTacToe.enums.PlayerType;

public class BotPlayer extends Player {
    private DifficultyLevel difficultyLevel;

    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(int id, String name, Symbol symbol, PlayerType playerType, DifficultyLevel difficultyLevel) {
        super(id, name, symbol, playerType);
        this.difficultyLevel = difficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStratByDifficultyLevel(difficultyLevel);
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Move makeMove(Board board) {
        // This overrides the method in player; since function signature is same
        Move move = botPlayingStrategy.makeMove(board);
        move.setPlayer(this);
        return move;
    }

}
