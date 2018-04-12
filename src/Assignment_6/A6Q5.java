/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author maton0870
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Asks the user to input the amount of numbers and the actual numbers
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers are you sorting: ");
        int arraySize = input.nextInt();
        System.out.println("Please input your " + arraySize + " numbers down below:");
        
        //Creates an int array dependening on the size inputted above
        int[] sort = new int[arraySize];

        //Puts numbers into the array
        for (int x = 0; x < sort.length; x++) {
            int num = input.nextInt();
            sort[x] = num;
        }
        //Sorts the numbers from smallest to biggest
        for (int x = 0; x < sort.length - 1; x++) {
            for (int y = x + 1; y < sort.length; y++) {
                if (sort[x] > sort[y]) {
                    int store = sort[x];
                    sort[x] = sort[y];
                    sort[y] = store;
                }
            }
        }
        //Outputs the numbers 
        System.out.println("Here are your numbers in ascending order: " + Arrays.toString(sort));
      
        if(arraySize%2 == 0){           
             double medOddHigh = arraySize/2 + 1;
             double High = sort[(int)medOddHigh];
             double medOddLow = arraySize/2;   
             double Low = sort[(int)medOddLow];
             double medOddTemp = High + Low;
             double Odd = medOddTemp/2;
             System.out.print("Here is the median: " + Odd);       
        }else{
            int medEven = arraySize/2;
            int Even = sort[medEven];
            System.out.print("Here is the median: " + Even);
        }       
    }
}