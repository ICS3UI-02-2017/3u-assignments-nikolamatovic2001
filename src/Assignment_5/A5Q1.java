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
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please put your sentence in English: ");

        String sentence = input.nextLine();
        System.out.print("Sentence in Ubbi Dubbi: ");
        System.out.println(sentence.replaceAll("a", "uba"));
        
    }
}
