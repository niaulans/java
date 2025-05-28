package DataTypeAndException;

import java.util.logging.*;

public class SplitTheBillLogging {
    
    private static Logger logger = Logger.getLogger("SplitTheBillLogging");

    public static void main(String[] args) {
        computeEachBill(150, 5);
        computeEachBill(100, 0);
    }

    public static void computeEachBill(int bill, int people) {
        try {
            int ea = bill / people;
            logger.log(Level.INFO, "Bill for each person is: " + ea);
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "You forgot to provide a positive number of people for splitting: " + bill);
        }
    }
}
