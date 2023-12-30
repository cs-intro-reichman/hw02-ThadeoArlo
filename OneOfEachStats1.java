/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] asdf) {
		int n = Integer.parseInt(asdf[0]);
		// All Experiments
		float allKids = 0;
		int kids2 = 0;
		int kids3 = 0;
		int kids4 = 0;
		for (int i=0; i<n; i++) {
			// One Experiment
			int kids = 0;
			boolean isBoy = false;
			boolean isGirl = false;
			do {
				allKids++;
				kids++;
				if ((int)(Math.random()*(2)) == 1) {
					isBoy=true;
				} else {
					isGirl=true;
				}
			} while (!isBoy || !isGirl);
			switch (kids) {
				case 2: kids2++;break;
				case 3: kids3++;break;
				case 4: kids4++;break;
				default: kids4++;break;
			}
		}
		// Results
		System.out.println("Average: " + allKids/n + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + kids2);		
		System.out.println("Number of families with 3 children: " + kids3);
		System.out.println("Number of families with 4 or more children: " + kids4);
		int maxKids = Math.max(kids2, Math.max(kids3, kids4));
		String mode;
		if (maxKids == kids2) {
			mode = "2";
		} else if (maxKids == kids3) {
			mode = "3";
		} else {
		mode = "4 or more";
		}
		System.out.println("The most common number of children is " + mode + ".");
	}
}
