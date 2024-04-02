package TicTacToe.Service.winningStrategy;

import TicTacToe.Model.Board;
import TicTacToe.Model.Move;
import TicTacToe.Model.Player;

public interface WinningStrategy {
    Player checkWinner(Board board, Move lastMove);
//    void handleUndo(Board board, Move lastMove);

}
