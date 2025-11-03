import java.util.Scanner;
public class Soal2Sedangno2 {
    //jawaban 2
    // Fungsi dengan parameter
    static double hitungVolume(double r, double t) {
        double hasil =3.14 * r * r * t;
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi (cm): ");
        double t = input.nextDouble();

        double volume = hitungVolume(r, t);

        System.out.println("Volume tabung = " + volume + "cm³");
}
}