package DataTypeAndException;

import java.math.BigDecimal;

public class SplitTheBillFinally {
    public static void main(String[] args) {
        BigDecimal bill = new BigDecimal(125.50);
        computeEachBill(bill, 5);
        computeEachBill(bill, 0);
    }   
    
    public static void computeEachBill(BigDecimal bill, int people) {
        
        BigDecimal individualBill = new BigDecimal(0);
		BigDecimal numPeople = new BigDecimal(people);

        try {
            individualBill = bill.divide(numPeople);
        } catch (ArithmeticException e) {
            System.out.println("You didn't provide a positive number of people to split the bill among");  
            numPeople = new BigDecimal(2);
			individualBill = bill.divide(numPeople);           
        } finally {
            System.out.println("Bill for each person is: " + individualBill);
        }
    }
}
