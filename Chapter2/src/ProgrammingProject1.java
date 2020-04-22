import java.util.Scanner;

public class ProgrammingProject1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a \"double\" number:");
        double n = keyboard.nextDouble();
        System.out.println("You have entered: " + n);

        double guess = n / 2;

        int iterations = 5;

        for (int i = 0; i < iterations; i++) {

            double r = n / guess;
            guess = (guess + r) / 2;

        }

        System.out.print("The square root of " + n);
        System.out.printf(" is %.2f %n", guess);

    }


}
