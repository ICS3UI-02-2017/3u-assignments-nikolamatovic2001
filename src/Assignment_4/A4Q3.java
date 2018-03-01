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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // place the four numbers down then it repeats it at the end in a list
        System.out.println("Please enter in 4 numbers on seperate lines:");
        Scanner input = new Scanner(System.in);
        String one = input.nextLine();
        String two = input.nextLine();
        String three = input.nextLine();
        String four = input.nextLine();
        System.out.print("Your numbers were " + one + ", ");
        System.out.print( two + ", ");
        System.out.print( three + ", and ");
        System.out.print(four);
    }
}
