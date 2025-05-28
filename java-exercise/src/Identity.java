import java.util.Scanner;

public class Identity {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String name = input.nextLine();
        
        System.out.print("Masukkan umur: ");
        int age = input.nextInt();

        System.out.print("Masukkan tinggi: ");
        int height = input.nextInt();

        System.out.println("Halo, nama saya " + name + ", umur saya " + age + " tahun dan tinggi saya " + height + " cm");

    }
}
