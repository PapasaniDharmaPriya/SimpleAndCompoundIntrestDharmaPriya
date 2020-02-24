import java.util.*;
class Simple_CompoundInterest
{
    	public double simpleInterest(double pri, double rate, double time)
	{
		double simple;
				
		simple=(pri* time * rate)/100;
		
		return(simple);
	}
	public double compoundInterest(double pri, double rate, double time)
	{
		double compound;
				
		compound=pri * Math.pow(1.0+rate/100.0,time) - pri;
		
		return(compound);
	}
}
