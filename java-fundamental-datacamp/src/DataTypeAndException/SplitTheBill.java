package DataTypeAndException;

import java.math.BigDecimal;

public class SplitTheBill {
    public static void main(String[] args) {
        BigDecimal bill = new BigDecimal(125.50);
        computeEachBill(bill, 5);
        computeEachBill(bill, 0);
    }   
    
    public static void computeEachBill(BigDecimal bill, int people) {
        try {
            BigDecimal numPeople = new BigDecimal(people);
            BigDecimal individualBill = bill.divide(numPeople);
            System.out.println("Bill for each person is: " + individualBill);
        } catch (ArithmeticException e) {
            System.out.println("You didn't provide a positive number of people to split the bill among");
        }
    }
}
