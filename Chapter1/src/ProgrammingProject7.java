import java.util.Scanner;

public class ProgrammingProject7 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number of seconds:");

        int seconds = keyboard.nextInt();

        System.out.println("You have entered " + seconds + " seconds!");

        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds % 60;

        System.out.println("This is:");
        System.out.println(hours + " hours " + minutes + " minutes " + remainingSeconds + " seconds!");


    }

}
