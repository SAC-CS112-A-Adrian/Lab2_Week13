import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numberOfDice;
		int userGuess;
		int diceRolled;
		int gamesWon = 0;
		int gamesLoss = 0;

		boolean again = true;

		ThreeDice game = new ThreeDice();
		
		while (again) {

			System.out.printf("Enter number of dice: ");
			numberOfDice = input.nextInt();
			
			diceRolled = game.Throw();

			System.out.printf("Guess points: ");
			userGuess = input.nextInt();

			if (userGuess == diceRolled)
			{
				System.out.printf("You win! It was %d.\n", diceRolled);
				gamesWon++;
			}
			else
			{
				System.out.printf("You lose! It was %d.\n", diceRolled);
				gamesLoss++;
			}
			
			//game.history(gamesLoss, gamesWon);
			
			System.out.printf("\nEnter 1 to play again: ");
			int playAgain = input.nextInt();
			if (playAgain != 1)
				again = false;

		}
	}
}