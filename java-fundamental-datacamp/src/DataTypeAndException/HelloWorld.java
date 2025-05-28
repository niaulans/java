package DataTypeAndException;

import java.math.BigDecimal;

public class HelloWorld {
    public static void main(String[] args) {
        double d = 9.123456789;

        BigDecimal bigDec = new BigDecimal(9.123456789);
        BigDecimal ten = new BigDecimal(10);
        BigDecimal hundred = new BigDecimal(100);

        d = d*10;
        d = d/100;

        bigDec = bigDec.multiply(ten);
        bigDec = bigDec.divide(hundred);

        System.out.println(d);
		System.out.println(bigDec);
    }
}
