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
    private Canvas canvas;
    private int ySpeed = 1;                // initial downward speed

    
    /**
     * Constructor for objects of class BouncingBall
     *
     * @param xPos  the horizontal coordinate of the ball
     * @param yPos  the vertical coordinate of the ball
     * @param ballDiameter  the diameter (in pixels) of the ball
     * @param ballColor  the color of the ball
     * @param groundPos  the position of the ground (where the wall will bounce)
     * @param drawingCanvas  the canvas to draw this ball on
     */
    public boxball(int xPos, int yPos, int ballDiameter, Color ballColor,
                        int groundPos, Canvas drawingCanvas) {
        xPosition = xPos;
        yPosition = yPos;
        color = ballColor;
        diameter = ballDiameter;
        groundPosition = groundPos;
        canvas = drawingCanvas;
        newcanvas = new Canvas("Box Ball" , 600, 600);
                            
        }
    
            

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void bounce()
    {
        int ground = 400;
        int side = 300;
        int side2 = -300;
        int top = -400;
        
        
        return;
    }
}