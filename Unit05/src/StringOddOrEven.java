//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "";
		isEven();
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
		
	}

 	public boolean isEven()
 	{
 		if(word.length()%2==1) {
 			return false;
 		}
 		return true;
	}

 	public String toString()
 	{
 		String output="";
 		return output;
	}
}