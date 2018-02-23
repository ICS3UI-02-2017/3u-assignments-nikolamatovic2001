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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // create a city for the robot
        City nm = new City();
        
        // put a robot in nm
        RobotSE rob = new RobotSE(nm, 0, 2, Direction.WEST);
        
        //create a square in the city
        new Wall(nm, 1, 1, Direction.NORTH);
        new Wall(nm, 1, 1, Direction.WEST);
        new Wall(nm, 2, 1, Direction.SOUTH);
        new Wall(nm, 2, 1, Direction.WEST);
        new Wall(nm, 1, 2, Direction.NORTH);
        new Wall(nm, 1, 2, Direction.EAST);
        new Wall(nm, 2, 2, Direction.SOUTH);
        new Wall(nm, 2, 2, Direction.EAST);
        
        //set loop equal to 2 for the robot
        int loop = 0;
        
        //loops the command twice
        while(loop < 2){
        //rob moves around the square
            rob.move(2);
            rob.turnLeft();
            rob.move(3);
            rob.turnLeft();
            rob.move(3);
            rob.turnLeft();
            rob.move(3);
            rob.turnLeft();
            rob.move();
            loop += 1;
        }
    }
}
