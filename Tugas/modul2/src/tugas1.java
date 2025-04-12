import java.util.Scanner;

// Kelas Admin
class Admin {
    private final String usernameAdmin = "Admin";
    private final String passwordAdmin = "123";

    public boolean login(String username, String password) {
        return username.equals(usernameAdmin) && password.equals(passwordAdmin);
    }
}

// Kelas Mahasiswa
class Mahasiswa {
    private final String namaMahasiswa = "Anggara aribawa paramesti";
    private final String nimMahasiswa = "202410370110346";

    public boolean login(String nama, String nim) {
        return nama.equals(namaMahasiswa) && nim.equals(nimMahasiswa);
    }

    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("NIM: " + nimMahasiswa);
    }
}

// Kelas utama LoginSystem
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println(" Sistem Login Sederhana ");
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

            if (admin.login(username, password)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
