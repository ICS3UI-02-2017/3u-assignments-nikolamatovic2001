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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int finish = 1;
        while (finish < 100) {
            // put the number of the dice roll
            System.out.print("Enter sum of dice: ");
            int sum = input.nextInt();
            // quits program if the number is not between 2 and 12
            if (sum < 2 || sum > 12) {
                System.out.println("You Quit");
                System.exit(sum);
               
            } else {
                finish = sum + finish;
               // all the snakes and ladders
                if (finish == 54) {
                    finish = 19;
                }
                if (finish == 90) {
                    finish = 48;
                }
                if (finish == 99) {
                    finish = 77;
                }
                if (finish == 9) {
                    finish = 34;
                }
                if (finish == 40) {
                    finish = 64;
                }
                if (finish == 67) {
                    finish = 86;
                }
                if (finish > 100) {
                    finish = finish - sum;
                }
                // tells you what square you are on
                System.out.println("You are now on square " + finish);
                // finishes if you are on square one hundred
                if (finish == 100) {
                    System.out.println("You Win!");
                }
            }
        }
    }
}
