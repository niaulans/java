public class Exam {
    public static void main(String[] args) {
        int[] nilai = {75, 88, 92, 67, 80};

        double sum = 0;
        int max = nilai[0];
        int min = nilai[0];

        for (int n: nilai) {
            sum += n;
            if (n > max) {
                max = n;
            }

            if (n < min) {
                min = n;
            }
        }
        
        System.out.println("Rata-rata: " + sum / nilai.length);
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah: " + min);

    }
}
