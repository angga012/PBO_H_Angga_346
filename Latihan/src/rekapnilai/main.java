package rekapnilai;

import civitas.pengajar;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Contoh data pengajar
        pengajar pengajar1 = new pengajar("Anggara", "346");
        pengajar1.tambahRekap(85);
        pengajar1.tambahRekap(90);
        pengajar1.tambahRekap(78);
        pengajar1.tambahRekap(88);
        pengajar1.tambahRekap(92);

        int pilihan =  2;

        do {
            System.out.println("\n=== MENU APLIKASI ===");
            System.out.println("1. Tampilkan Rekap Nilai Pengajar");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = input.nextInt();
                input.nextLine(); // bersihkan buffer
            } catch (Exception e) {
                System.out.println("Input harus angka!");
                input.nextLine(); // bersihkan buffer
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- DATA PENGAJAR ---");
                    pengajar1.tampilkanIdentitas();
                    pengajar1.tampilkanRekap();
                    break;
                case 2:
                    System.out.println("Keluar dari aplikasi...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 2);

        input.close();
    }
}
