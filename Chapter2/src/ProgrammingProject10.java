import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class ProgrammingProject10 {

    public static void main(String[] args) {

        String[] items = new String[3];
        int[] quantities = new int[3];
        double[] prices = new double[3];
        double[] totals = new double[3];

        Scanner input = null;

        try {
            input = new Scanner(new FileInputStream(
                    "E:/IdeaProjects/AbsoluteJAVA/Chapter2/src/ProgrammingProject10Input.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not Found!");
            System.exit(0);
        }


        for (int i = 0; i < items.length; i++) {

            System.out.println("Input name of item " + (i + 1) + ":");
            items[i] = input.nextLine();

            System.out.println("Input quantity of item " + (i + 1) + ":");
            quantities[i] = input.nextInt();
            input.nextLine();

            System.out.println(("input price of item " + (i + 1) + ":"));
            prices[i] = input.nextDouble();
            input.nextLine();

            totals[i] = quantities[i] * prices[i];
        }

        double taxRate = 6.25;
        double subtotal = 0;

        System.out.println("Your bill:");
        System.out.println();
        System.out.printf("%-30s%-10s%-10s%-10s%n", "Item", "Quantity", "Price", "Total");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-30s%-10d%-10.2f%-10.2f%n", items[i], quantities[i], prices[i], totals[i]);
            subtotal = subtotal + totals[i];
        }

        double tax = (taxRate * subtotal) / 100;
        double total = subtotal + tax;

        System.out.printf("%-50s%-10.2f%n", "Subtotal", subtotal);
        DecimalFormat format1 = new DecimalFormat("#0.##%");
//        DecimalFormat format2 = new DecimalFormat("#0.##");
        System.out.printf("%-50s", format1.format(taxRate / 100) + " sales tax");
//        System.out.println(format2.format(tax));
        System.out.printf("%5.2f%n", tax);
        System.out.printf("%-50s%-10.2f%n", "Total", total);

    }

}
