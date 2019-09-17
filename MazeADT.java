package Maze;

public interface MazeADT<T> {
    public void tryPosition(int row, int col);
    public void markedPath(int row, int col);
    public int getRows();
    public int getColumns();
    public boolean validPosition(int row, int col);
    public String toString();
}
