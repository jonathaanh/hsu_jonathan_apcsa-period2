//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Perfect x = new Perfect(496);
		System.out.println(x.toString());
		x.setPerfect(45);
		System.out.println(x.toString());
		x.setPerfect(6);
		System.out.println(x.toString());
	}
}