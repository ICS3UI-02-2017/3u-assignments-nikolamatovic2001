package Assignment_8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
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
public class PixelWaluigi extends JComponent implements ActionListener {

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
    Color lightPurple = new Color(169, 74, 206);
    Color darkPurple = new Color(104, 24, 135);
    Color brown = new Color(91, 62, 11);
    Color pale = new Color(237, 210, 144);
    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public PixelWaluigi(){
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
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        //Creates the hat
        g.setColor(lightPurple);
        g.fillRect(250, 25, 250, 50);
        g.fillRect(200, 75, 450, 50);
        //Creates the hair
        g.setColor(brown);
        g.fillRect(200, 125, 150, 40);
        g.fillRect(225, 160, 125, 20);
        g.fillRect(250, 160, 50, 75);
        g.fillRect(250, 230, 100, 50);
        g.fillRect(150, 164, 50, 117);
        g.fillRect(150, 280, 100, 50);
        //Creates the eye
        g.setColor(Color.BLACK);
        g.fillRect(450, 125, 50, 110);
        //Creates the moustache
        g.fillRect(500, 235, 50, 70);
        g.fillRect(450, 285, 200, 50);
        //Creates the nose
        g.setColor(Color.MAGENTA);
        g.fillRect(550, 185, 100, 100);
        g.fillRect(650, 235, 50, 50);
        //Creates the skin/face
        g.setColor(pale);
        g.fillRect(500, 125, 50, 110);
        g.fillRect(450, 235, 50, 50);
        g.fillRect(350, 125, 100, 250);
        g.fillRect(300, 180, 50, 50);
        g.fillRect(200, 165, 25, 15);
        g.fillRect(200, 180, 50, 100);
        g.fillRect(250, 280, 100, 95);
        g.fillRect(250, 335, 350, 50);
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
        PixelWaluigi game = new PixelWaluigi();
    }
}

