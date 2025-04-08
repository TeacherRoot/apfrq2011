import java.util.*;

public class FuelDepotRunner
 {
    public static void main(String[] args)
    {
    	FancyRobot bob = new FancyRobot(2,true);
    	System.out.println( bob );
    	
    	FancyTank tk = new FancyTank( 45 );
    	System.out.println( tk );
    	tk.setLevel( 55 );
    	System.out.println( tk );
    	
    	
    	int[] vals = {20, 30, 80, 55, 50, 75, 20};
    	FuelDepot deep = new FuelDepot( vals );
    	System.out.println( deep );
    	
    	System.out.println( deep.nextTankToFill(50) );
    	System.out.println( deep.nextTankToFill(15) );

    }
}
