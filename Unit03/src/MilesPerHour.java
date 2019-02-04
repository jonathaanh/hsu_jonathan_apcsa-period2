//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance;
	private double mph, hours, minutes;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		double newMin= (double) mins/60;
		hours+=newMin;
	}

	public void calcMPH()
	{
		mph = distance/hours;
	}

	public void print()
	{
		System.out.println(mph);
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}