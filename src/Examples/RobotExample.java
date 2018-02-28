/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Learning how to use the Robots
 * @author maton0870
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        // Create a City for the Robot
        City nm = new City();
        
        // put a robot in nm
        RobotSE rob = new RobotSE(nm, 2, 3, Direction.EAST);
        
        // create a wall in the city
        new Wall(nm, 4, 5, Direction.WEST);
        new Wall(nm, 3, 5, Direction.WEST);
        new Wall(nm, 2, 5, Direction.WEST);
        new Wall(nm, 1, 5, Direction.WEST);
        new Wall(nm, 0, 5, Direction.WEST);
        new Wall(nm, 5, 5, Direction.WEST);
        new Wall(nm, 6, 5, Direction.WEST);
        new Wall(nm, 7, 5, Direction.WEST);
        new Wall(nm, 8, 5, Direction.WEST);
        new Wall(nm, 9, 5, Direction.WEST);
     
        // create a thing
        new Thing(nm, 3, 4, Direction.NORTH);
        
        // put a letter or word on the robot
        rob.setLabel("R");
        
        // set the colour of the robot
        rob.setColor(Color.yellow);
        
        // move the robot forward one space
        rob.move();
        
        // turn the robot left
        rob.turnRight();
        
        // move the robot n number of spaces
        rob.move();
        
        // make the robot pickup the thing
        rob.pickThing();
        
        //move the robot
        rob.move (7);
        
        // robot puts the thing down
        rob.putThing();
        
        // makes the robot turn left
        rob.turnLeft();
        
        // makes the robot move forward two spaces
        rob.move(2);
  }
}
