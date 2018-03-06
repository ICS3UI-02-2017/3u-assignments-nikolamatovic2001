/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author maton0870
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        int finish = 1;
        while(finish != 100){    
        System.out.print("Enter sum of dice: ");
        int sum = input.nextInt();
        if(sum <2 ||sum >12){
        System.out.println("You Quit");
        System.exit(sum);
        }else{
        finish = sum + finish;
        System.out.println("You are now on square " + finish);
        if (finish == 54){
        finish = 19; }
        if (finish == 90){
        finish = 48; }
        if (finish == 99){
        finish = 77; }
        if (finish == 9){
        finish = 34; }
        if (finish == 40){
        finish = 64; }
        if (finish == 67){
        finish = 86; }
        }
       }
     System.out.println("You Win!");  
  }
}
