package homework1;
import java.math.BigInteger;

public class hmwrk01 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(baseCase(n));
    }

    public static BigInteger baseCase(int index) {
        if (index ==0) return BigInteger.ONE;
        else if (index == 1) return BigInteger.ONE;
        return fibbonaci(1, index, BigInteger.ONE, BigInteger.ONE);

    }

    public static BigInteger fibbonaci(int location, int index, BigInteger a, BigInteger b) {
        if (location == index) return b;
        else {
            return fibbonaci(location + 1, index, b, a.add(b));
        }
    }
}


