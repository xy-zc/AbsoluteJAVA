import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgrammingProject11 {

    public static void main(String[] args) {

        Scanner input = null;

        try {
            input = new Scanner(new FileInputStream(
                    "E:/IdeaProjects/AbsoluteJAVA/Chapter2/src/ProgrammingProject11Input.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not Found!");
            System.exit(0);
        }

        int number = Integer.parseInt(input.nextLine());

        System.out.printf("%-20s%-20s%-20s%n", "Exercise", "Score", "Total Possible");

        double scoreTotal = 0.00;
        int totalPossibleTotal = 0;

        for (int i = 0; i < number; i++) {
            String name = input.nextLine();
            double score = Double.parseDouble(input.nextLine());
            int totalPossible = Integer.parseInt(input.nextLine());

            System.out.printf("%-20s%-20.2f%-20d%n", name, score, totalPossible);

            scoreTotal += score;
            totalPossibleTotal += totalPossible;
        }

        System.out.printf("%-20s%-20.2f%-20d%n", "Total", scoreTotal, totalPossibleTotal);

        DecimalFormat formatter = new DecimalFormat("##0.00%");

        System.out.println("Your total is " + scoreTotal + " out of "
                + totalPossibleTotal + " or " + formatter.format(scoreTotal / totalPossibleTotal) + ".");

    }

}
