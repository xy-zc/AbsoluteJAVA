import java.text.DecimalFormat;

public class DecimalFormatDemo {

    public static void main(String[] args) {

        DecimalFormat eNotation1 = new DecimalFormat("#0.###E0");
        DecimalFormat eNotation2 = new DecimalFormat("00.###E0");

        System.out.println("E Notation: #0.###E0");
        System.out.println(eNotation1.format(123.45));

        System.out.println("E Notation: 00.###E0");
        System.out.println(eNotation2.format(123.45));

    }


}
