import java.util.Scanner;
public class Soal3Sulit {
    //Jawaban 1
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = masukan.nextInt();
        double total = 0;
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Nilai siswa ke-" + i + ": ");
            double nilai = masukan.nextDouble();
            total += nilai;
        }
        double rata = total / jumlah;
        System.out.println("Rata-rata nilai = " +rata);
 }
}


