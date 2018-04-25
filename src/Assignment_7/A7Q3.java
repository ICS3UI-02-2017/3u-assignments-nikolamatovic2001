/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

import java.util.Scanner;

/**
 * @author maton0870
 */
public class A7Q3 {

    public static void factors(int number) {
        //Checks all the numbers from 1 to the nubmer inputted
        for (int i = 1; i <= number; i++) {
            //Divides the number by 1 upto the number
            if (number % i == 0) {
                //If the remainder is 0, prints it out
                System.out.println(i);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prints out all the factors of the number
        System.out.print("Please write the number you want the factors of: ");
        Scanner input = new Scanner(System.in);
        factors(input.nextInt());
    }
}
