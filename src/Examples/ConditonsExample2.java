/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author maton0870
 */
public class ConditonsExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a City for the Robot
        City nm = new City();
        
        // put a robot in nm
         RobotSE rob = new RobotSE(nm, 2, 0, Direction.EAST);

        new Wall(nm, 2, 5, Direction.EAST);
        
        new Thing (nm, 2, 2, Direction.EAST);
        new Thing (nm, 2, 4, Direction.EAST);

       rob.getAvenue();
            
        }
    }

