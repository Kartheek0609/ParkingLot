package TicTacToe.Service.botWinningStrategy;

import TicTacToe.Model.Board;
import TicTacToe.Model.Move;
import TicTacToe.Model.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
