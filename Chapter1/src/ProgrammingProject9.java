import java.util.Scanner;

public class ProgrammingProject9 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your height in the form or X feet Y inches, make sure X and Y are positive whole numbers!");
        System.out.println("Please enter feet first:");
        int feet = keyboard.nextInt();
        System.out.println("Please enter inches:");
        int inches = keyboard.nextInt();

        if (feet <= 0 || inches < 0) {
            System.out.println("The height entered is in wrong format!");
        } else {
            if (feet < 5) {
                System.out.println("The height you entered is too short to calculate the ideal weight!");
            } else {
                int weight = 110;
                inches = inches + (feet - 5) * 12;
                weight = weight + inches * 5;
                System.out.println("Based on the height entered, you ideal weight is " + weight + " pounds!");
            }
        }

    }

}
