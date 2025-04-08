public class FancyTank implements FuelTank
{
	private int level;
	
	public FancyTank( int lv )
	{
		level = lv;
	}
	
	public int getFuelLevel()
	{
		return level;
	}
	
	public void setLevel( int lv )
	{
		level = lv;
	}
	
	public String toString( )
	{
		return "" + level;
	}
}
