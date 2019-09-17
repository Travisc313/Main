package Maze;
import java.util.*;
import java.io.*;

public class Maze {

    private static final int TRIED = 2;
    private static final int PATH = 3;
    int numRows, numCols;
    public int[][] mazeGrid;


    public Maze(String filename) throws FileNotFoundException
    {
        Scanner getInt = new Scanner(new File(filename));

        numRows = getInt.nextInt();
        numCols = getInt.nextInt();

        mazeGrid = new int[numRows][numCols];
        for(int i=0; i < numRows; i++)
            for(int j=0; j < numCols; j++)
               mazeGrid[i][j] = getInt.nextInt();
    }

    public void printMaze()
    {
        for(int i=0; i < numRows; i++)
        {
            if(i!=0)
                System.out.print("\n");
            for (int j = 0; j < numCols; j++)
                System.out.print(mazeGrid[i][j]);
        }
    }

    public void tryPosition(int row,int col)
    {
        mazeGrid[row][col] = TRIED;
    }

    public int getRows()
    {
        return mazeGrid.length;
    }

    public int getColumns()
    {
        return mazeGrid[0].length;
    }

    public void markPath(int row, int col)
    {
        mazeGrid[row][col] = PATH;
    }

    public boolean validPosition(int row, int column)
    {
        boolean result = false;

        if(row >= 0 && row < mazeGrid.length && column >= 0 && column < mazeGrid[row].length)
        {
            if (mazeGrid[row][column] == 1)
                result = true;
        }
        return result;
    }

    public String toString()
    {
        String result = "\n";

        for(int row=0; row < mazeGrid.length; row++)
        {
            for(int column=0; column < mazeGrid[row].length; column++)
                result += mazeGrid[row][column] + "";
            result+= "\n";
        }

        return result;
    }


}
