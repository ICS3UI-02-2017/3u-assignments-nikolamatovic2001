package Assignment_8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author maton0870
 */
public class Face extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "My Game";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    //Variables for the eyes
    int EyeY = 245;
    int EyeMove = 1;
    //Variables for the eyebrows
    int bigBrowY = 0;
    int bigBrowMove = 1;
    int mediumBrowY = 180;
    int mediumBrowMove = 1;
    int TopBrowY = 175;
    int TopBrowMove = 1;
    int sideMedBrowY = 190;
    int sideMedBrowMove = 1;
    int sideLowBrowLeftY = 209;
    int sideLowBrowLeftMove = 1;
    int sideLowBrowRightY = 206;
    int sideLowBrowRightMove = 1;
    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Face(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        //Creates the head
        g.setColor(Color.YELLOW);
        g.fillRoundRect(175, 75, 450, 450, 100, 100);
        //Creates the top and bottom
        g.fillRoundRect(275, 20, 250, 110, 50, 50);
        g.fillRoundRect(275, 20, 250, 560, 50, 50);
        //Creates the eyes
        g.setColor(Color.BLACK);
        g.fillOval(280, 240, 75, 75);
        g.fillOval(450, 240, 75, 75);
        //Creates the pupils
        g.setColor(Color.WHITE);
        g.fillOval(298, EyeY, 35, 35);
        g.fillOval(468, EyeY, 35, 35);
        //Creating the Mouth
        g.setColor(Color.BLACK);
        g.fillOval(430, 365, 125, 125);
        int[] mouthX = {280, 380, 380};
        int[] mouthY = {485, 375, 475};
        g.fillPolygon(mouthX, mouthY, 3);
        g.fillRect(380, 375, 100, 100);
        g.fillArc(370, 350, 173, 100, 0, 180);
        g.setColor(Color.YELLOW);
        g.fillArc(340, 460, 140, 130, 0, 180);
        g.fillArc(315, 452, 150, 130, 0, 180);
        g.fillArc(315, 450, 140, 140, 0, 180);
        g.fillArc(300, 452, 140, 140, 0, 180);
        g.fillArc(280, 460, 140, 130, 0, 180);
        g.fillArc(270, 465, 140, 130, 0, 180);
        //Creates the teeth
        g.setColor(Color.WHITE);
        g.fillArc(443, 412, 102, 70, 200, 180);
        g.fillArc(373, 359, 165, 80, 0, 180);
        //Creates the tonuge
        g.setColor(Color.RED);
        g.fillArc(399, 427, 52, 52, 347, 180);
        g.fillArc(446, 427, 60, 50, 17, 180);
        //Creates the eyebrows
        g.setColor(Color.BLACK);
        g.translate(235, 172);
        g2d.rotate(Math.toRadians(15));
        g.fillRoundRect(0, bigBrowY, 150, 50, 30, 30);
        g2d.rotate(Math.toRadians(-15));
        g.translate(-235, -172);
        g.translate(435, 215);
        g2d.rotate(Math.toRadians(345));
        g.fillRoundRect(0, bigBrowY, 150, 50, 30, 30);
        g2d.rotate(Math.toRadians(-345));
        g.translate(-435, -215);
        g.fillArc(336, mediumBrowY, 40, 80, 340, 180);
        g.fillArc(205, TopBrowY, 60, 30, 330, 180);
        g.fillArc(200, sideMedBrowY, 60, 30, 330, 180);
        g.fillArc(200, sideLowBrowRightY, 60, 30, 330, 180);
        g.fillArc(437, mediumBrowY, 40, 90, 20, 160);
        g.fillArc(555, TopBrowY, 60, 30, 30, 180);
        g.fillArc(560, sideMedBrowY, 60, 30, 30, 180);
        g.fillArc(560, sideLowBrowLeftY, 60, 30, 30, 180);
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        //Moves the eyes up and down
        EyeY = EyeY + EyeMove;
       
        if(EyeY < 270){
           EyeMove++;
       }
       if(EyeY > 240){
           EyeMove--;
       }
       //Shakes the eybrows
       bigBrowY = bigBrowY + bigBrowMove;
       
        if(bigBrowY < -1){
           bigBrowMove++;
       }
       if(bigBrowY > 1){
           bigBrowMove--;
       }
        mediumBrowY = mediumBrowY + mediumBrowMove;
       
        if(mediumBrowY < 181){
           mediumBrowMove++;
       }
       if(mediumBrowY > 179){
           mediumBrowMove--;
       }   
       TopBrowY = TopBrowY + TopBrowMove;
       
        if(TopBrowY < 176){
           TopBrowMove++;
       }
       if(TopBrowY > 174){
           TopBrowMove--;
       }  
       sideMedBrowY = sideMedBrowY + sideMedBrowMove;
       
        if(sideMedBrowY < 191){
           sideMedBrowMove++;
       }
       if(sideMedBrowY > 189){
           sideMedBrowMove--;
       }   
       sideLowBrowLeftY = sideLowBrowLeftY + sideLowBrowLeftMove;
       
        if(sideLowBrowLeftY < 210){
           sideLowBrowLeftMove++;
       }
       if(sideLowBrowLeftY > 208){
           sideLowBrowLeftMove--;
       }  
       sideLowBrowRightY = sideLowBrowRightY + sideLowBrowRightMove;
       
        if(sideLowBrowRightY < 207){
           sideLowBrowRightMove++;
       }
       if(sideLowBrowRightY > 205){
           sideLowBrowRightMove--;
       }  
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        Face game = new Face();
    }
}

