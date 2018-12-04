// A class representing a position in the game

import java.util.Arrays;

public class Position {

    private int row, col;
    private int[] pos = new int[2];

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
        pos[0] = row;
        pos[1] = col;
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

    public  int[] getCurrentPos() {
        int[] pos = {row, col};
        return pos;
    }

    public String getPosArrayToString() {
        return "Position{"+ Arrays.toString(pos) +
                '}';
    }

    public String getPosToString() {
        return "Position{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}
