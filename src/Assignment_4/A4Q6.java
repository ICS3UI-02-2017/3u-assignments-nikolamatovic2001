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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //asks for your information to determine if you are speeding
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed limit: ");
        int limit = input.nextInt();
        System.out.print("Enter the recorded speed of the car: ");
        
        // sets variables for speeding
        int speed = input.nextInt();
        int fineOne = speed; 
        int fineTwo = speed;
        int fineThree = speed;
        int noFine = speed;
        
        // Tells you if you are speeding or not
        if (noFine < limit){
        System.out.println("Congratulations, you are within the speed limit!");
        }
       
        if(fineOne >= limit + 1 && fineOne <= limit + 20){
        System.out.println("You are speeding and your fine is $100.");
        }
       
        if(fineTwo >= limit + 21 && fineTwo <= limit + 30){
        System.out.println("You are speeding and your fine is $270.");
        }
        
        if(fineThree >= limit + 31){
        System.out.println("You are speeding and your fine is $500.");
        }
    }
}
