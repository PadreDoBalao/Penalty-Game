
public class Shootout {

import java.util.Scanner;


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

String player1;
String player2;
int middle = 0;
int left = 1;
int right = 2;
int goalCounter = 0;
int savesCounter = 0;


System.out.println("SHOOTING" + "\n");
System.out.println("Choose where you want to shoot the ball:" + "\n");
System.out.println("0: Center" + "\n");
System.out.println("1: Left side" + "\n");
System.out.println("2: Right side" + "\n");

int shoot = scanner.nextInt();


System.out.println("DEFENDING" + "\n");
System.out.println("Choose a position:" + "\n");
System.out.println("0: Center" + "\n");
System.out.println("1: Left side" + "\n");
System.out.println("2: Right side" + "\n");

int defense = scanner.nextInt();

for (int i = 0; i < 6; i++){

    if (shoot == 0 && defense == 0){
        System.out.println("Keeper defended!");
        savesCounter++;
    }
    if (shoot == 0 && defense == 1){
        System.out.println("GOAAAAL!!!");
        goalCounter++;
    }
    if (shoot == 0 && defense == 2){
        System.out.println("GOAAAAL!!!");
        goalCounter++;
    }
    if (shoot == 1 && defense == 0){
        System.out.println("GOAAAAL!!!");
        goalCounter++;
    }
    if (shoot == 1 && defense == 1){
        System.out.println("Keeper defended!");
        savesCounter++;
    }
    if (shoot == 1 && defense == 2){
        System.out.println("GOAAAAL!!!");
        goalCounter++;
    }
    if (shoot == 2 && defense == 0){
        System.out.println("GOAAAAL!!!");
        goalCounter++;
    }
    if (shoot == 2 && defense == 1){
        System.out.println("GOAAAAL!!!");
        goalCounter++;
    }
    if (shoot == 2 && defense == 2){
        if (shoot == 1 && defense == 1){
        System.out.println("Keeper defended!");
        savesCounter++;
        }
    }

System.out.println("End of match!" + "\n" + "Final score: " + "\n");
System.out.println("Goals: " + goalCounter);
System.out.println("Saves: " + savesCounter);
   





    }
scanner.close();
    }
    }

