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

/**
 *
 * @author maton0870
 */
public class A2Q1P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create a city
        City nm = new City();

        //Create a robot in the city
        RobotSE rob = new RobotSE(nm, 1, 1, Direction.EAST);

        //Creating 10 things in a line
        new Thing(nm, 1, 2, Direction.EAST);
        new Thing(nm, 1, 3, Direction.EAST);
        new Thing(nm, 1, 4, Direction.EAST);
        new Thing(nm, 1, 5, Direction.EAST);
        new Thing(nm, 1, 6, Direction.EAST);
        new Thing(nm, 1, 7, Direction.EAST);
        new Thing(nm, 1, 8, Direction.EAST);
        new Thing(nm, 1, 9, Direction.EAST);
        new Thing(nm, 1, 10, Direction.EAST);
        new Thing(nm, 1, 11, Direction.EAST);



        //moves rob forward once
        rob.move();

        // rob will check to see if he has less the 7 things in his backpack
        while (rob.countThingsInBackpack() < 7) {

            // rob picks up thing and moves forward one
            rob.pickThing();
            rob.move();

            // rob will check to see if he has less the 7 things in his backpack
            if (rob.countThingsInBackpack() == 7) {

                rob.move(3);

            }
        }
    }
}
