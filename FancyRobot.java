public class FancyRobot implements FuelRobot
{
	private int loc;
	private boolean right;
	
	public FancyRobot( int l, boolean r)
	{
		loc = l;
		right = r;	
	}
	
	public int getCurrentIndex()
	{
		return loc;
	}
	
	public boolean isFacingRight()
	{
		return right;
	}
	
	public void changeDirection()
	{
		right = !right;
	}
	
	public void moveForward(int numLocs)
	{
		loc = loc + numLocs;
	}
	
	public String toString()
	{
		return "" + loc + " " + (right?"facing right":"facing left");
	}
}
