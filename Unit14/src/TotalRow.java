//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	ArrayList<Integer> x = new ArrayList<Integer>();
    	int count = 0;
        for(int[] n : m) {
    		for(int x1:n) {
    			count+=x1;
    		}
    		x.add(count);
    		count = 0;
    	}
    	
		return x;
    }
}
