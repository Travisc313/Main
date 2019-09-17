package Maze;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class Client {

    public static void main(String[] args) throws FileNotFoundException
    {
      Scanner getFile = new Scanner(System.in);
      System.out.print("Enter location of file: ");
      String filename = getFile.nextLine();
      //String filename = "\\Users\\Travis\\Dropbox\\Sacramento State\\Fall 2019\\CSC 130\\CSC130 Assignments\\Maze\\src\\Maze\\mymaze.txt";

        Maze theMaze = new Maze(filename);

      System.out.println(theMaze);

      MazeSolver solver = new MazeSolver(theMaze);
      if(solver.traverse())
      {
          System.out.println("Success!! The path was traversed.");
      }
      else
      {
          System.out.println("Failure!! No Possible Path.");
      }
      System.out.println(theMaze);

    }
}
