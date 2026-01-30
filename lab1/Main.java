package lab1;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal n1 = new BigDecimal("1");
        BigDecimal n2 = new BigDecimal("2");
        BigDecimal n3 = new BigDecimal("3");
        BigDecimal n4 = new BigDecimal("4");
        BigDecimal n5 = new BigDecimal("5");

        BigDecimal ans1 = n1.add(n2);
        System.out.println(ans1);

        BigDecimal ans2 = n2.multiply(n3);
        System.out.println(ans2);

        BigDecimal ans3 = n1.subtract(n2.subtract(n3.subtract(n4)));
        System.out.println(ans3);

        BigDecimal ans4 = n1.subtract(n2).subtract(n3).subtract(n4);
        System.out.println(ans4);

        BigDecimal ans5 = n2.multiply(n3).subtract(n4.multiply(n5));
        System.out.println(ans5);



        System.out.println("          .-.        \n " +
                           "       _( \" )_     \n " +
                           "      (_  :  _)     \n " +
                           "        / ' \\      \n " +
                           "       (_/^\\_)     \n " );
    }
}
