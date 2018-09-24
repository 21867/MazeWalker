import kareltherobot.*;

/**
 * Write a description of class HBotDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWalkerDriver implements Directions
{
  public static void main(String args[]) 
    {
       MazeWalker karel1 =  new MazeWalker(2,2,North, infinity);
       MazeWalker karel2 =  new MazeWalker(7,2,North, infinity);
       MazeWalker karel3 =  new MazeWalker(7,7,North, infinity);
       MazeWalker karel4 =  new MazeWalker(2,7,North, infinity);
       karel1.followWallRight();
       karel2.followWallRight();
       karel3.followWallRight();
       karel4.followWallRight();
       
    } 
       
        
       static {
        World.reset();  
        World.readWorld("ch5_9.kwld"); 
        
        World.setDelay(10);  
        World.setVisible(true);
        
        
    }
        
        
}


