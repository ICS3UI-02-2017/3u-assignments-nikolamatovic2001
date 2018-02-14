/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author maton0870
 */
public class ConditionsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a City for the Robot
        City nm = new City();
        
        // put a robot in nm
        RobotSE rob = new RobotSE(nm, 2, 1, Direction.EAST);
        
        // create a wall infront of rob
        new Wall(nm, 2, 5, Direction.EAST);
        new Wall(nm, 2, 2, Direction.NORTH);
        new Wall(nm, 10, 5, Direction.SOUTH);
        new Wall(nm, 10, 1, Direction.EAST);
        
        
        while(true){ 
      
        while(rob.frontIsClear()){
            rob.move();
        }
        while(!rob.frontIsClear()){
            rob.turnRight();
            }
        }
    }
}
 