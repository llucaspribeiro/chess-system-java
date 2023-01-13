package boardgame;

public class Position {

    private int row;
    private int color;

    public Position(int row, int color) {
        this.row = row;
        this.color = color;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return row + ", " + color;
    }

}
