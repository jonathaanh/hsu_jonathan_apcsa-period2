//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      System.out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public static void printTwentyStars()
   {
	 
	   System.out.println("********************");
	 
   }

   public static void printTwentyDashes()
   {
	   
	   System.out.println("--------------------");

   }

   public void printTwoBlankLines()
   {
	   System.out.println();
	   System.out.println();
   }
   
   public void printASmallBox()
   {	
	   StarsAndStripes.printTwentyDashes();
	   for(int i = 0; i<5; i++) {
		   StarsAndStripes.printTwentyStars();
	   }
	   StarsAndStripes.printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
	   StarsAndStripes.printTwentyDashes();
	   for(int i = 0; i<10; i++) {
		   StarsAndStripes.printTwentyStars();
	   }
	   StarsAndStripes.printTwentyDashes();
   }   
}