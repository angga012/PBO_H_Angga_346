package com.praktikum.main;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.praktikum.users.*;
import com.praktikum.data.Barang;

public class LoginSystem {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Barang> barangDilaporkan = new ArrayList<>();
    public static void barangDilaporkan(Barang barangHilang) {
        barangDilaporkan.add(barangHilang);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        userList.add(new Mahasiswa("Anggara Aribawa Paramesti", "202410370110346"));
        userList.add(new Admin("Admin346", "password346",
                " Anggara Aribawa Paramesti", "202410370110346", userList));

        int pilihan = 0;
        do {
            boolean cekLogin = false;
            System.out.println();
            System.out.println("Menu: ");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
                continue;
            }

            if (pilihan == 1) {
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();
                for (User user : userList) {
                    if (user instanceof Admin && user.login(username, password)) {
                        user.displayInfo();
                        user.displayAppMenu();
                        cekLogin = true;
                        break;
                    }
                }
                if (!cekLogin){
                    System.out.println("Login gagal! Username atau password salah!");
                }

            } else if (pilihan == 2) {

                System.out.print("Masukkan nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();
                for (User user : userList) {
                    if (user instanceof Mahasiswa && user.login(nama, nim)) {
                        user.displayInfo();
                        user.displayAppMenu();
                        cekLogin = true;
                        break;
                    }
                }
                if (!cekLogin){
                    System.out.println("Login gagal! Nama atau NIM salah!");
                }

            } else if (pilihan == 0) {
                System.out.println("Keluar dari program.");

            } else {
                System.out.println("Pilihan Tidak Valid!");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
