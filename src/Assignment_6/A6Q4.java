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
        
        int [] nonSort = new int[9];
        int[] sort = new int[9];
        int store;
        
        for (int y = 0; y <= nonSort.length; y++) {
            int num = input.nextInt();
            for (int x = y+1; x < nonSort.length; x++) {
                if (sort[y] > sort[x]) {
                    store = nonSort[y];
                    nonSort[y] = nonSort[x];
                    nonSort[x] = store;
                    sort = nonSort;
                }
            } 
        }
        System.out.println("here " + sort);
    }
}
