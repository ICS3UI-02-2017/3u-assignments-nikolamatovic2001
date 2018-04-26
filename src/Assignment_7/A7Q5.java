/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

import java.util.Scanner;

/**
 *
 * @author maton0870
 */
public class A7Q5 {

    public static void chaotic(int row) {
        //Asks how many lines you would like
        for (int i = 0; i < row; i++) {
            String ast = "";
            //Randomely generates the amount of asteriks
            int num = (int) (Math.random() * ((5 - 1) + 1)) + 1;
            for (int j = 0; j < num; j++) {
                ast = ast + "*";
            }
            System.out.println(ast);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Outprints the asteriks
        System.out.print("How many lines would you like: ");
        Scanner input = new Scanner(System.in);
        chaotic(input.nextInt());
    }
}
