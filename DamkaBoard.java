/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] asdf) {
		int n = Integer.parseInt(asdf[0]);
		for (int y=0; y<n; y++) {
			for (int x=0; x<n; x++) {
				if (y%2==0) {System.out.print("* ");} else {System.out.print(" *");}
			}
			System.out.println();
		}
	}
}