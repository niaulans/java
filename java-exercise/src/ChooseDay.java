import java.util.Scanner;

public class ChooseDay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Hari: Senin");
                break;
            case 2:
                System.out.println("Hari: Selasa");
                break;
            case 3:
                System.out.println("Hari: Rabu");
                break;
            case 4:
                System.out.println("Hari: Kamis");
                break;
            case 5:
                System.out.println("Hari: Jumat");
                break;
            case 6:
                System.out.println("Hari: Sabtu");
                break;
            case 7:
                System.out.println("Hari: Minggu");
                break;
            default:
                System.out.println("Angka tidak valid");
                break;
        }
    }
}
