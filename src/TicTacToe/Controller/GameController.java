package TicTacToe.Controller;

import TicTacToe.Model.*;

import TicTacToe.Service.winningStrategy.WinningStrategy;
import TicTacToe.Service.winningStrategy.WinningStrategyFactory;
import TicTacToe.Service.winningStrategy.WinningStrategyName;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> player, WinningStrategyName winningStrategy){
        return Game.builder()
                .setDimension(dimension)
                .setPlayers(player)
                .setWinningStrategy(WinningStrategyFactory.getWinningStrategy(dimension))
                .build();
    }
    public void displayBoard(Game game){
        game.getCurrentBoard().displayBoard();
    }
    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }
    public Move executeMove(Game game, Player player){
        return player.makeMove(game.getCurrentBoard());
    }
    public Player checkWinner(Game game, Move lastMove){
        return game.getWinningStrategy().checkWinner(game.getCurrentBoard(),lastMove);
    }
    public Board undoMove(Game game,Move lastMove){
        return null;
    }

}
