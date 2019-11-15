import java.util.*;   
public class GuessRand {

	public static void main(String[] args) {
		int rand = 0;
		boolean success = false;
		Random r = new Random();
		rand = r.nextInt(100)+1;
		
		while (success != true) {
			int guess = 0;
			Scanner compare = new Scanner(System.in);
			System.out.println("Your Guess: ?");
			guess = compare.nextInt();
			success =  compare(guess, rand);
		}
	}
	
	
	public static boolean compare(int guess, int rand) {
		boolean got_it = false;
		if (rand == guess) {  
			System.out.println("You got it!");
			got_it = true;
		} else if (rand > guess) {  
			System.out.println("No, it's Higher");
		} else {
			System.out.println("No, it's Lower");
		}
		return got_it;
	}
}
