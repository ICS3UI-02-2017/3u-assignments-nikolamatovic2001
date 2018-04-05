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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the 10 marks down below; ");

        int[] sort = new int[10];
        for (int i = 0; i < sort.length; i++) {
            int num = input.nextInt();
            sort[i] = num;
        }
        for (int i = 0; i < sort.length; i++) {
            if (sort[i] < sort[i + 1]) {              
               
                System.out.print(sort[i]);
            }
        }
    }
}
