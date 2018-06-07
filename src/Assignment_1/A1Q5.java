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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a Supermarket for the karel and maria
        City sm = new City();

        // put karel in sm
        RobotSE karel = new RobotSE(sm, 3, 3, Direction.EAST);

        // put a robot in sm
        RobotSE maria = new RobotSE(sm, 0, 1, Direction.WEST);

        //label karel with a K
        karel.setLabel("K");

        //label maria with a M
        maria.setLabel("M");

        //create a set of walls in the supermarket
        new Wall(sm, 2, 3, Direction.WEST);
        new Wall(sm, 2, 3, Direction.NORTH);
        new Wall(sm, 2, 3, Direction.EAST);
        new Wall(sm, 3, 3, Direction.EAST);
        new Wall(sm, 3, 3, Direction.SOUTH);

        //creat karel's expensive items on the ground
        new Thing(sm, 0, 0, Direction.NORTH);
        new Thing(sm, 1, 0, Direction.NORTH);
        new Thing(sm, 1, 1, Direction.NORTH);
        new Thing(sm, 1, 2, Direction.NORTH);
        new Thing(sm, 2, 2, Direction.NORTH);

        //karel turns around
        karel.turnAround();

        //karel moves forward once
        karel.move();

        //maria moves forward once
        maria.move();

        //maria picks up the expnsive item
        maria.pickThing();

        //maria turns left
        maria.turnLeft();

        //karel turns right
        karel.turnRight();

        //karel moves forward 
        karel.move();

        //karel picks up his expensive item
        karel.pickThing();

        //maria moves forward once
        maria.move();

        //maria picks up thing
        maria.pickThing();

        //karel moves foward once
        karel.move();

        //karel picks up expensive items
        karel.pickThing();

        //maria turns left
        maria.turnLeft();

        //maria moves forward
        maria.move();

        //karel turns left
        karel.turnLeft();

        //maria picks up the expensive item
        maria.pickThing();

    }
}
