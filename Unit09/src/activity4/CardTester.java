package activity4;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card x = new Card("King", "Hearts", 13);
		Card y = new Card("Queen", "Spades", 12);
		Card z = new Card("King", "Hearts", 13);
		System.out.println(x+""+y+""+z);
		System.out.println(x.matches(y));
		System.out.println(x.matches(z));
		
	}
}
