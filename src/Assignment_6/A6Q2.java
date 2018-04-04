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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Asks how many people are in giving their heights
        Scanner input = new Scanner(System.in);
        System.out.print("How many people's heights are you inputting? ");
        int people = input.nextInt();

        // Write your heights into the space below
        System.out.println("Please write their heights in cm: ");

        double[] height = new double[people];
        double sum = 0;
        for (int i = 0; i < height.length; i++) {
            double avH = input.nextDouble();
            height[i] = avH;
            sum = sum + height[i];
        }

        // Gets average and tells you who is above average
        double average = sum / people;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > average) {
                System.out.println("You are abouve average, " + height[i]);
            }
        }
    }
}
