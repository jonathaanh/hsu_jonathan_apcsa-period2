import java.util.Random;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		Random random = new Random();
		grid = new String[rows][cols];
		for(int i = 0; i< rows; i++) {
			for( int x = 0; x< cols; x++) {
				grid[i][x] = vals[random.nextInt(vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		String maxstring = "";
		for(String i : vals) {
			if(countVals(i)>max) {
				max = countVals(i);
				maxstring = i;
			}
		}
		return maxstring + " occurs the most";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count  = 0;
		for(String[] i : grid) {
			for(String y : i) {
				if(y == val) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int x = 0; x<grid.length; x++) {
			for(int z = 0; z<grid[x].length;z++) {
				output+= grid[x][z] + " ";
			}
		output+="\n";
		}
		return output;
	}
}