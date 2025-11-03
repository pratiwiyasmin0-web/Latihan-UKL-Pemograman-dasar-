import java.util.Scanner;
public class Soal1Mudah {
// soal Mudah No 1.
    //jawaban 1.
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        double panjang,lebar,tinggi;
        System.out.println("Progamn perhitungan biaya Pengiriman ");
        // Input bagian volume
        System.out.print("Masukkan panjang (cm): ");
        panjang = masukan.nextDouble();
        System.out.print("Masukkan lebar (cm): ");
        lebar = masukan.nextDouble();
        System.out.print("Masukkan tinggi (cm): ");
        tinggi = masukan.nextDouble();
        // Hitung volume
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume paket: " + volume + " cm³");
        
        System.out.println("\n");
        
        // Input berat & jarak
        double berat,jarak;
        System.out.print("Masukkan berat paket (kg): ");
        berat = masukan.nextDouble();
        System.out.print("Masukkan jarak tempuh (km): ");
        jarak = masukan.nextDouble();
        // Tentukan biaya per kg
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }
        // Hitung biaya awal
        double total = berat * biayaPerKg;
        // Biaya tambahan jika volume besar
        if (volume > 100) {
            total += 50000;
        }

        System.out.println("\n");
        System.out.println("hasil");
        System.out.println("Volume Paket       : " + volume + " cm³");
        System.out.println("Biaya per Kg       : Rp " + biayaPerKg);
        System.out.println("Maka Total Biaya Kirim  : Rp " + total + "\n");
        // jawaban 2
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
