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
        
        //set a loop variable
        int loop = 0;
        
        //loops 10 times
        while(loop < 10){
            rob.pickThing();
            rob.move();
            rob.putThing();
            rob.turnAround();
            rob.move();
            rob.turnAround();
            loop += 1;
        }
        //moves on top of pile
        rob.move();
    }
}
