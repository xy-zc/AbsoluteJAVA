import java.util.Random;
import java.util.Scanner;

public class ProgrammingProject10 {

    public static void main(String[] args) {

        Scanner keyborad = new Scanner(System.in);
        Random randomGenerator = new Random();
        boolean gameEnd = false;
        boolean humanTurn = true;
        int humanScore = 0;
        int computerScore = 0;
        int computerTurnTotal = 0;

        System.out.println("The game of Pig has STARTED!");

        while (!gameEnd) {

            if (humanTurn) {
                System.out.println("The human's turn!");
                System.out.println("The current scores:");
                System.out.println("Computer: " + computerScore);
                System.out.println("Human: " + humanScore);

                int humanRoll = randomGenerator.nextInt(5) + 1;
                System.out.println("The human has rolled: " + humanRoll + ".");

                switch (humanRoll) {
                    case 1:
                        System.out.println("No points earned!");
                        System.out.println("Pass on to the computer!");
                        System.out.println();
                        humanTurn = false;
                        break;
                    default:
                        humanScore = humanScore + humanRoll;

                        if (humanScore >= 100) {
                            System.out.println("Human has earned: " + humanScore + " already!");
                            System.out.println("Human WIN!");
                            gameEnd = true;
                            break;
                        }

                        System.out.println("The human has earned: " + humanScore + ".");
                        System.out.println("Please enter 'r' to ROLL AGAIN or 'h' to HOLD:");

                        String command = keyborad.nextLine();
                        switch (command) {
                            case "h":
                                System.out.println("The human has entered: " + command + ".");
                                System.out.println("The human has decided to HOLD. Now pass on to the computer.");
                                System.out.println();
                                humanTurn = false;
                                break;
                            case "r":
                            default:
                                System.out.println("The human has entered: " + command + ".");
                                System.out.println("The human has decided to ROLL AGAIN.");
                                System.out.println();
                                break;
                        }
                }
            } else {

                System.out.println("The computer's turn!");

                int computerRoll = randomGenerator.nextInt(5) + 1;
                System.out.println("The computer has rolled: " + computerRoll + ".");

                switch (computerRoll) {
                    case 1:
                        System.out.println("No points earned!");
                        System.out.println("Pass on to the human!");
                        System.out.println();
                        computerTurnTotal = 0;
                        humanTurn = true;
                        break;
                    default:
                        computerScore = computerScore + computerRoll;
                        computerTurnTotal = computerTurnTotal + computerRoll;

                        if (computerScore >= 100) {
                            System.out.println("Computer has earned: " + computerScore + " already!");
                            System.out.println("Computer WIN!");
                            gameEnd = true;
                            break;
                        }

                        System.out.println("The computer has earned: " + computerScore + ".");
                        System.out.println("Please enter 'r' to ROLL AGAIN or 'h' to HOLD:");

                        String command = "";

                        if (computerTurnTotal < 20) {
                            command = "r";
                        } else {
                            command = "h";
                        }

                        switch (command) {
                            case "h":
                                System.out.println("The computer has entered: " + command + ".");
                                System.out.println("The computer has decided to HOLD. Now pass on to the human.");
                                System.out.println();
                                computerTurnTotal = 0;
                                humanTurn = true;
                                break;
                            case "r":
                            default:
                                System.out.println("The computer has entered: " + command + ".");
                                System.out.println("The computer has decided to ROLL AGAIN.");
                                System.out.println();
                                break;
                        }
                }

            }

//            if (computerScore >= 100 || humanScore >= 100) {
//                if (computerScore >= 100) {
//                    System.out.println("Computer has earned: " + computerScore + " already!");
//                    System.out.println("Computer WIN!");
//                    gameEnd = true;
//                } else if (humanScore >= 100) {
//                    System.out.println("Human has earned: " + humanScore + " already!");
//                    System.out.println("Human WIN!");
//                    gameEnd = true;
//                }
//            }


        }


    }

}
