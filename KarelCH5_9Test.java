/*
   @Author: Coglianese
      Date: Sep 18, 2006
   Teacher:
       Lab:
      Misc: based on work by C. Nelson
  */

import kareltherobot.*;

public class KarelCH5_9Test extends KJRTest implements Directions
{
    public KarelCH5_9Test (String name)
    {
    		super(name);
   	}
   	
   	private MazeWalker alice;
   	private MazeWalker bob;
   	private MazeWalker carol; 
	private MazeWalker darrel;  	
   	

   	public void setUp()
   	{
   		 World.reset();
   		 World.setDelay(1);
   		 World.setVisible(false);    			
   		 World.setTrace(false);
    	 World.readWorld("ch5_9.kwld");  		 
         alice	= new MazeWalker(7, 2, North, 0);
         bob	= new MazeWalker(2, 2, North, 0);
         carol	= new MazeWalker(7, 7, North, 0);
   		 darrel	= new MazeWalker(2, 7, North, 0);
   	}
   	
    public void testNWWalk()
    {
         alice.followWallRight();
         assertState(alice, 7, 2,West, false);
    }
    
    public void testSWWalk()
    {
         bob.followWallRight();
         assertState(bob, 3, 2,North, false);
    }
    
    public void testNEWalk()
    {
         carol.followWallRight();
         assertState(carol, 8, 8,East, false);
    }
    
    public void testSEWalk()
    {
         darrel.followWallRight();
         assertState(darrel, 2, 8,South, false);
    }
    
    public void assertState(Robot karel, int str, int av, Direction dir, boolean beeps)
   	{
   			if(dir == Directions.East)
   				assertFacingEast(karel);
   			else if(dir == Directions.West)
   				assertFacingWest(karel);
   			else if(dir == Directions.North)
   				assertFacingNorth(karel);
   			else if(dir == Directions.South)
   				assertFacingSouth(karel);
   			
   			assertAt(karel, str, av);
   			
   			if(beeps)
   				assertBeepersInBeeperBag(karel);
   	}
  
}
