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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // asks to put the cost of all the items
        Scanner input = new Scanner(System.in);
        System.out.print("How much does the food for the prom cost? : ");
        int addone = input.nextInt();
        System.out.print("How much does the DJ cost? : ");
        int addtwo = input.nextInt();
        System.out.print("How much does it cost to rent the hall? : ");
        int addthree = input.nextInt();
        System.out.print("How much does decorations cost? : ");
        int addfour = input.nextInt();
        System.out.print("How much does it cost for staff? : ");
        int addfive = input.nextInt();
        System.out.print("How much for miscellaneous costs? : ");
        int addsix = input.nextInt();

        // gives the total and the amount of tickets needed to be sold
        double total = addone + addtwo + addthree + addfour + addfive + addsix;
        System.out.print("The total cost is " + total + ". ");
        double div = total / 35.0;
        double round = Math.ceil(div);
        System.out.println("You will need to sell " + round + " tickets to break even.");
    }
}
