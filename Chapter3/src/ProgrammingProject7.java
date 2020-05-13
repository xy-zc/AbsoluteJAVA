import java.util.Scanner;

public class ProgrammingProject7 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the start of the range (in a whole number):");
        int start = keyboard.nextInt();

        System.out.println("Please enter the end of the range (in a whole number):");
        int end = keyboard.nextInt();

        System.out.println("Within the range from " + start + " to " + end + ",");
        System.out.println("we have the following Armstrong Number:");

        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
//                System.out.println("Current digit: " + digit);
                sum = sum + digit * digit * digit;
//                System.out.println("Current sum: " + sum);
                num = num / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }

    }


}
