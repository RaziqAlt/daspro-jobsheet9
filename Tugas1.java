import java.util.Scanner;
import java.util.Arrays;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumlah = input.nextInt();
        while (jumlah <= 0) {
            System.out.print("Jumlah harus lebih dari 0. Masukkan kembali: ");
            jumlah = input.nextInt();
        }

        int[] nilai = new int[jumlah];
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / jumlah;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        System.out.println("\n===== REKAP NILAI MAHASISWA =====");
        System.out.println("Daftar nilai: " + Arrays.toString(nilai));
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("\nStatus kelulusan:");
        for (int i = 0; i < nilai.length; i++) {
            String status = nilai[i] > 70 ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": "
                    + nilai[i] + " - " + status);
        }
        input.close();
    }
}
