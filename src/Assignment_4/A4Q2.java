/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author maton0870
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // scans for a number in inches
        System.out.print("Please enter the measurment in inches you wish to convert: ");
        Scanner input = new Scanner(System.in);
        double inch = input.nextDouble();
        //multiplys the number by 2.54 and gives it to you in cm
        double centi = inch * 2.54;
        System.out.println(inch + " inches is the same as " + centi + "cm");
    }
}
