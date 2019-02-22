//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int x = 0;
		int firstOdd = -1;
		int Even = -1;
		for(int i = 0; i< ray.length;i++) {
			if(ray[i]%2==1) {
				firstOdd = i;
				break;
			}
		}
		if(firstOdd!=-1) {
			for(int i = firstOdd; i< ray.length;i++) {
				if(ray[i]%2==0) {
					Even = i;
					break;
				}
			}
		}
		if(firstOdd==-1||Even==-1) {
			return -1;
		}
		return Even-firstOdd;
	}
}