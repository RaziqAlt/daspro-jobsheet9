import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("===== MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.print("\nCari nama menu: ");
        String cari = input.nextLine();
        int indeksCari = cariMenu(menu, cari);
        if (indeksCari >= 0) {
            System.out.println(menu[indeksCari] + " tersedia. Harga: Rp" + harga[indeksCari]);
        } else {
            System.out.println("Menu \"" + cari + "\" tidak tersedia.");
        }

        System.out.print("\nMasukkan jumlah item pesanan: ");
        int jumlah = input.nextInt();
        while (jumlah <= 0) {
            System.out.print("Jumlah harus lebih dari 0. Masukkan kembali: ");
            jumlah = input.nextInt();
        }
        input.nextLine();

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            while (true) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String nama = input.nextLine();
                int indeks = cariMenu(menu, nama);
                if (indeks >= 0) {
                    pesanan[i] = menu[indeks];
                    hargaPesanan[i] = harga[indeks];
                    total += hargaPesanan[i];
                    break;
                } else {
                    System.out.println("Menu tidak tersedia. Silakan pilih menu pada daftar.");
                }
            }
        }

        System.out.println("\n===== STRUK PEMESANAN =====");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("Total biaya: Rp" + total);
        input.close();
    }

    public static int cariMenu(String[] daftar, String nama) {
        for (int i = 0; i < daftar.length; i++) {
            if (daftar[i].equalsIgnoreCase(nama.trim())) {
                return i;
            }
        }
        return -1;
    }
}
