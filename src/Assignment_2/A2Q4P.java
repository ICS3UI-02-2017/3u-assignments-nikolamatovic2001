/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author maton0870
 */
public class A2Q4P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // create a castle for the guard
        City nm = new City();
        
        // put a guard in nm
        RobotSE rob = new RobotSE(nm, 0, 0, Direction.EAST);
        
        // create a tower in Java's castle in the city
        new Wall(nm, 1, 1, Direction.WEST);
        new Wall(nm, 1, 1, Direction.EAST);
        new Wall(nm, 1, 1, Direction.NORTH);
        new Wall(nm, 1, 1, Direction.SOUTH);
        // create a tower in Java's castle in the city
        new Wall(nm, 1, 4, Direction.WEST);
        new Wall(nm, 1, 4, Direction.EAST);
        new Wall(nm, 1, 4, Direction.NORTH);
        new Wall(nm, 1, 4, Direction.SOUTH);
        // create a tower in Java's castle in the city
        new Wall(nm, 4, 1, Direction.WEST);
        new Wall(nm, 4, 1, Direction.EAST);
        new Wall(nm, 4, 1, Direction.NORTH);
        new Wall(nm, 4, 1, Direction.SOUTH);
        // create a tower in Java's castle in the city
        new Wall(nm, 4, 4, Direction.WEST);
        new Wall(nm, 4, 4, Direction.EAST);
        new Wall(nm, 4, 4, Direction.NORTH);
        new Wall(nm, 4, 4, Direction.SOUTH);
        // create Java's castle in the city
        new Wall(nm, 2, 2, Direction.WEST);
        new Wall(nm, 2, 2, Direction.NORTH);
        new Wall(nm, 2, 3, Direction.EAST);
        new Wall(nm, 2, 3, Direction.NORTH);
        new Wall(nm, 3, 2, Direction.WEST);
        new Wall(nm, 3, 2, Direction.SOUTH);
        new Wall(nm, 3, 3, Direction.EAST);
        new Wall(nm, 3, 3, Direction.SOUTH);
        
        // loops the command forever, the guard patrols the castle
        while(true){
        rob.move(2);
        rob.turnRight();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.turnRight();
        rob.move(2);
        rob.turnRight();
           }
        }
    }

