/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author maton0870
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a City for the Robot
        City nm = new City();
        
        // put a robot in nm
        RobotSE rob = new RobotSE(nm, 2, 1, Direction.EAST);
        
        //create 10 things in one pile
        new Thing(nm, 2, 1, Direction.EAST);
        new Thing(nm, 2, 1, Direction.EAST);
        new Thing(nm, 2, 1, Direction.EAST);
        new Thing(nm, 2, 1, Direction.EAST);
        new Thing(nm, 2, 1, Direction.EAST);
        new Thing(nm, 2, 1, Direction.EAST);
        new Thing(nm, 2, 1, Direction.EAST);
        new Thing(nm, 2, 1, Direction.EAST);
        new Thing(nm, 2, 1, Direction.EAST);
        new Thing(nm, 2, 1, Direction.EAST);
        
        //see the amount of thigns in a pile
        nm.showThingCounts(true);

        //loops 10 times
        for(int loop = 0; loop < 10; loop++){
            rob.pickThing();
            rob.move();
            rob.putThing();
            rob.turnAround();
            rob.move();
            rob.turnAround(); 
        }
       
        //moves on top of pile
        rob.move();
    }
}
