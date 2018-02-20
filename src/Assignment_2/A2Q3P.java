/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;

/**
 *
 * @author maton0870
 */
public class A2Q3P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a City for the Robot
        City nm = new City();
        
        // put a robot in nm
        RobotSE rob = new RobotSE(nm, 5, 5, Direction.EAST);
       
        // if rob is not facing north turn left until he is 
        while(!rob.isFacingNorth()){
           rob.turnLeft();
       }
    
        // if rob is not on street zero repeat this command
            while(rob.getStreet() != 0) {
             
                // if rob is facing north move
                if(rob.isFacingNorth()){
                  rob.move();
                          }
    }
            //// if rob is not facing west turn left until he is 
             while(!rob.isFacingWest()){
           rob.turnLeft();
       }
           // if rob is not on avenue zero repeat this command
             while(rob.getAvenue() != 0){
         
                 // if rob is facing west move
                if(rob.isFacingWest()){
                  rob.move();
                          }
    }}}
