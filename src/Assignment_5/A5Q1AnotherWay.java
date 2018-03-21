/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_5;

import java.util.Scanner;

/**
 *
 * @author maton0870
 */
public class A5Q1AnotherWay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while (true) {
            // asks to put english sentence to be translated
            Scanner input = new Scanner(System.in);
            System.out.println("Write your sentence in English: ");
            String sent = input.nextLine();

            //puts all letters in lowercase (sanitizes it)
            sent = sent.toLowerCase();


            int length = sent.length();
            for (int i = 0; i < length; i++) {
                if (sent.charAt(i) == 'a'
                        || sent.charAt(i) == 'e'
                        || sent.charAt(i) == 'i'
                        || sent.charAt(i) == 'o'
                        || sent.charAt(i) == 'u') {
                    String start = sent.substring(i);
                    String end = sent.substring(0, i);
                    String fin = end + "ub" + start;
                    System.out.println(fin);
                }
            }
        }
    }
}
