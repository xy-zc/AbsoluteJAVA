import java.util.Scanner;

public class ProgrammingProject2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("How many coupons do you have?");
            int coupons = keyboard.nextInt();

            if (coupons < 0) {
                System.out.println("You chose to EXIT!");
                flag = false;

            } else {

                int costOfCandy = 10, costOfGumball = 3;
                int noOfCandy = 0, noOfGumball = 0;
                int remainingCoupon = 0;

                if (coupons == 0) {
                    System.out.println("You have NO coupons AT ALL!!");
                } else if (coupons < 3) {
                    System.out.println(("You CANNOT afford ANY redeem!"));
                } else if (coupons < 10) {
                    noOfGumball = coupons / costOfGumball;
                    remainingCoupon = coupons % costOfGumball;
                    System.out.println("You can redeem " + noOfCandy + " Candy!");
                    System.out.println("BUT: You can redeem " + noOfGumball + " Gumballs!");
                    System.out.println("AND: You have " + remainingCoupon + " coupons LEFT!");
                } else {
                    noOfCandy = coupons / costOfCandy;
                    remainingCoupon = coupons % costOfCandy;
                    noOfGumball = remainingCoupon / costOfGumball;
                    remainingCoupon = remainingCoupon % costOfGumball;
                    System.out.println("You can redeem " + noOfCandy + " Candy!");
                    System.out.println("PLUS: You can redeem " + noOfGumball + " Gumballs!");
                    System.out.println("AND: You have " + remainingCoupon + " coupons LEFT!");
                }
            }
        }
    }
}
