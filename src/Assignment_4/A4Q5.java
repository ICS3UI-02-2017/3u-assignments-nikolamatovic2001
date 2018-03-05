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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String name = input.nextLine();
    System.out.println();

    System.out.print("What was the first test out of?: ");
    double first = input.nextDouble();
    System.out.print("What mark did you get?: ");
    double firstmark = input.nextDouble();
    System.out.println();

    System.out.print("What was the second test out of?: ");
    double second = input.nextDouble();
    System.out.print("What mark did you get?: ");
    double secondmark = input.nextDouble();
    System.out.println();

    System.out.print("What was the third test out of?: ");
    double third = input.nextDouble();
    System.out.print("What mark did you get?: ");
    double thirdmark = input.nextDouble();
    System.out.println();

    System.out.print("What was the fourth test out of?: ");
    double fourth = input.nextDouble();
    System.out.print("What mark did you get?: ");
    double fourthmark = input.nextDouble();
    System.out.println();

    System.out.print("What was the fifth test out of?: ");
    double fifth = input.nextDouble();
    System.out.print("What mark did you get?: ");
    double fifthmark = input.nextDouble();
    System.out.println();

    System.out.println("Test scores for " + name);
    double perfirst = firstmark/first;
    System.out.println("Test 1: " + perfirst + "%");
    double persecond = secondmark/second;
    System.out.println("Test 1: " + persecond + "%");
    double perthird = thirdmark/third;
    System.out.println("Test 1: " + perthird + "%");
    double perfourth = fourthmark/fourth;
    System.out.println("Test 1: " + perfourth + "%");
    double perfifth = fifthmark/fifth;
    System.out.println("Test 1: " + perfifth + "%");
    double total = perfirst + persecond + perthird + perfourth + perfifth;
    double average = total/5;
    System.out.println("Average: " + average + "%");
    }
}
