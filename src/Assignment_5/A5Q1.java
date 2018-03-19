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
        System.out.print("Write your sentence in English: ");
        String sent = input.nextLine();
        
        sent = sent.substring(0);
        if (sent.contains("eau")){
        sent = sent.replace("eau", "ubeau");
        
        }
        
        
        if(sent.contains("u")){
        sent = sent.replace("u" , "ubu");
        }
        if(sent.contains("a")){
        sent = sent.replace("a" , "uba");
        }
        if(sent.contains("e")){
        sent = sent.replace("e" , "ube");
        }
        if(sent.contains("i")){
        sent = sent.replace("i" , "ubi");
        }
        if(sent.contains("o")){
        sent = sent.replace("o" , "ubo");
        }
        System.out.println(sent);
    }
}
