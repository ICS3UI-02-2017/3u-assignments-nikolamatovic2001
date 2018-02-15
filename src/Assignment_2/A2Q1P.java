/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

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
        City nm = new City ();
        
        //Create a robot in the city
        RobotSE rob = new RobotSE(nm, 2, 3, Direction.NORTH);
        
    }
}
