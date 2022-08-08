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
	
	public void collectNumFromPlayer() {
		Player p1 = new Player();
		
		System.out.println("Player 1");
		numFromPlayer1 = p1.guessNumber();
		System.out.println("Player 2");
		numFromPlayer2 = p1.guessNumber();
		System.out.println("Player 3");
		numFromPlayer3 = p1.guessNumber();
		
//		System.out.println(numFromPlayer1+ ", " + numFromPlayer2 + ", " + numFromPlayer3);
	}
	
	public void compare() {
		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Game tied!! All 3 Players guessed correctly");
			}
			else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player1 and Player2 won the game");
			}
			else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player1 and Player3 won the game");
			}
			else {
				System.out.println("Player1 won the game");
			}
		}
		
		else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player2 and Player3 won the game");
			}
			else {
				System.out.println("Player2 won the game");
			}
		}
		
		else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player3 won the game");
		}
		
		else {
			System.out.println("Game lost! Better Luck next time");
		}
	}
	
}


public class Launchgame {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}

}
