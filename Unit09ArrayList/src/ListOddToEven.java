//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int firstOdd = -1;
		int LastEven = -1;
		for(int i = 0; i< ray.size();i++) {
			if(ray.get(i)%2==1) {
				firstOdd = i;
				break;
			}
		}
		if(firstOdd!=-1) {
			for(int i = ray.size()-1; i> 0;i--) {
				if(ray.get(i)%2==0) {
					LastEven = i;
					break;
				}
			}
		}
		if(firstOdd==-1||LastEven==-1) {
			return -1;
		}
		return LastEven-firstOdd;
	}

}