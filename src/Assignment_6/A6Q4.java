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

        Scanner input = new Scanner(System.in);
        System.out.println("Please input the 10 marks down below; ");

        int[] sort = new int[10];

        for (int x = 0; x < sort.length - 1; x++) {
            int num = input.nextInt();
            sort[x] = num;

            for (int y = x + 1; y < sort.length; y++) {
                if (sort[x] > sort[y]) {
                    int store = sort[x];
                    sort[x] = sort[y];
                    sort[y] = store;
                }
                System.out.print(sort[x]);
            }
        }
    }
}