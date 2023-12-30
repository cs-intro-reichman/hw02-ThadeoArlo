/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] asdf) {
		int next = 0, prev;
		do {
			prev = next;
			next = (int)(Math.random()*10);
			if (next>=prev) {System.out.print(next + " ");}
		} while (next>prev); // >= / > doesn't matter, simply skips a cycle
 	}
}
