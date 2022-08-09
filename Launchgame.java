import java.util.Scanner;

class Guesser {
	int guessNum;
	
	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guesser, kindly guess the number between 1 to 10");
		guessNum = sc.nextInt();
		
		if (guessNum > 10 || guessNum<1) {
			System.out.println("Not valid number. Please enter a valid number");
//			System.exit(0);
			guessNumber();
		}
		
		return guessNum;
	}
}


class Player {
	int guessNum;
	
	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Player, kindly guess the number between 1 to 10");
		guessNum = sc.nextInt();
		
		if (guessNum > 10 || guessNum<1) {
			System.out.println("Not valid number. Please enter a valid number");
			guessNumber();
		}
		
		
		return guessNum;
	}
}


class Umpire {
	int numFromGuesser;
	int numFromPlayer1, numFromPlayer2,numFromPlayer3;
	int correctGuess;
	
	public void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}
	
	public void collectNumFromPlayer123() {
		Player p1 = new Player();
		
		System.out.println("Player 1");
		numFromPlayer1 = p1.guessNumber();
		System.out.println("Player 2");
		numFromPlayer2 = p1.guessNumber();
		System.out.println("Player 3");
		numFromPlayer3 = p1.guessNumber();
		
//		System.out.println(numFromPlayer1+ ", " + numFromPlayer2 + ", " + numFromPlayer3);
	}
	
	public void collectNumFromPlayer12() {
		Player p1 = new Player();
		
		System.out.println("Player 1");
		numFromPlayer1 = p1.guessNumber();
		System.out.println("Player 2");
		numFromPlayer2 = p1.guessNumber();
		numFromPlayer3 = 0;
	}
	
	public void collectNumFromPlayer13() {
		Player p1 = new Player();
		
		System.out.println("Player 1");
		numFromPlayer1 = p1.guessNumber();
		System.out.println("Player 3");
		numFromPlayer3 = p1.guessNumber();
		numFromPlayer2 = 0;
	}
	
	public void collectNumFromPlayer23() {
		Player p1 = new Player();
		
		System.out.println("Player 2");
		numFromPlayer2 = p1.guessNumber();
		System.out.println("Player 3");
		numFromPlayer3 = p1.guessNumber();
		numFromPlayer1 = 0;
	}
	
	public int compare() {
		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Game tied!! All 3 Players guessed correctly");
				System.out.println("Let's gp for the next round");
				correctGuess = 123;
			}
			else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player1 and Player2 won the game");
				System.out.println("Let's gp for the next round between Player1 and Player2");
				correctGuess = 12;
			}
			else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player1 and Player3 won the game");
				System.out.println("Let's gp for the next round between Player1 and Player3");
				correctGuess = 13;
			}
			else {
				System.out.println("Player1 won the game");
				correctGuess = 0;
			}
		}
		
		else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player2 and Player3 won the game");
				System.out.println("Let's gp for the next round between Player2 and Player3");
				correctGuess = 23;
			}
			else {
				System.out.println("Player2 won the game");
				correctGuess = 0;
			}
		}
		
		else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player3 won the game");
			correctGuess = 0;
		}
		
		else {
			System.out.println("Game lost! Better Luck next time");
			correctGuess = 0;
		}
		return correctGuess;
	}
	
}


public class Launchgame {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer123();
		int correctGuess = u.compare();
		
		while (correctGuess>0) {
			u.collectNumFromGuesser();
			
			if (correctGuess == 123) {
				u.collectNumFromPlayer123();
			}
			else if (correctGuess == 12) {
				u.collectNumFromPlayer12();
			}
			else if (correctGuess == 13) {
				u.collectNumFromPlayer13();
			}
			else if (correctGuess == 23) {
				u.collectNumFromPlayer23();
			}
			
			correctGuess = u.compare();
		}
		
		System.out.println("Thank you!!!");
	}

}
