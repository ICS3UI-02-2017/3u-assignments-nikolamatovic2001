/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;

/**
 *
 * @author maton0870
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Asks how many students are in the class
        Scanner input = new Scanner(System.in);
        System.out.print("How many students are in your class: ");
        int arraySize = input.nextInt();
        System.out.println("Please input the " + arraySize + " students marks below:");

        //Asks for their marks
        int[] marks = new int[arraySize];

        //Puts numbers into the array
        for (int i = 0; i < marks.length; i++) {
            int num = input.nextInt();
            marks[i] = num;
        }
        //Sorts the marks from smallest to biggest
        for (int x = 0; x < marks.length - 1; x++) {
            for (int y = x + 1; y < marks.length; y++) {
                if (marks[x] > marks[y]) {
                    int store = marks[x];
                    marks[x] = marks[y];
                    marks[y] = store;
                }
            }
        }
        //Outputs the lowest mark in the class
        System.out.println("This is the lowest mark in the class: " + marks[0]);
        //Outputs the highest mark in the class
        System.out.println("This is the highest mark in the class: " + marks[arraySize - 1]);
        //Outputs the average of the class
        int store = 0;
        for (int z = 0; z < marks.length; z++) {
            store = store + marks[z];
        }
        int average = store / arraySize;
        System.out.println("Here is the average of the class: " + average);
    }
}
