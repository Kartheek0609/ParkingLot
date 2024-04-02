package TicTacToe.Service.botWinningStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(){
        return new RandomBotPlayingStrategy();
    }
}
