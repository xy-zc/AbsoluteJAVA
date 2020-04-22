import java.util.Scanner;

public class ProgrammingProject5 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a sentence below:");
        System.out.println("(Please make sure that there is at least one \"hate\" in you sentence!)");

        String input = keyboard.nextLine();
        System.out.println("The sentence to be changed is:");
        System.out.println(input);
        int hateIndex = input.indexOf("hate");
        if (hateIndex == -1) {
            System.out.println("You DID NOT include \"hate\"!!!");
        } else {
            input = input.substring(0, hateIndex) + "love" + input.substring(hateIndex + 4);
            System.out.println("The sentence is changed to:");
            System.out.println(input);
        }

    }

}
