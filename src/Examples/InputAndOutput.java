/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author maton0870
 */
public class InputAndOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * int = interger
         * char = character, single letter
         * boolean = true or false 
         * double = decimals
         */
      
        //prints on one line, then makes a new one
        System.out.println("Hello World");
        System.out.println("Another Line!");
        
        //shortcut for the above command (sout then hit tab)
        
        //prints on the same line
        System.out.print("I like ");
        System.out.print("Cake! ");
        
        //special characters (quotation marks etc.) (escape characters)
        
        //quotation marks
        System.out.println("\"I'm inside quotation marks\"");
        
        //slash
        System.out.println("A slash \\");
        
        //tab
        System.out.println("\t is a tab. pizza \tsoda \tcake");
        
        //new lines in the same statement   \n
        System.out.println("One line. \nSecond line");
        
        //outputting variabel to the screen
        int number = 21;
        System.out.println("number = " + number);
        System.out.println("number = " + number + ". YAY!");
      
        System.out.println("");
        System.out.println("");
        System.out.println("");
       
        System.out.println("Please enter your name:");
        // use a Scanner to read info
        Scanner input = new Scanner(System.in);
        // string is used to store words 
        String name = input.nextLine();
        // say hello
        System.out.println("Hello " + name +".");
        System.out.println("What year were you born?");
        // make a variable for birth year
        int birthYear = input.nextInt();
        int age = 2018 - birthYear;
        // idiot loop
        while(age<=0){
            System.out.println("Try again.");
            birthYear = input.nextInt();
            age = 2018 - birthYear;
        }
        // tell the user
        System.out.println("You are " + age + " years old.");
        if(age<=0){
            System.out.println("I don't think so.");
        }else if(age>=30){
            System.out.println("You are pretty old.");
        }
    }
}
