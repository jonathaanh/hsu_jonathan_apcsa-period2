import java.util.Arrays;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		
	List<Integer> ray = Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11);
	ListOddToEven x = new ListOddToEven();
	System.out.println(x.go(ray));
	
	List<Integer> ray1 = Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7);
	ListOddToEven a = new ListOddToEven();
	System.out.println(a.go(ray1));
	
	List<Integer> ray2 = Arrays.asList(10,20,30,40,5,41,31,20,11,7);
	ListOddToEven s = new ListOddToEven();
	System.out.println(s.go(ray2));
	
	List<Integer> ray3 = Arrays.asList(32767,70,4,5,6,7);
	ListOddToEven d = new ListOddToEven();
	System.out.println(d.go(ray3));
	
	
	List<Integer> ray4 = Arrays.asList(2,7,11,21,5,7);
	ListOddToEven f = new ListOddToEven();
	System.out.println(f.go(ray4));
	
	List<Integer> ray5 = Arrays.asList(7,255,11,255,100,3,2);
	ListOddToEven g = new ListOddToEven();
	System.out.println(g.go(ray5));
	
	List<Integer> ray6 = Arrays.asList(9,11,11,11,7,1000,3);
	ListOddToEven h = new ListOddToEven();
	System.out.println(h.go(ray6));
	}
}