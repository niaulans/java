import java.util.Scanner;

public class CheckGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilaimu: ");
        double nilai = input.nextDouble();

        if (nilai < 0 || nilai > 100) {
            System.out.print("Nilai tidak valid");
        } else  if (nilai >= 85) {
            System.out.print("Grade: A");
        } else if (nilai >= 70) {
            System.out.print("Grade: B");
        } else if (nilai >= 60) {
            System.out.print("Grade: C");
        } else if (nilai >= 50) {
            System.out.print("Grade: D");
        } else {
            System.out.print("Grade: E");
        }
    }
}
