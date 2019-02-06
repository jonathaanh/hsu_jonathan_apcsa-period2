//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare wc = new WordsCompare("monkey", "tomato");
		wc.compare();
		System.out.print(wc.toString());
		wc.setWords("tree", "pizza");		
		wc.compare();
		System.out.print(wc.toString());
	}
}