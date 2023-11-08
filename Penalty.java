import java.util.Random;
import java.util.Scanner;

public class Penalty {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int goalCounter1 = 0;
		int goalCounter2 = 0;

		System.out.println("Welcome to the penalty shootout game!");
		System.out.println("Choose your game mode:");
		System.out.println("Press 1: Play against the computer");
		System.out.println("Press 2: Play against a local player");

		int gameMode = scanner.nextInt();


		switch (gameMode) {

		case 1:
			System.out.println("You are playing against the computer.");
			System.out.println("The first player to reach 5 goals, wins the game. Good luck! :)");

			while (goalCounter1 < 5 && goalCounter2 < 5) {
				System.out.println("Your turn to shoot:");
				System.out.println("Choose where you want to shoot the ball:" + "\n");
				System.out.println("0: Center" + "\n");
				System.out.println("1: Left side" + "\n");
				System.out.println("2: Right side" + "\n");

				int shootManual = scanner.nextInt();
				int defenseRandom = random.nextInt(3);


				if (shootManual == 0 && defenseRandom == 0){
					System.out.println("Keeper defended!");
				}
				else if (shootManual == 0 && defenseRandom == 1){
					System.out.println("GOAAAAL!!!" + "\n");
					goalCounter1++;
				}
				else if (shootManual == 0 && defenseRandom == 2){
					System.out.println("GOAAAAL!!!" + "\n");
					goalCounter1++;
				}
				else if (shootManual == 1 && defenseRandom == 0){
					System.out.println("GOAAAAL!!!" + "\n");
					goalCounter1++;
				}
				else if (shootManual == 1 && defenseRandom == 1){
					System.out.println("Keeper defended!" + "\n");
				}
				else if (shootManual == 1 && defenseRandom == 2){
					System.out.println("GOAAAAL!!!" + "\n");
					goalCounter1++;
				}
				else if (shootManual == 2 && defenseRandom == 0){
					System.out.println("GOAAAAL!!!" + "\n");
					goalCounter1++;
				}
				else if (shootManual == 2 && defenseRandom == 1){
					System.out.println("GOAAAAL!!!" + "\n");
					goalCounter1++;
				}
				else if (shootManual == 2 && defenseRandom == 2) {
					System.out.println("Keeper defended!" + "\n");
				}

				//TURNO DO COMPUTADOR

				if (goalCounter1 < 5 && goalCounter2 < 5) {
					int shootRandom = random.nextInt(3);
					System.out.println("Computer's turn to shoot!");
					System.out.println("Choose where you want to defend: " + "\n");
					System.out.println("0: Center" + "\n");
					System.out.println("1: Left side" + "\n");
					System.out.println("2: Right side" + "\n");
					int defenseManual = scanner.nextInt();


					if (shootRandom == 0 && defenseManual == 0){
						System.out.println("Keeper defended!" + "\n");
					}
					else if (shootRandom == 0 && defenseManual == 1){
						System.out.println("GOAAAAL!!!" + "\n");
						goalCounter2++;
					}
					else if (shootRandom == 0 && defenseManual == 2){
						System.out.println("GOAAAAL!!!" + "\n");
						goalCounter2++;
					}
					else if (shootRandom == 1 && defenseManual == 0){
						System.out.println("GOAAAAL!!!" + "\n");
						goalCounter2++;
					}
					else if (shootRandom == 1 && defenseManual == 1){
						System.out.println("Keeper defended!" + "\n");
					}
					else if (shootRandom == 1 && defenseManual == 2){
						System.out.println("GOAAAAL!!!" + "\n");
						goalCounter2++;
					}
					else if (shootRandom == 2 && defenseManual == 0){
						System.out.println("GOAAAAL!!!" + "\n");
						goalCounter2++;
					}
					else if (shootRandom == 2 && defenseManual == 1){
						System.out.println("GOAAAAL!!!" + "\n");
						goalCounter2++;
					}
					else if (shootRandom == 2 && defenseManual == 2) {
						System.out.println("Keeper defended!" + "\n");
					}
				}
				System.out.println("Scoreboard:" + "\n");
				System.out.println("Player: " + goalCounter1);
				System.out.println("Computer: " + goalCounter2 + "\n");

			}
			System.out.println("\n" + "End of match!" + "\n" + "Final score: " + "\n");
			System.out.println("Player: " + goalCounter1);
			System.out.println("Computer: " + goalCounter2);
			break;

		case 2:
			System.out.println("You are playing against a local player");
			System.out.println("The first player to reach 5 goals, wins the game. Good luck! :)");

			while (goalCounter1 < 5 && goalCounter2 < 5) {
				System.out.println("Player 1's turn to shoot!");
				System.out.println("Choose where you want to shoot the ball:" + "\n");
				System.out.println("0: Center" + "\n");
				System.out.println("1: Left side" + "\n");
				System.out.println("2: Right side" + "\n");
				int shootP1 = scanner.nextInt();

				System.out.println("Player 2's turn to defend!");
				System.out.println("Choose where you want to defend: " + "\n");
				System.out.println("0: Center" + "\n");
				System.out.println("1: Left side" + "\n");
				System.out.println("2: Right side" + "\n");
				int defenseP2 = scanner.nextInt();

				if (shootP1 == 0 && defenseP2 == 0){
					System.out.println("Keeper defended!" + "\n");
				}
				else if (shootP1 == 0 && defenseP2 == 1){
					System.out.println("GOAAAAL!!!" + "\n");
					goalCounter1++;
				}
				else if (shootP1 == 0 && defenseP2 == 2){
					System.out.println("GOAAAAL!!!" + "\n");
					goalCounter1++;
				}
				else if (shootP1 == 1 && defenseP2 == 0){
					System.out.println("GOAAAAL!!!" + "\n");
					goalCounter1++;
				}
				else if (shootP1 == 1 && defenseP2 == 1){
					System.out.println("Keeper defended!" + "\n");
				}
				else if (shootP1 == 1 && defenseP2 == 2){
					System.out.println("GOAAAAL!!!" + "\n");
					goalCounter1++;
				}
				else if (shootP1 == 2 && defenseP2 == 0){
					System.out.println("GOAAAAL!!!" + "\n");
					goalCounter1++;
				}
				else if (shootP1 == 2 && defenseP2 == 1){
					System.out.println("GOAAAAL!!!" + "\n");
					goalCounter1++;
				}
				else if (shootP1 == 2 && defenseP2 == 2) {
					System.out.println("Keeper defended!" + "\n");
				}

				//TURNO DO PLAYER 2

				while (goalCounter1 < 5 && goalCounter2 < 5) {
					System.out.println("Player 2's turn to shoot!");
					System.out.println("Choose where you want to shoot the ball:" + "\n");
					System.out.println("0: Center" + "\n");
					System.out.println("1: Left side" + "\n");
					System.out.println("2: Right side" + "\n");
					int shootP2 = scanner.nextInt();

					System.out.println("Player 1's turn to defend!");
					System.out.println("Choose where you want to defend: " + "\n");
					System.out.println("0: Center" + "\n");
					System.out.println("1: Left side" + "\n");
					System.out.println("2: Right side" + "\n");
					int defenseP1 = scanner.nextInt();

					if (shootP2 == 0 && defenseP1 == 0){
						System.out.println("Keeper defended!" + "\n");
					}
					else if (shootP2 == 0 && defenseP1 == 1){
						System.out.println("GOAAAAL!!!" + "\n");
						goalCounter2++;
					}
					else if (shootP2 == 0 && defenseP1 == 2){
						System.out.println("GOAAAAL!!!" + "\n");
						goalCounter2++;
					}
					else if (shootP2 == 1 && defenseP1 == 0){
						System.out.println("GOAAAAL!!!" + "\n");
						goalCounter2++;
					}
					else if (shootP2 == 1 && defenseP1 == 1){
						System.out.println("Keeper defended!" + "\n");
					}
					else if (shootP2 == 1 && defenseP1 == 2){
						System.out.println("GOAAAAL!!!" + "\n");
						goalCounter2++;
					}
					else if (shootP2 == 2 && defenseP1 == 0){
						System.out.println("GOAAAAL!!!" + "\n");
						goalCounter2++;
					}
					else if (shootP2 == 2 && defenseP1 == 1){
						System.out.println("GOAAAAL!!!" + "\n");
						goalCounter2++;
					}
					else if (shootP2 == 2 && defenseP1 == 2) {
						System.out.println("Keeper defended!" + "\n");
					}
					System.out.println("Scoreboard:" + "\n");
					System.out.println("Player 1: " + goalCounter1);
					System.out.println("Player 2: " + goalCounter2 + "\n");
				}
			}
			System.out.println("\n" + "End of match!" + "\n" + "Final score: " + "\n");
			System.out.println("Player 1: " + goalCounter1);
			System.out.println("Player 2: " + goalCounter2);
			break;

		default: 
			System.out.println("Invalid option.");
			break;
		}
		scanner.close();
	}
}