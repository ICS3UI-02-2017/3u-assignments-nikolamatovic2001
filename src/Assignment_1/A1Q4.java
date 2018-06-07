/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author maton0870
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a City for the Robot
        City nm = new City();

        // put a robot in nm
        RobotSE rob1 = new RobotSE(nm, 0, 0, Direction.SOUTH);

        // put a robot in nm
        RobotSE rob2 = new RobotSE(nm, 0, 1, Direction.SOUTH);

        //creating new walls
        new Wall(nm, 0, 1, Direction.WEST);
        new Wall(nm, 1, 1, Direction.WEST);
        new Wall(nm, 1, 1, Direction.SOUTH);

        //moves rob2 forward once
        rob2.move();

        //rob2 turns left
        rob2.turnLeft();

        //rob2 moves forward once
        rob2.move();

        //rob1 moves forward once
        rob1.move();

        //rob2 turns left
        rob2.turnRight();

        //rob1 moves forward once
        rob1.move();

        //rob2 moves forward once
        rob2.move();

        //rob1 turns left
        rob1.turnLeft();

        //rob2 turns right
        rob2.turnRight();

        //rob1 moves forward once
        rob1.move();

        //rob2 moves forward once
        rob2.move();
    }
}
