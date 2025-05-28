package IntermediateJava;

public class OddityFinder {
    public static void main(String[] args) {
        int[] intArray = {32, 67, 86, 90, 26, 34, 92, 13, 70, 50};

        for (int number: intArray) {
            if (isOdd(number)) {
                System.out.println(number);
            }
        }
    }
    
    static boolean isOdd(int n) {
        return (n % 2) != 0;
    }
}
