package IntermediateJava;

public class Breaker {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i*=2) {
            System.out.println(i);

            if (i > 8) {
                break;
            }
        }
        System.out.println("Broke out of the loop");
    }
}
