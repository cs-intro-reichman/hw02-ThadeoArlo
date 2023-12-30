/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean izzaBoy = false;
		boolean izzaGirl = false;
		do {
			int feelingRomantical = (int)(Math.random()*(2));
			if (feelingRomantical == 1) {
				System.out.print("b ");
				izzaBoy=true;
			} else {
				System.out.print("g ");
				izzaGirl=true;
			}
		} while (!izzaBoy || !izzaGirl);
	}
}
