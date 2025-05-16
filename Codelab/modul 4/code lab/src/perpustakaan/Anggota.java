package perpustakaan;

public class Anggota implements Peminjaman {

    protected String nama;
    protected String idAnggota;

    protected String bukuPinjam;
    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    public void displayInfo() {
        System.out.printf("Anggota: %s (id: %s)\n", nama, idAnggota);
    }
    public void pinjamBuku(String judulBuku) {
        System.out.printf("%s meminjam buku (%s)\n", nama, judulBuku);
        this.bukuPinjam = judulBuku;
    }
    public void pinjamBuku(String judulBuku, int durasi) {
        System.out.printf("%s meminjam buku (%s) selama %d hari\n", nama, judulBuku, durasi);
        this.bukuPinjam = judulBuku;
    }
    public void kembalikanBuku() {
        System.out.printf("%s mengembalikan buku (%s)\n", nama, bukuPinjam);
    }
}