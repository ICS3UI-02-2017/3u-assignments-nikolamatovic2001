/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author maton0870
 */
public class MessingAround {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a City for the Robot
        City nm = new City();
        
        // put a robot in nm
        RobotSE rob = new RobotSE(nm, 2, 3, Direction.SOUTH);
        
        // put a robot in nm
        RobotSE jim = new RobotSE(nm, 2, 4, Direction.SOUTH);
        
        
            }
}
