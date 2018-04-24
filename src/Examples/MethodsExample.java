/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

// @author maton0870
public class MethodsExample {

    //The helloWorld method to say hello
    public static void helloWorld() {
        System.out.println("Hello World!");
    }

    //Say hello to a user
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    //Quadratic formula positive root only
    public static double posQuadFormula(double a, double b, double c) {
        double discrim = b * b - 4 * a * c;
        double root = (-b + Math.sqrt(discrim)) / (2 * a);
        //Send back the root
        return root;
    }

    //Quadratic formula negative root only
    public static double negQuadFormula(double a, double b, double c) {
        double discrim = b * b - 4 * a * c;
        double root = (-b - Math.sqrt(discrim)) / (2 * a);
        //Send back the root
        return root;
    }
    //Does both roots

    public static double[] quadFormula(double a, double b, double c) {
        //Create array to store both roots
        double[] roots = new double[2];
        //calcuate the roots
        double discrim = b * b - 4 * a * c;
        roots[0] = (-b + Math.sqrt(discrim)) / (2 * a);
        roots[1] = (-b - Math.sqrt(discrim)) / (2 * a);
        //Send back the root
        return roots;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Call the helloWorld method
        helloWorld();
        System.out.print("What is your name? ");
        String user = input.nextLine();
        sayHello(user + "!");

        //Calcualte the + root of these numbers
        double pRoot = posQuadFormula(1, -5, -50);
        System.out.println("The positive root is " + pRoot);

        double[] roots = quadFormula(1, -5, -50);
        System.out.println("The roots are " + roots[0] + " and " + roots[1]);
    }
}
