public class ExamMethod {
    public static void main(String[] args) {
        int[] nilai = {75, 88, 92, 67, 80};

        System.out.println("Rata-rata: " + calculateAverage(nilai));
        System.out.println("Tertinggi: " + findMax(nilai));
        System.out.println("Terendah: " + findMin(nilai));

    }

    static double calculateAverage(int[] arr) {
        double sum = 0;
        for (int a: arr) {
            sum += a;
        }
        double average = sum / arr.length;
        return average;
            
    }

    static int findMax(int[] arr){
        int max = arr[0];
        for (int a: arr) {
            if (a > max) max = a;
        }
        return max;
    }

    static int findMin(int[] arr){
        int min = arr[0];
        for (int a: arr) {
            if(a < min) min = a;
        }
        return min;
    }
}
