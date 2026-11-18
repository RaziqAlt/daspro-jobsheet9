import java.util.Scanner;

public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = {78, 65, 90, 55, 88, 72};

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key
                        + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + key
                    + " tidak ditemukan dalam data nilai mahasiswa.");
        }
        input.close();
    }
}
