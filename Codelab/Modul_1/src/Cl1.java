import java.util.Scanner;
import java.time.LocalDate;

public class Cl1 {  // Pastikan nama kelas sesuai dengan nama file
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== INPUT DATA DIRI ===");

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jenisKelamin = scanner.next().toUpperCase();

        System.out.print("Masukkan tahun lahir: ");
        while (!scanner.hasNextInt()) { // Validasi input harus angka
            System.out.println("Harap masukkan angka yang valid.");
            scanner.next();
        }
        int tahunLahir = scanner.nextInt();

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        System.out.println("\n======== DATA DIRI ========");
        System.out.println("Nama\t\t\t: " + nama);

        if (jenisKelamin.equals("L")) {
            System.out.println("Jenis Kelamin\t: Laki-Laki");
        } else if (jenisKelamin.equals("P")) {
            System.out.println("Jenis Kelamin\t: Perempuan");
        } else {
            System.out.println("Jenis Kelamin\t: Input tidak valid");
        }

        System.out.println("Umur\t\t\t: " + umur);
        System.out.println("===========================");

        scanner.close();
    }
}
