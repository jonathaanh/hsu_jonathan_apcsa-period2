//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover lm = new LetterRemover("I am Sam I am", 'a');
		System.out.println(lm.toString());
		System.out.println(lm.removeLetters());
	}
}