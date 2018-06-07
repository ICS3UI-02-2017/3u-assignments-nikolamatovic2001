/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author maton0870
 */
public class A2Q2P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a City for the Robot
        City nm = new City();

        // put a robot in nm
        RobotSE rob = new RobotSE(nm, 2, 0, Direction.EAST);

        // create a hurdle track in the city
        new Wall(nm, 2, 0, Direction.SOUTH);
        new Wall(nm, 2, 1, Direction.SOUTH);
        new Wall(nm, 2, 2, Direction.SOUTH);
        new Wall(nm, 2, 3, Direction.SOUTH);
        new Wall(nm, 2, 4, Direction.SOUTH);
        new Wall(nm, 2, 5, Direction.SOUTH);
        new Wall(nm, 2, 6, Direction.SOUTH);
        new Wall(nm, 2, 7, Direction.SOUTH);
        new Wall(nm, 2, 8, Direction.SOUTH);
        new Wall(nm, 2, 0, Direction.EAST);
        new Wall(nm, 2, 1, Direction.EAST);
        new Wall(nm, 2, 3, Direction.EAST);
        new Wall(nm, 2, 6, Direction.EAST);

        //create a finish line at the end
        new Thing(nm, 2, 8, Direction.SOUTH);

        //rob will stop on the finish line
        while (!rob.canPickThing()) {

            //if rob is not beside the track he will do the command
            if (!rob.isBesideThing(IPredicate.aWall)) {
                rob.turnRight();
            }

            // if the front is clear rob moves
            if (rob.frontIsClear()) {
                rob.move();

                //if the front is not clear he follows the command
            } else {
                rob.turnLeft();
            }
        }
    }
}
