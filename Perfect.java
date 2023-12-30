/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] s) {
		int n = Integer.parseInt(s[0]);
		int divSum = 0;
		String div = "";
		for (int i=2; i<=n; i++) {
			if (n%i==0 && n!=i) {
				divSum += i;
				div += " + " + i;
			}
		}
		if (n == divSum+1) {
			System.out.println(n + " is a perfect number since " + n + " = 1" + div);
		} else {
			System.out.println(n+ " is not a perfect number");
		}
	}
}
