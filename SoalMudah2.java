import java.util.Scanner;
public class SoalMudah2 {
    // jawaban 2
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("cek genap/ganjil");
        System.out.print("Masukkan angka: ");
        int angka = masukan.nextInt();
        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan GENAP\n");
        } else {
            System.out.println(angka + " adalah bilangan GANJIL\n");
        }
    }
}
