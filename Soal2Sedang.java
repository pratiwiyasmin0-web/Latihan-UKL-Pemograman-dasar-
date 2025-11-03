import java.util.Scanner;

public class Soal2Sedang {

    //soal 2 Sedang
    //jawaban 1 (faktorial)
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan bilangan positif: ");
        int n = masukan.nextInt();
        long faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }
        System.out.println(" Maka Faktorial dari " + n + " adalah: " + faktorial);}
}
