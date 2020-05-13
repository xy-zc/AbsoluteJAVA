import java.util.Scanner;

public class ProgrammingProject8 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a sequence of digits (ranging from 0 to 9) of any length, eg. 06487100357:");
        String input = keyboard.nextLine();
        char[] inputString = input.toCharArray();
        String output = "";
        char[] outputString = new char[inputString.length];

        if (inputString[inputString.length - 1] == '0') {

            outputString[outputString.length - 1] = '#';
            for (int i = 0; i < inputString.length - 1; i++) {
                outputString[i] = coding(inputString[i]);
            }

        } else {

            if (isOdd(inputString[0]) && isOdd(inputString[inputString.length - 1])) {
                outputString[0] = 'X';
                outputString[outputString.length - 1] = 'X';
                for (int i = 1; i < inputString.length - 1; i++) {
                    outputString[i] = coding(inputString[i]);
                }
            } else if (!isOdd(inputString[0]) && !isOdd(inputString[inputString.length - 1])) {
                outputString[0] = '$';
                outputString[outputString.length - 1] = '$';
                for (int i = 1; i < inputString.length - 1; i++) {
                    outputString[i] = coding(inputString[i]);
                }
            } else {
                for (int i = 0; i < inputString.length; i++) {
                    outputString[i] = coding(inputString[i]);
                }
            }

        }

        output = toString(outputString);

        System.out.println("Coding in place...");
        System.out.println("Coded output:");
        System.out.println(output);

    }

    private static char coding(char digit) {
        char output;
        switch (digit) {
            case '0':
                output = '*';
                break;
            case '1':
                output = 'B';
                break;
            case '2':
                output = 'E';
                break;
            case '3':
                output = 'A';
                break;
            case '4':
                output = '@';
                break;
            case '5':
                output = 'F';
                break;
            case '6':
                output = 'K';
                break;
            case '7':
                output = '%';
                break;
            case '8':
                output = 'R';
                break;
            case '9':
                output = 'M';
                break;
            default:
                output = '.';
        }

        return output;

    }

    private static boolean isOdd(char digit) {
        boolean output;

        switch (digit) {
            case '0':
            case '2':
            case '4':
            case '6':
            case '8':
                output = false;
                break;
            default:
                output = true;
        }

        return output;
    }

    private static String toString(char[] chars) {
        String output = "";

        for (int i = 0; i < chars.length; i++) {
            output = output + chars[i];
        }

        return output;
    }

}
