/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author maton0870
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a crop field for the farmer
        City nm = new City();

        // put a farmer with 20 seeds in nm
        RobotSE rob = new RobotSE(nm, 1, 1, Direction.EAST, 20);

        //set loop as a variable
        int loop = 20;

        //the farmer sets the first field of seeds
        while (loop > 15) {
            rob.putThing();
            rob.move();
            loop -= 1;
        }

        // turns to get in place to set the second field
        rob.turnRight();
        rob.move();
        rob.turnRight();
        rob.move();

        //the farmer sets the second field of seeds
        while (loop > 10) {
            rob.putThing();
            rob.move();
            loop -= 1;
        }

        // turns to get in place to set the third field
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.move();

        //the farmer sets the third field of seeds
        while (loop > 5) {
            rob.putThing();
            rob.move();
            loop -= 1;
        }

        // turns to get in place to set the last field
        rob.turnRight();
        rob.move();
        rob.turnRight();
        rob.move();

        //the farmer sets the last field of seeds
        while (loop > 0) {
            rob.putThing();
            rob.move();
            loop -= 1;
        }

        // turns to finish his day
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.move();
    }
}
