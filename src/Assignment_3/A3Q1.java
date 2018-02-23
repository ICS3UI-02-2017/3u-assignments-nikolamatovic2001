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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Create a City for the Robot
        City nm = new City();
        
        // put a robot in nm
        RobotSE rob = new RobotSE(nm, 2, 3, Direction.EAST);
    }
}
