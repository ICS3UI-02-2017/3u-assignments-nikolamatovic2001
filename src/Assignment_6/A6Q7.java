/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Arrays;

/**
 *
 * @author maton0870
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //
        System.out.println("Here are all the prime numbers from 2-1000:");
        int[] sieve = new int[999];
        int p = 2;
        for (int i = 0; i < sieve.length; i++) {
            sieve[i] = p;
            p = p + 1;
        }
        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i] % 2 == 0) {
                sieve[i] = 0;
                sieve[0] = 2;
            }
            if (sieve[i] % 3 == 0) {
                sieve[i] = 0;
                sieve[1] = 3;
            }
            if (sieve[i] % 5 == 0) {
                sieve[i] = 0;
                sieve[3] = 5;
            }
            if (sieve[i] % 7 == 0) {
                sieve[i] = 0;
                sieve[5] = 7;
            }
            if (sieve[i] % 8 == 0) {
                sieve[i] = 0;
            }
            if (sieve[i] % 11 == 0) {
                sieve[i] = 0;
                sieve[9] = 11;
            }
            if (sieve[i] % 13 == 0) {
                sieve[i] = 0;
                sieve[11] = 13;
            }
        }
        int[] prime = new int[167];
        for (int x = 0; x < sieve.length; x++) {
            if (sieve[x] != 0) {
                prime[x] = sieve[x];
            }
        }
        System.out.println(Arrays.toString(sieve));
        System.out.println(Arrays.toString(prime));
    }
}
