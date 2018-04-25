/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

import java.util.Scanner;

/**
 * @author maton0870
 */
public class A7Q2 {

    public static void examGrade(int grade) {
        //Checks your mark and tells you your grade due to your number
        if (grade < 50) {
            System.out.println("Your grade is a F");
        } else if (grade == 50 || grade <= 59) {
            System.out.println("Your grade is a D");
        } else if (grade == 60 || grade <= 69) {
            System.out.println("Your grade is a C");
        } else if (grade == 70 || grade <= 79) {
            System.out.println("Your grade is a B");
        } else if (grade >= 80) {
            System.out.println("Your grade is an A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tells you your grade from your mark
        System.out.print("Please write your exam mark: ");
        Scanner input = new Scanner(System.in);
        examGrade(input.nextInt());
    }
}
