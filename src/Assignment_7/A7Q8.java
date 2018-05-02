/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

import java.util.Scanner;

/**
 *
 * @author maton0870
 */
public class A7Q8 {

    public static boolean allDigitsOdd(int oddNum) {
        //Checks to see if their is only odd numbers
        boolean oddDigit = true;
        while (oddNum >= 10 || oddNum <= -10) {
            if (oddNum % 2 == 0) {
                oddDigit = false;
            }
            oddNum = oddNum / 10;
        }
        return oddDigit;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tells you if there is only odd numbers or not
        Scanner input = new Scanner(System.in);
        System.out.print("Please type your number: ");
        boolean oddNum = allDigitsOdd(input.nextInt());
        System.out.println("There is only odd numbers: " + oddNum);
    }
}
