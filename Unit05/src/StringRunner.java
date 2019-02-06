//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word::");
		String word = keyboard.next();
		StringOddOrEven s = new StringOddOrEven(word);
		if(s.isEven()) {
			System.out.println(word+" is even");
		}
		else {
			System.out.println(word+" is odd");
		}
		
	}
}