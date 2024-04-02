package TicTacToe.Model;

import java.util.Scanner;

public class Player {
    private int id ;
    private String name;
    private char symbol;
    private PlayerType playerType;

    public Player() {
    }

    public Player(int id, String name, char symbol, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }
    // player will make a move
    public Move makeMove(Board board){
        Scanner sc = new Scanner(System.in);
        System.out.println(getName() +" Enter the row for the target cell");
        int row = sc.nextInt();
        System.out.println(getName() + " Enter the col for the target cell");
        int col = sc.nextInt();
        CellState getCellStatus = board.getMatrix().get(row).get(col).getCellState();
        if(getCellStatus ==CellState.EMPTY) {
            Cell playedMoveCell = board.getMatrix().get(row).get(col);
            playedMoveCell.setCellState(CellState.FILLED);
            playedMoveCell.setPlayer(this);
            return new Move(playedMoveCell, this);
        }
        else{
            System.out.println(getName()+" Cell State is Already "+ getCellStatus);
            System.out.println(getName() +" Enter the row for the target cell");
            row = sc.nextInt();
            System.out.println(getName() + " Enter the col for the target cell");
            col = sc.nextInt();
            Cell playedMoveCell = board.getMatrix().get(row).get(col);
            playedMoveCell.setCellState(CellState.FILLED);
            playedMoveCell.setPlayer(this);
            return new Move(playedMoveCell, this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
