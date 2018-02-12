/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/**
 *
 * @author maton0870
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a city
        City nm = new City ();
        
        // Create a robot in the city
        RobotSE rob = new RobotSE(nm, 0, 2, Direction.WEST);
    }
}
