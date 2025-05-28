public class Even {
    public static void main(String[] args) {

        int n = 2;
        while (n <= 100) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }

        int j = 2;
        while (j <= 100) {
            System.out.println(j);
            j += 2;
        }

        for (int i = 2; i <= 100; i++) {
            System.out.println(i);
            i+=2;
        }
    }
}
