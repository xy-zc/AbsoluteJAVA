import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ProgrammingProject5 {

    public static void main(String[] args) {

        final int PRINCIPAL = 1000;
        final double INTEREST_RATE = 1.5; // yearly rate of 18% = monthly interest of 1.5%
        final int MONTHLY_REPAYMENT = 50;

        NumberFormat dollarFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormat percentageFormatter = new DecimalFormat("##0.##%");

        System.out.println("You borrowed " + dollarFormatter.format(PRINCIPAL) +
                " at the start. Your interest rate is " + percentageFormatter.format(INTEREST_RATE / 100) +
                " per month. You monthly repayment is fixed to " + dollarFormatter.format(MONTHLY_REPAYMENT) + ".");

        double remainingDebt = PRINCIPAL;
        int months = 0;
        double totalInterest = 0.00;

        while (remainingDebt > 0) {
            double interestPaid = remainingDebt * INTEREST_RATE / 100;
            double repayment = 0.0;

            if (remainingDebt + interestPaid > 50) {
                repayment = MONTHLY_REPAYMENT;
            } else {
                repayment = remainingDebt + interestPaid;
            }

            double principlePaid = repayment - interestPaid;
            remainingDebt -= principlePaid;

            months++;
            totalInterest += interestPaid;

            System.out.printf("In month %2d", months);
            System.out.println(", your repayment is " + dollarFormatter.format(repayment) +
                    ". This comprises of " + dollarFormatter.format(principlePaid) + " paid for principal and " +
                    dollarFormatter.format(interestPaid) + " paid for interest. Your remaining debt is " +
                    dollarFormatter.format(remainingDebt) + "!");
        }

        System.out.println("Congratulations! You have paid our all debts in " + months +
                " months, and you have paid in total " + dollarFormatter.format(totalInterest) + " interest!!");

    }

}
