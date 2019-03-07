import java.util.Arrays;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{				
		List<Integer> ray = Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5);
		ListSumFirst x = new ListSumFirst();
		System.out.println(x.go(ray));
		
		List<Integer> ray1 = Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99);
		ListSumFirst a = new ListSumFirst();
		System.out.println(a.go(ray1));
		
		List<Integer> ray2 = Arrays.asList(10,20,30,40,50,-11818,40,30,20,10);
		ListSumFirst s = new ListSumFirst();
		System.out.println(s.go(ray2));
		
		List<Integer> ray3 = Arrays.asList(32767);
		ListSumFirst d = new ListSumFirst();
		System.out.println(d.go(ray3));
		
		
		List<Integer> ray4 = Arrays.asList(255,255);
		ListSumFirst f = new ListSumFirst();
		System.out.println(f.go(ray4));
		
		List<Integer> ray5 = Arrays.asList(9,10,-88,100,-555,2);
		ListSumFirst g = new ListSumFirst();
		System.out.println(g.go(ray5));
		
		List<Integer> ray6 = Arrays.asList(10,10,10,11,456);
		ListSumFirst h = new ListSumFirst();
		System.out.println(h.go(ray6));
		
	}
}