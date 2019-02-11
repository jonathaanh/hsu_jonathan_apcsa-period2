//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   	public Perfect() {
  		number = 0;
  	}
   	public Perfect(int n) {
   		setPerfect(n);
   	}
	//add a set method
   	public void setPerfect(int n) {
   		number = n;
   	}
	public boolean isPerfect()
	{
		int sum = 0;
		for (int i = 1; i<=number/2;i++) {
			if(number%i == 0) {
				sum=sum+i;
			}
		}
		if (sum == number) {
			return true;
		}
		return false;
	}

	//add a toString	
	public String toString() {
		if(isPerfect()) {
			return number+ " is perfect";		
		}
		return number + " is not perfect";
	}
}