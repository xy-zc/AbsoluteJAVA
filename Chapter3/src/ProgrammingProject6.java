import java.util.Scanner;

public class ProgrammingProject6 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

//        boolean flag = true;

        while (true) {

            int initialPopulation = 0;
            int days = 0;


            System.out.println("Please enter the initial green crud population (a whole number) in pounds:");
            System.out.println("Or a negative whole number to end the program!");
            initialPopulation = keyboard.nextInt();

            if (initialPopulation < 0) {
                break;
            } else {

                System.out.println("Please enter the days (a multiple of 5):");
                days = keyboard.nextInt();

                int terms = days / 5;
                int population = 0;

                int currentMultiplier = 1;
                int previousMultiplier = 1;

                for (int i = 0; i <= terms; i++) {

                    if (i == 0) {
                        population = initialPopulation * currentMultiplier;
                        System.out.println("In " + (i * 5) + " days, the population is " + population);
                    } else if (i == 1) {
                        population = initialPopulation * currentMultiplier;
//                        currentMultiplier = currentMultiplier + previousMultiplier;
                        System.out.println("In " + (i * 5) + " days, the population is " + population);
                    } else {
                        // Fibonacci calculation
                        int temp = currentMultiplier;
                        currentMultiplier = currentMultiplier + previousMultiplier;
                        previousMultiplier = temp;

                        population = initialPopulation * currentMultiplier;
                        System.out.println("In " + (i * 5) + " days, the population is " + population);

                    }

                }

            }


        }

        System.out.println("You have entered a negative number.");
        System.out.println("The program is now terminated!");

    }

}
