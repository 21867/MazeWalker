
/**
 * Write a description of class MazeWalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import kareltherobot.*;

public class MazeWalker extends Robot//extends???

{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class MazeWalker
     */
    
    public MazeWalker (int st, int ave, Direction direction, int beeps)
    {
        super(st,ave,direction,beeps);
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public boolean rightIsBlocked()
    {
        turnRight();
        if (!frontIsClear())
        {
            turnLeft();
            return true;
        }
        else
        {
            turnLeft();
            return false;
            
        }
    }
    public void followWallRight()
    {
        if (!frontIsClear())
        {
            turnLeft();
            return;
        }
        else
        {
            move();
            if (rightIsBlocked())
            {
                return;
            }
            else
            {
                turnRight();
                move();
                 if (!rightIsBlocked())
                {
                    turnRight();
                    move();
                }
            }
           
        }    
        // your code here
    }
    
    
}
