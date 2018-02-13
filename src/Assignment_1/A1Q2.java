/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author maton0870
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a City for the Robot
        City nm = new City();
        
        // put a robot in nm
        RobotSE rob = new RobotSE(nm, 1, 2, Direction.SOUTH);
        
        // create a wall in the city
        new Wall(nm, 1, 2, Direction.NORTH);
        new Wall(nm, 1, 2, Direction.EAST);
        new Wall(nm, 1, 2, Direction.SOUTH);
        new Wall(nm, 1, 1, Direction.NORTH);
        new Wall(nm, 1, 1, Direction.WEST);
        new Wall(nm, 2, 1, Direction.WEST);
        new Wall(nm, 2, 1, Direction.SOUTH);
        new Thing(nm, 2, 2, Direction.EAST);
        
        // turn right once
        rob.turnRight();
        
        // move forward one space
        rob.move();
       
        // turn left once
        rob.turnLeft();
        
        // move forward once
        rob.move();
        
        // turn left once
        rob.turnLeft();
        
        //move forward once
        rob.move();
        
        // rob pickus up the thing
        rob.pickThing();
        
        // rob turns around
        rob.turnAround();
        
        //rob moves forward once
        rob.move();
        
        //rob turns right once
        rob.turnRight();
        
        //rob moves forward once
        rob.move();
        
         //rob turns right once
        rob.turnRight();
        
        //rob moves forward once
        rob.move();
        
         //rob turns right once
        rob.turnRight();
    }
}
