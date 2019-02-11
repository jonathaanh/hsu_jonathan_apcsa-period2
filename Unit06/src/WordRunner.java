//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word j = new Word("Hello");	
		System.out.println(j.toString());
		j.setString("World");
		System.out.println(j.toString());
		j.setString("JukeBox");
		System.out.println(j.toString());
		j.setString("TCEA");
		System.out.println(j.toString());
		j.setString("UIL");
		System.out.println(j.toString());
	}
}