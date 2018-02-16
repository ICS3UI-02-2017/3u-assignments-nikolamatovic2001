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
        RobotSE rob = new RobotSE(nm, 6, 8, Direction.EAST);
       
        
            while(rob.getStreet() != 0) {
          
            if(rob.getStreet() != 0){
            rob.move();
       
            if(rob.getAvenue() != 0){
            rob.move();
            }else{
                rob.turnLeft();
            }
            
            if(rob.getStreet() == 20){
                rob.turnRight();
            }
            if(rob.getAvenue() == 20){
                rob.turnAround();
            }
     }
    }
   }

}