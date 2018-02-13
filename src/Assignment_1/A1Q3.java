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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          // Create a City for the Robot
        City nm = new City();
        
        // put a robot in nm
        RobotSE rob = new RobotSE(nm, 3, 0, Direction.EAST);
        
        // place a flag in the city
        new Thing(nm, 3, 1, Direction.NORTH);
        
        //creating a mountain
        new Wall(nm, 3, 2, Direction.WEST);
        new Wall(nm, 3, 2, Direction.NORTH);
        new Wall(nm, 3, 4, Direction.EAST);
        new Wall(nm, 2, 3, Direction.WEST);
        new Wall(nm, 1, 3, Direction.WEST);
        new Wall(nm, 1, 3, Direction.NORTH);
        new Wall(nm, 1, 3, Direction.EAST);
        new Wall(nm, 2, 4, Direction.NORTH);
        new Wall(nm, 2, 4, Direction.EAST);
        
        // rob moves forward one
        rob.move();
        
        // rob picks up the flag
        rob.pickThing();
        
        //rob turns left
        rob.turnLeft();
        
        //rob move forward one
        rob.move();
        
        //rob turns right
        rob.turnRight();
        
        //rob moves forward once
        rob.move();
        
        //rob turns left
        rob.turnLeft();
        
        //rob moves forward twice
        rob.move(2);
        
        //rob turns right
        rob.turnRight();
        
        //rob moves forward one
        rob.move();
        
        //rob plants the flag on top of the mountain
        rob.putThing();
        
        //rob moves forward once
        rob.move();
        
        //rob turns right
        rob.turnRight();
        
        //rob moves forward once
        rob.move();
        
        //rob turns left 
        rob.turnLeft();
        
        //rob moves forward once
        rob.move();
        
        //rob turns right
        rob.turnRight();
        
        //rob moves forward twice
        rob.move(2);
        
        //rob turns left
        rob.turnLeft();
    }
}
