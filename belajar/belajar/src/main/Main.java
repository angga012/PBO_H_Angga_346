package main;

import perpustakaan.pengajar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //contoh pengajar
        pengajar pengajar1 = new pengajar("Anggara","346");
        pengajar1.tambahkanRekap (85);
        pengajar1.tambahkanRekap(30);
        pengajar1.tambahkanRekap(30);
        pengajar1.tambahkanRekap(20);
        pengajar1.tambahkanRekap(10);

        int pilihan = 2;
        do {
            System.out.println("\n === Nama Aplikasi===");
            System.out.println("1. Tampilkan Rekap Nilai Pengajar");
            System.out.println("2. keluar");
            System.out.println("pilih menu:");

            try {
                pilihan = input.nextInt();
                input.nextLine();
            }catch (Exception e ){
                System.out.println("input harus angka!");
                input.nextLine();
                continue;
            }
            switch (pilihan) {
                case 1:
                    System.out.println("\n---Data Pengajar---");
                    pengajar1.tampilkanIdentitas();
                    pengajar1.tampilkanJumlah();
                    break;
                case 2:
                    System.out.println("Keluar Dari Aplikasi");
                    break;
                default :
                    System.out.println("pilihan tidak valid!");

            }
        }while (pilihan != 2);
        input.close();
    }
}