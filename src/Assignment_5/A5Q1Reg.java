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
public class A5Q1Reg {

    public static void main(String[] args) {

        while (true) {
            //Write your sentence in English
            Scanner input = new Scanner(System.in);
            System.out.println("Write your sentence in English: ");
            String sent = input.nextLine();

            //Adds ub before a vowel or string of vowels 
            System.out.println("Here is your sentence in Ubbi Dubbi: ");
            System.out.println(sent.replaceAll("(?i)(a|e|i|o|u|A|E|I|O|U)+", "ub$0"));
            System.out.println();
        }
    }
}
