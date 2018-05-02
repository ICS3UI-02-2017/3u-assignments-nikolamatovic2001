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
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static int firstDigit(int firstNum) {
        //Finds the first positive digit
        int first = 0;
        while (firstNum >= 10) {
            firstNum = firstNum / 10;
            first = firstNum;
        }
        //Finds the first negaitive digit
        while (firstNum <= -10) {
            firstNum = firstNum / 10;
            first = firstNum * -1;
        }
        //Returns the first digit
        return first;
    }

    public static void main(String[] args) {
        //Prints out the first digit
        Scanner input = new Scanner(System.in);
        System.out.print("Please type out your number: ");
        int firstNumber = firstDigit(input.nextInt());
        System.out.println("Your first number is: " + firstNumber);
    }
}
