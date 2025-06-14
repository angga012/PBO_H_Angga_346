 package perpustakaan;

public abstract class model {
    protected String nama;
    protected String buku;

    public model(String nama, String buku) {
        this.nama = nama;
        this.buku = buku;
    }

    public String getBuku() {
        return buku;
    }

    public void setBuku(String buku) {
        this.buku = buku;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilkanIdentitas() {
        System.out.println("nama :" + nama);
        System.out.println("buku :" + buku);


    }
}

