public class ProgrammingProject6 {

    public static void main(String[] args) {

        int principal = 1000;
        double interestRate = 5.0; // in percentage
        int years = 5;

        double interest = (principal * interestRate * years) / 100;
        System.out.println("Your principal is " + principal + "!");
        System.out.println("Your interest rate is " + interestRate + "%!!");
        System.out.println("After " + years + " years, you get simple interest of " + interest + "!!!");

    }

}
