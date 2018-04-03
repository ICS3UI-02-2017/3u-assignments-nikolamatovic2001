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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Asks how many students are in the class
        Scanner input = new Scanner(System.in);
        System.out.print("How many students are in the class? ");
        int student = input.nextInt();
        System.out.println("Enter the Marks:");

        // Asks to input the students marks
        double[] marks = new double[student];
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            double mark = input.nextDouble();
            sum = sum + mark + marks[i];
        }
        // Calculates the average
        double average = sum / student;
        System.out.println("The class average is " + average + "%");
    }
}
