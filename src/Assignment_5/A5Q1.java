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

        while (true) {
            // asks to put english sentence to be translated
            Scanner input = new Scanner(System.in);
            System.out.println("Write your sentence in English: ");
            String sent = input.nextLine();

            //puts all letters in lowercase (sanitizes it)
            sent = sent.toLowerCase();

            // translates your sentence to Ubbi Dubbi
            if (sent.contains("u")) {
                sent = sent.replace("u", "ubu");
            }
            if (sent.contains("a")) {
                sent = sent.replace("a", "uba");
            }
            if (sent.contains("i")) {
                sent = sent.replace("i", "ubi");
            }
            if (sent.contains("e")) {
                sent = sent.replace("e", "ube");
            }
            if (sent.contains("o")) {
                sent = sent.replace("o", "ubo");
            }
            if (sent.contains("uboubo")) {
                sent = sent.replace("uboubo", "uboo");
            }
            if (sent.contains("ubeubaubu")) {
                sent = sent.replace("ubeubaubu", "ubeau");
            }
            if (sent.contains("ubiube")) {
                sent = sent.replace("ubiube", "ubie");
            }
            if (sent.contains("uboubu")) {
                sent = sent.replace("uboubu", "ubou");
            }
            if (sent.contains("ubaube")) {
                sent = sent.replace("ubaube", "ubae");
            }

            // prints sentence in Ubbi Dubbi
            System.out.println("Here is your sentence in Ubbi Dubnbi: ");
            System.out.println(sent);
        }
    }
}
