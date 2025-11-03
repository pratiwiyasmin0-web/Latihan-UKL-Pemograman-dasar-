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

        //jawaban 2
        System.out.println("\n");
        System.out.print("Masukkan jumlah baris: ");
        int baris = masukan.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = masukan.nextInt();
        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom];
        System.out.println("\n");
        System.out.println("Masukan Matriks A : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = masukan.nextInt();
            }
        }
        System.out.println("\n");
         System.out.println("Masukan Matriks B :");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = masukan.nextInt();
            }
        }
        // Proses penjumlahan
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("\n");
         System.out.println("Hasil Penjumlahan Matriks C : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
 }
}
}

