//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
	String c = "aeiouAEIOU ";
   public String go( String a )
	{
	   if (c.contains(a.substring(0,1))||c.contains(a.substring(a.length()-1))) {
		   return "yes";
	   }
	   return "no";
	}
}