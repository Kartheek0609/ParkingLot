package TicTacToe.Model;
import TicTacToe.Exception.InvalidBotException;
import TicTacToe.Exception.InvalidPlayerSizeException;
import TicTacToe.Exception.InvalidSymbolSetUpException;
import TicTacToe.Service.winningStrategy.WinningStrategy;
import TicTacToe.Service.winningStrategy.WinningStrategyName;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class Game {
    private final Board currentBoard;
    private final List<Player> players;
    private final Player currentPlayer;
    private GameStatus gameStatus;
    private final List<Move> moves;
    private final List<Board> boardStates;
    private final WinningStrategy winningStrategy;
    private final int noOfSymbols;

    public Game(Board currentBoard, List<Player> players, WinningStrategy winningStrategy) {
        this.currentBoard = currentBoard;
        this.players = players;
        this.currentPlayer = null;
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.boardStates = new ArrayList<>();
        this.winningStrategy = winningStrategy;
        this.noOfSymbols = players.size();
    }
   /* public void undo(){
        if(moves.size()==0){
            System.out.println("No moves to undo");
            return ;
        }
        Move lastMove= moves.get(moves.size()-1);
        moves.remove(lastMove);
        Cell cell = lastMove.getCell();
        cell.setPlayer(null);
        cell.setCellState(CellState.EMPTY);
        for(WinningStrategy winning: winningStrategy){
            winning.handleUndo(currentBoard, lastMove);
        }

    }

    */
    public static Builder builder(){
        return new Builder();
    }

    public Board getCurrentBoard() {
        return currentBoard;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public List<Board> getBoardStates() {
        return boardStates;
    }

    public WinningStrategy getWinningStrategy() {
        return winningStrategy;
    }

    public int getNoOfSymbols() {
        return noOfSymbols;
    }
    public static class Builder{
        private int dimension;
        private Board currentBoard;
        private List<Player> players;
        private WinningStrategy winningStrategy;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setCurrentBoard(Board currentBoard) {
            this.currentBoard = currentBoard;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategy = winningStrategy;
            return this;
        }
        private void validateNumberOfPlayer(){
            if(players.size() < dimension - 2 || players.size() >= dimension){
                throw new InvalidPlayerSizeException("Player size should be N-2 or N-1 as per board size");
            }
        }
        private void validateSymbols(){
            HashSet<Character> symbols= new HashSet<>();
            for(Player player:players){
                symbols.add(player.getSymbol());
            }
            if(symbols.size() != players.size()){
                throw new InvalidSymbolSetUpException("There Should be unique Symbols for each player");
            }
        }

        private void validateBotCount(){
            int botCount=0;
            for(Player player: players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if(botCount >1 || botCount <0){
                throw new InvalidBotException("We can have a maximum of 1 bot in the game");
            }
        }

        private  void validate(){
            validateBotCount();
            validateSymbols();
            validateNumberOfPlayer();
        }
        public Game build(){
            validate();
            return new Game(new Board(dimension),players, winningStrategy);
        }
    }

}
