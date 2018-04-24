/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

/**
 *
 * @author maton0870
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Here are all the prime numbers up to 1000: ");

        //Sets all the numers to true
        boolean prime[] = new boolean[1000];
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }
        for (int n = 2; n * n <= 1000; n++) {
            //If prime[p] is not changed, it is a prime number
            if (prime[n] == true) {
                //If prime[p] is changed, it is not a prime number
                for (int i = n * 2; i < 1000; i += n) {
                    prime[i] = false;
                }
            }
        }
        //Tells you all the prime numbers
        for (int i = 2; i < 1000; i++) {
            if (prime[i] == true) {
                System.out.print(i + ", ");
            }
        }
    }
}