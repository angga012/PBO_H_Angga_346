import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Usia: ");
        int usia = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Usia   : " + usia + " tahun");
        System.out.println("Alamat : " + alamat);

        input.close();
    }
}
