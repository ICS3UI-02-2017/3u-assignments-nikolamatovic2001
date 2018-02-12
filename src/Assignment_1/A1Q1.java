/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author maton0870
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a city
        City nm = new City ();
        
        // Create a robot in the city
        RobotSE rob = new RobotSE(nm, 0, 2, Direction.WEST);
        
        // Create the box as shown in the assignment in classroom
        new Wall(nm, 1, 1, Direction.WEST);
        new Wall(nm, 2, 1, Direction.SOUTH);
        new Wall(nm, 1, 2, Direction.NORTH);
        new Wall(nm, 1, 1, Direction.NORTH);
        new Wall(nm, 1, 2, Direction.EAST);
        new Wall(nm, 2, 2, Direction.EAST);
        new Wall(nm, 2, 1, Direction.WEST);
        new Wall(nm, 2, 2, Direction.SOUTH);
        
        // move the robot forwards two spaces
        rob.move(2);
        
        // turn the robot left once
        rob.turnLeft();
        
        // move forward three spaces
        rob.move(3);
        
        // turn left once
        rob.turnLeft();
        
         // move forward three spaces
        rob.move(3);
        
        // turn left once
        rob.turnLeft();
        
        // move forward three spaces
        rob.move(3);
        
        // turn left once
        rob.turnLeft();
        
        // move forward one space
        rob.move();
    }
}
