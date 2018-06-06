package Examples;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
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
public class PongExample extends JComponent implements ActionListener {

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
    Rectangle paddel1 = new Rectangle(50, 250, 25, 100);
    Rectangle paddel2 = new Rectangle(725, 250, 25, 100);
    
    Rectangle ball = new Rectangle(395, 295, 10, 10);
    
    int ballAngle = 45;
    int ballSpeed = 3;
    
    //Draw a score
    int score1 = 0;
    int score2 = 0;
    
    // create a custom font
    Font biggerFont = new Font("Comic Sans MS", Font.BOLD, 50);
    
    
    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public PongExample(){
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
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        //Draw the paddles
        g.setColor(Color.WHITE);
        g.fillRect(paddel1.x, paddel1.y, paddel1.width, paddel1.height);
	g.fillRect(paddel2.x, paddel2.y, paddel2.width, paddel2.height);
        g.fillRect(ball.x, ball.y, ball.width, ball.height);
        
        //Draw the score
        g.setFont(biggerFont);
        g.drawString("" + score1, WIDTH/2 - 75, 60);
        g.drawString("" + score2, WIDTH/2 + 50, 60);

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
        moveBall();
        movePaddles();
        checkForCollision();
        checkForGoal();
    }

    private void moveBall() {
        double newAngle = Math.toRadians((ballAngle));
        double moveX = ballSpeed*Math.cos(newAngle);
        double moveY = ballSpeed*Math.sin(newAngle);
        ball.x = ball.x + (int)moveX;
        ball.y = ball.y + (int)moveY;
    }

    private void movePaddles() {
      
    }
    
    private void checkForCollision() {
       
    }

    private void checkForGoal() {
        if(ball.x < 0){
            score2++;   
            ball.x = WIDTH/2 - ball.width/2;
            ball.y = HEIGHT/2 - ball.height/2;
        }else if (ball.x > 800){
            score1++;
            ball.x = WIDTH/2 - ball.width/2;
            ball.y = HEIGHT/2 - ball.height/2;
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
        PongExample game = new PongExample();
    }
}

