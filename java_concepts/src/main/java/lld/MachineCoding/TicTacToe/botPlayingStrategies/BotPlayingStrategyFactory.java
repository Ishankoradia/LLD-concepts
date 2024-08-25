package lld.MachineCoding.TicTacToe.botPlayingStrategies;

import lld.MachineCoding.TicTacToe.enums.DifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStratByDifficultyLevel(DifficultyLevel difficultyLevel) {
        if (DifficultyLevel.EASY.equals(difficultyLevel)) {
            return new EasyBotPlayingStrategy();
        }

        return null;
    }
}