package TicTacToe.Model;

import TicTacToe.Service.botWinningStrategy.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(int id, char symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, "Adapa", symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }
    @Override
    public Move makeMove(Board board){
        return BotPlayingStrategyFactory.getBotPlayingStrategy().makeMove(board, this);
    }

}
