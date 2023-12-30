/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] asdf){
		String sIn = asdf[0];
		String sOut = "";
		char mid = ' ';
		for (int i=(sIn.length()-1); i>=0; i--) {
			sOut = sOut + sIn.charAt(i);
			if (i==(sIn.length()-1)/2) {
			 mid = sIn.charAt(i);
			}
		}
		System.out.println(sOut);
		System.out.println("The middle character is " + mid);
	}
}
