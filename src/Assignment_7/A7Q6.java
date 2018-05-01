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
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static int lastDigit(int lastNum) {
        //Finds the last digit, positive
        int last = 0;
        for (int i = 0; i < 10; i++) {
            if (lastNum % 10 == i) {
                last = i;
            }
        }
        //Finds the last digit , negative
        for (int x = 0; x > -10; x--) {
            if (lastNum % -10 == x) {
                last = x * -1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        //Prints out the last digit
        Scanner input = new Scanner(System.in);
        System.out.print("Please write your number: ");
        int digit = lastDigit(input.nextInt());
        System.out.println("The last digit is: " + digit);
    }
}
