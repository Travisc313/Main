package Maze;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws FileNotFoundException
    {
       // Scanner scan = new Scanner(System.in);
        //System.out.print("Enter name of file: ");
        //String filename = scan.nextLine();

       Maze laby = new Maze("mymaze.txt");

       System.out.println(laby);
    }
}
