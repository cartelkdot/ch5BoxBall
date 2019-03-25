 import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
/**
 * moves inside the box,
 * bounces off the walls of the box so that the ball always stays inside.
 * The initial speed of the ball should be random, and not vertical or horizontal
 * The initial position of the ball should be random.
 * The boxBounce constructor should have a parameter that specifies how many balls are in the box.
 *
 * @author Kywajn Alston
 * @version 4.2.0
 */
public class boxball
{
    // instance variables - replace the example below with your own
    private Canvas newcanvas;
    private static final int GRAVITY = 3;
    private int ballDegradation = 2;
    private Ellipse2D.Double circle;
    private Color color;
    private int diameter;
    private int xPosition;
    private int yPosition;
    private final int groundPosition;      // y position of ground
    private final int upperWall;
    private final int leftWall;
    private final int rightWall;
    private Canvas canvas;
    private int ySpeed = 1;                // initial downward speed
    private int xSpeed = 7;
    
    /**
     * Constructor for objects of class BouncingBall
     *
     * @param xPos  the horizontal coordinate of the ball
     * @param yPos  the vertical coordinate of the ball
     * @param ballDiameter  the diameter (in pixels) of the ball
     * @param ballColor  the color of the ball

     * @param drawingCanvas  the canvas to draw this ball on
     */
    public boxball(int xPos, int yPos, int ballDiameter, Color ballColor,
                        int groundPos, Canvas drawingCanvas) {
        xPosition = xPos;
        yPosition = yPos;
        color = ballColor;
        diameter = ballDiameter;
        //groundPosition = groundPos;
        canvas = drawingCanvas;
        leftWall = 0;
        rightWall = 600;
        upperWall = 0;
        groundPosition = 500;
                            
    }
    
    
    /**
     * 
     * Draw this ball at its current positon onto the canvas.
     * 
     */
    public void draw()
    {
       canvas.setForegroundColor(color);
       canvas.fillCircle(xPosition, yPosition, diameter);
        
    }
    
    
    
    /**
     * Erase this ball at its current position.
     */
    public void erase()
    {
        canvas.eraseCircle(xPosition, yPosition, diameter);
    }
    
    /**
     * Move this ball according to its position and speed and redraw.
     * 
     */
    
    public void move()
    {
        // remove from canvas at the current position
        erase();
        
        // compute new positon
        //ySpeed += GRAVITY;
        
        yPosition += ySpeed;
        xPosition += xSpeed;
        
               // check if it has hit the ground
        if(xPosition + diameter > rightWall) {
             xPosition = rightWall - diameter;
                xSpeed = xSpeed * -1;
            }
        
            //Wall Checks
            
        if (xPosition < leftWall){
          xSpeed = -xSpeed;
        }
        if (xPosition > rightWall){
            xSpeed = -xSpeed;
        }
        if (xPosition < upperWall) {
            ySpeed = -ySpeed;
        }
        if (yPosition > groundPosition ) {
            ySpeed = -ySpeed;
        }
        // draw again at new position
        draw();
    }

    /**
     *return the horizontal position of this ball
     */
    public int getXPosition()
    {
        return xPosition;
    }
    /**
     * return the vertical position of this ball
     */
    public int getYPosition()
    {
        return yPosition;
    }
}
