public class Barang {
    private String nama ;
    private int stok ;

    public Barang(String nama, int stok ) {
        this.stok = stok;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
