package com.example.Project2;

import java.io.*;
import java.util.*;

public class project2 {
    public static void main(String[] args) throws FileNotFoundException {
        //String fileName = args[0];
        String fileName = "src/input2.txt";
        File file = new File(fileName);
        Scanner readFile = new Scanner(file);

        int m = readFile.nextInt();
        System.out.print("m: " + m);
        int n = readFile.nextInt();
        System.out.println(" n:" + n);
        int target = readFile.nextInt();
        System.out.println("target: "+ target);

        // array to store the 2d input data
        int[][] data = new int[m][n];

        for(int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = readFile.nextInt();
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

        int midRow = m / 2;
        int midCol = n / 2;

        System.out.println("data[" + midRow + "][" + midCol + "] is " + data[midRow][midCol]);
        if(data[midRow][midCol] == target){
            System.out.println(data[midRow][midCol] + " equals " + target);
        } else if(target > data[midRow][midCol]){
            // get three sub-arrays to the bottom right
            System.out.println("Remove top left portion of array");
        } else if(target < data[midRow][midCol]){
            System.out.println("Remove bottom right portion of array");
            int endRow = m - midRow - 1;
            int endCol = n - midCol - 2;

            System.out.println("new array size is: [" + midRow +"][" + midCol + "]");
            System.out.println("endRow: " + endRow + " endCol: " + endCol);

            int[][] sub1 = new int[midRow][midCol];

        } else {
            System.out.println("Not found");
        }
    }


    private static void searchRecursive(int[][] data, int m, int n){

    }
}
