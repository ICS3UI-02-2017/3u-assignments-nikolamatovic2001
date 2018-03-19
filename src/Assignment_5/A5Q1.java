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
            Scanner input = new Scanner(System.in);
            System.out.println("Write your sentence in English: ");
            String sent = input.nextLine();

            //puts all in lowercase 9sanitize it
            sent = sent.toLowerCase();

            int length = sent.length();
            for (int i = 0; i < length; i++) {
                if (sent.charAt(i) == 'a'
                        || sent.charAt(i) == 'e'
                        || sent.charAt(i) == 'i'
                        || sent.charAt(i) == 'o'
                        || sent.charAt(i) == 'u') {
                    sent = sent.replace("u", "ubu");
                    sent = sent.replace("a", "uba");
                    sent = sent.replace("e", "ube");
                    sent = sent.replace("i", "ubi");
                    sent = sent.replace("o", "ubo");
                }
            }
        }
        // if (sent.contains("eau")) {
        //   sent = sent.substring(0);

        //}
        //if (sent.contains("oo")) {
        //     sent = sent.replace("oo", "uboo");
        // }
        //  if (sent.contains("ie")) {
        //      sent = sent.replace("ie", "ubie");
        //  }
        //  if (sent.contains("ubeau")) {     
        //   }
        //  if (sent.contains("uboo")) {
        //       String s = sent.substring(0);
        //   }
        //   if (sent.contains("ubie")) {
        //       String t = sent.substring(0);
        //   }
        //   if (sent.contains("u")) {
        //       sent = sent.replace("u", "ubu");
        //   }
        //   if (sent.contains("a")) {
        //      sent = sent.replace("a", "uba");
        //  }
        //  if (sent.contains("i")) {
        //      sent = sent.replace("i", "ubi");
        //  }
        //  if (sent.contains("e")) {
        //      sent = sent.replace("e", "ube");
        //  }
        //  if (sent.contains("o")) {
        //      sent = sent.replace("o", "ubo");
        //  }  
        System.out.println(sent);
    }
}
