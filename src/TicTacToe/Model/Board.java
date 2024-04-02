package TicTacToe.Model;
import java.util.List;
import java.util.ArrayList;
public class Board {
    private int dimension;
    private List<List<Cell>> matrix;
    public Board(int dimension){
        this.dimension=dimension;
        matrix= new ArrayList<>();
        for(int i=0;i<dimension;i++){
            matrix.add(new ArrayList<>());
            for(int j=0;j<dimension;j++){
                matrix.get(i).add(new Cell(i,j));
            }
        }
    }
    @Override
    public Board clone(){
        return new Board(getDimension());
    }
    // display board
    public void displayBoard(){
        for(int i=0;i<dimension;i++){
            List<Cell> cells =matrix.get(i);
            for(Cell cell :cells){
                cell.displayCell();
            }
            System.out.println();
        }
    }

    public List<List<Cell>> getMatrix(){
        return matrix;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
