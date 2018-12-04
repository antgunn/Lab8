// A class representing a position in the game

public class Position {

    private int row, col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getPosToString() {
        return "Position{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}
