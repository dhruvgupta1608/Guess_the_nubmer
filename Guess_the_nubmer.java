//  Guess_the_nubmer:

import java.util.Random;
import java.util.Scanner;
class game{
	 int a;
	 int b ;
	 int c =0;

	public void compuerinput()
	 {
		Random random= new Random();
		 a = random.nextInt(20);
		//return a;
	}
	public void getuserinput() {
		Scanner sc= new Scanner(System.in);
		do {
		
			
		System.out.println("Guess the nubmer: ");
		 b = sc.nextInt();
		if (a > b) {
			System.out.println("Think for a biger number");
		}
		else if (a < b) {
			System.out.println("Think for a smaller number");
		}
		c++;
		}while (a != b);
		System.out.println("\t\tCorrect Guess");
	}
	// public void iscorrectnumber() {
	// 	System.out.println("Correct Guess");
	// 	}
	
	public void numbofguess(){
		System.out.println("total attemed of number of guesses: " +c);
		if (c<=3) {
			System.out.println("Pro player");
		}
		else if (c>3 && c<7) {
			System.out.println("Good player");
		}
		else {
			System.out.println("nice try but can do better");
		}
	}
		
		 
	}
	
public class Guess_the_nubmer {
	public static void main(String[] args) {
		game player= new game();
		player.compuerinput();
		player.getuserinput();
		//player.iscorrectnumber();
		player.numbofguess();
		
	}

}
