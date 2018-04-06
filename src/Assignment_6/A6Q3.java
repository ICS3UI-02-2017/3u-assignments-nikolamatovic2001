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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        // Places two integers into the array
        int[] sort = new int[2];
        for (int i = 0; i < sort.length; i++) {
            int num = input.nextInt();
            sort[i] = num;
        }
        // Sorts the numbers in ascending order
        if (sort[0] < sort[1]) {
            int store = sort[0];
            sort[0] = sort[1];
            sort[1] = store;
            System.out.println("The integers in ascending order are: " + sort[1] + " " + sort[0]);
        } else {
            System.out.println("The integers in ascending order are: " + sort[1] + " " + sort[0]);
        }
    }
}
