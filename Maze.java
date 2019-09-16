package Maze;
import java.util.*;
import java.io.*;

public class Maze {

    private static final int TRIED = 2;
    private static final int PATH = 3;
    private int numRows, numCols;
    private int[][] mazeGrid;

    public Maze(String filename) throws FileNotFoundException
    {
        Scanner getInt =  new Scanner(new File(filename));
        numRows = getInt.nextInt();
        numCols = getInt.nextInt();

        mazeGrid = new int[numRows][numCols];
        for(int i=0; i < numRows; i++)
            for(int j=0; j <numCols; j++)
                mazeGrid[i][j] = getInt.nextInt();
    }


}
