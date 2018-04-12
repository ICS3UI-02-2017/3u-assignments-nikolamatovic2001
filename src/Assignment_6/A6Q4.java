/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author maton0870
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Asks the user to input the numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the 10 marks down below; ");

        //Creates a 10 int array
        int[] sort = new int[10];

        //Puts numbers into the array
        for (int x = 0; x < sort.length; x++) {
            int num = input.nextInt();
            sort[x] = num;
        }
        //Sorts the numbers from smallest to biggest
        for (int x = 0; x < sort.length - 1; x++) {
            for (int y = x + 1; y < sort.length; y++) {
                if (sort[x] > sort[y]) {
                    int store = sort[x];
                    sort[x] = sort[y];
                    sort[y] = store;
                }
            }
        }
        //Outputs the numbers 
        System.out.print(Arrays.toString(sort));
    }
}