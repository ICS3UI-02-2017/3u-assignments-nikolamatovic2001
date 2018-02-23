/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author maton0870
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create a home for the Robot
        City nm = new City();
        
        //put a robot in nm
        RobotSE rob = new RobotSE(nm, 4, 0, Direction.EAST);
        
        //creating the staricase
        new Wall(nm, 4, 2, Direction.WEST);
        new Wall(nm, 4, 2, Direction.NORTH);
        new Wall(nm, 3, 3, Direction.WEST);
        new Wall(nm, 3, 3, Direction.NORTH);
        new Wall(nm, 2, 4, Direction.NORTH);
        new Wall(nm, 2, 4, Direction.WEST);
        new Wall(nm, 2, 5, Direction.NORTH);
        new Wall(nm, 2, 5, Direction.EAST);
        new Wall(nm, 3, 6, Direction.NORTH);
        new Wall(nm, 3, 6, Direction.EAST);
        new Wall(nm, 4, 7, Direction.EAST);
        new Wall(nm, 4, 7, Direction.NORTH);
        
        //create the lightbulbs on the staircase
        new Thing(nm, 4, 1, Direction.NORTH);
        new Thing(nm, 3, 2, Direction.NORTH);
        new Thing(nm, 2, 3, Direction.NORTH);
        new Thing(nm, 1, 4, Direction.NORTH);
        
        //rob climbs to the top of the staircase picking up the lightbulbs
        rob.move();
        rob.pickThing();
        rob.turnLeft();
        rob.move();
        rob.turnRight();
        rob.move();
        rob.pickThing();
        rob.turnLeft();
        rob.move();
        rob.turnRight();
        rob.move();
        rob.pickThing();
        rob.turnLeft();
        rob.move();
        rob.turnRight();
        rob.move();
        rob.pickThing();
        
        //rob starts his descent placing the light bulbs on each step
        rob.move();
        rob.putThing();
        rob.move();
        rob.turnRight();
        rob.move();
        rob.putThing();
        rob.turnLeft();
        rob.move();
        rob.turnRight();
        rob.move();
        rob.putThing();
        rob.turnLeft();
        rob.move();
        rob.turnRight();
        rob.move();
        rob.putThing();
        rob.turnLeft();
        rob.move();
    }
}
