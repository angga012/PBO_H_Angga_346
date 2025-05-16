package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Fiksi fiksi = new Fiksi("Bumi Manusia", "Pramoedya Ananta Toer");
        NonFiksi NonFiksi = new NonFiksi("The Alchemist", "Paulo Coelho");
        Anggota anggota1 = new Anggota("Anggara aribawa paramesti", "H103");
        Anggota anggota2 = new Anggota("taufik", "H346");
        NonFiksi.displayInfo();
        fiksi.displayInfo();
        System.out.println();
        anggota1.displayInfo();
        anggota2.displayInfo();

        System.out.println();

        anggota1.pinjamBuku(NonFiksi.getJudul());
        anggota2.pinjamBuku(fiksi.getJudul(), 7);

        System.out.println();
        anggota1.kembalikanBuku();
        anggota2.kembalikanBuku();
    }
}