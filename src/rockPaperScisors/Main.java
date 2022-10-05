package rockPaperScisors;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    public static String getComputerMove()
    {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1)
            computermove = Main.ROCK;
        else if(input == 2)
            computermove = Main.PAPER;
        else
            computermove = Main.SCISSORS;

        System.out.println("Computer move is: " + computermove);
        System.out.println();
        return computermove;
    }

    public static String getPlayerMove()
    {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String playermove = input.toUpperCase();
        System.out.println("Player move is: "+ playermove);
        return playermove;
    }


    public static void main(String[] args) {
        int computer = 0;
        int user = 0;
        while (true) {
            System.out.println("Enter any one of the following inputs:  ");
            System.out.println("ROCK");
            System.out.println("PAPER");
            System.out.println("SCISSORS");
            System.out.println();

            String playerMove = getPlayerMove();
            String computerMove = getComputerMove();

            if (playerMove.equals(computerMove)) {
                System.out.println("Game is Tie");
            }else{
                if (playerMove.equals(Main.ROCK) && computerMove.equals(Main.PAPER)){
                    computer++;
                    System.out.println("Paper warps rock");
                }else{
                    if (playerMove.equals(Main.PAPER) && computerMove.equals(Main.ROCK)) {
                        user++;
                        System.out.println("Paper warps rock");
                    }
                }
                if (playerMove.equals(Main.PAPER) && computerMove.equals(Main.SCISSORS)){
                    computer++;
                    System.out.println("Scissors cut paper");
                }else{
                    if (playerMove.equals(Main.SCISSORS) && computerMove.equals(Main.PAPER)) {
                        user++;
                        System.out.println("Scissors cut paper");
                    }
                }
                if (playerMove.equals(Main.SCISSORS) && computerMove.equals(Main.ROCK)){
                    computer++;
                    System.out.println("Rock break scissors");
                }else{
                    if (playerMove.equals(Main.ROCK) && computerMove.equals(Main.SCISSORS)) {
                        user++;
                        System.out.println("Rock break scissors");
                    }
                }
                System.out.println("Score:");
                System.out.println("User:" + user + ". Computer: " + computer);
                if (user == 2){
                    System.out.println("User won");
                    break;
                }else{
                    if (computer == 2){
                        System.out.println("Computer won");
                        break;
                    }
                }
            }
        }
    }
}
