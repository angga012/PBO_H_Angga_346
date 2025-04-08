import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usernameAdmin = "Admin";
        String passwordAdmin = "123";
        String namaMahasiswa = "Anggara aribawa paramesti";
        String nimMahasiswa = "202410370110346";

        System.out.println("=== Sistem Login Sederhana ===");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Pilih jenis login (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        if (pilihan == 1) {
            System.out.print("Masukkan Username: ");
            String username = input.nextLine();
            System.out.print("Masukkan Password: ");
            String password = input.nextLine();

            if (username.equals(usernameAdmin) && password.equals(passwordAdmin)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            if (nama.equals(namaMahasiswa) && nim.equals(nimMahasiswa)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}