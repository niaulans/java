package DataTypeAndException;

public class RethrowingExample {

    public static void main(String[] args) {
        try {
            dineOut(9, 50.00);
        } catch (Exception e) {
            System.out.println("Atempting to divide bill with too many diners");
        }
    }
    
    public static void dineOut(int people, double bill) throws Exception {
        double each = splitBill(bill, people);
        System.out.println("Bill for each person: " + each);
    }

    public static double splitBill(double bill, int people) throws Exception {
        if (people < 3) {
            return bill / people;
        } else {
            throw new Exception();
        }
    }
}
