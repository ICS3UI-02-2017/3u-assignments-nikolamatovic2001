/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author maton0870
 */
public class A3Q4SecondSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a City for rob
        City nm = new City();

        // put rob in nm
        RobotSE rob = new RobotSE(nm, 3, 3, Direction.SOUTH);

        //creating 4 blocks in the city
        new Wall(nm, 1, 1, Direction.WEST);
        new Wall(nm, 1, 1, Direction.NORTH);
        new Wall(nm, 1, 2, Direction.EAST);
        new Wall(nm, 1, 2, Direction.NORTH);
        new Wall(nm, 2, 1, Direction.WEST);
        new Wall(nm, 2, 1, Direction.SOUTH);
        new Wall(nm, 2, 2, Direction.SOUTH);
        new Wall(nm, 2, 2, Direction.EAST);

        new Wall(nm, 1, 4, Direction.WEST);
        new Wall(nm, 1, 4, Direction.NORTH);
        new Wall(nm, 1, 5, Direction.EAST);
        new Wall(nm, 1, 5, Direction.NORTH);
        new Wall(nm, 2, 4, Direction.WEST);
        new Wall(nm, 2, 4, Direction.SOUTH);
        new Wall(nm, 2, 5, Direction.SOUTH);
        new Wall(nm, 2, 5, Direction.EAST);

        new Wall(nm, 4, 1, Direction.WEST);
        new Wall(nm, 4, 1, Direction.NORTH);
        new Wall(nm, 4, 2, Direction.EAST);
        new Wall(nm, 4, 2, Direction.NORTH);
        new Wall(nm, 5, 1, Direction.WEST);
        new Wall(nm, 5, 1, Direction.SOUTH);
        new Wall(nm, 5, 2, Direction.SOUTH);
        new Wall(nm, 5, 2, Direction.EAST);

        new Wall(nm, 4, 4, Direction.WEST);
        new Wall(nm, 4, 4, Direction.NORTH);
        new Wall(nm, 4, 5, Direction.EAST);
        new Wall(nm, 4, 5, Direction.NORTH);
        new Wall(nm, 5, 4, Direction.WEST);
        new Wall(nm, 5, 4, Direction.SOUTH);
        new Wall(nm, 5, 5, Direction.SOUTH);
        new Wall(nm, 5, 5, Direction.EAST);

        //goes around all 4 blocks
        for (int loop = 0; loop < 4; loop++) {
            for (int loopmini = 0; loopmini < 3; loopmini++) {
                rob.move(3);
                rob.turnLeft();
            }
            rob.move(3);
        }
    }
}