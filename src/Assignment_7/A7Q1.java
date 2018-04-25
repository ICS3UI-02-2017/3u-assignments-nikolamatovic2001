/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

import java.util.Scanner;

/**
 * @author maton0870
 */
public class A7Q1 {

    public static double circleArea(double r) {
        //Calculates Area of the Circle
        double area = Math.PI * Math.pow(r, 2);
        //Send back the area
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Asks for the radius
        Scanner input = new Scanner(System.in);
        System.out.println("Please write the radius of the circle: ");
        double circleArea = circleArea(input.nextDouble());
        //Prints out the Area
        System.out.println("Here is the area of your circle: " + circleArea);
    }
}
