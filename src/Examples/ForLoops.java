/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author maton0870
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a City for the Robot
        City nm = new City();
        
        // put a robot in nm
        RobotSE rob = new RobotSE(nm, 1, 1, Direction.EAST);
        
       
        //counted while loop
        int numberOfMoves = 5;
        // if there are still moves to do
        while(numberOfMoves > 0){
            rob.move(); 
            numberOfMoves = numberOfMoves - 1;
        }
        
        rob.turnAround();
        
        //counting the other way
        numberOfMoves = 0;
        while(numberOfMoves < 5){
            rob.move();
            numberOfMoves = numberOfMoves + 1;
        }
        
        rob.turnAround();
        //use a loop to move
        for(int count = 0; count < 5; count++){
            rob.move();
        
        }
        
        int shortcut = 10;
        shortcut = shortcut + 5;  //adds 5
        shortcut += 5; //also add 5 but quicker (-= is for subtraction)
    }
}