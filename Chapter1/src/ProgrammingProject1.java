import java.util.Scanner;

public class ProgrammingProject1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Weight in kilograms in whole number: ");
        int weight = keyboard.nextInt();

        System.out.println("Enter Height in meters in whole number: ");
        int height = keyboard.nextInt();

        double bodyMassIndex = (double) weight / (height * height);
        System.out.println("Your BMI is: " + bodyMassIndex);

    }

}
