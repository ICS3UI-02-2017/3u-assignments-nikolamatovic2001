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
public class A7Q4 {

    public static double compoundIntrest(double initial, double rate, int years) {
        double balance = initial * Math.pow((1 + rate), years);
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please write your principle, intrest rate and number of years: ");
        double p = input.nextDouble();
        double r = input.nextDouble();
        int y = input.nextInt();
        double balance = compoundIntrest(p, r, y);
        System.out.println("Here is your final balance: " + balance);

    }
}
