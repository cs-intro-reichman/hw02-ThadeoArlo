/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] s) {
		int n = Integer.parseInt(s[0]);
		for (int i=1; i<=n; i++) {
			if (n%i==0) {System.out.println(i);}
		}
	}
}
