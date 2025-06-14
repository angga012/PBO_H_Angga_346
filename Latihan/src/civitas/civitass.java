package civitas;

public abstract class civitass {
    protected String nama;
    protected String kodeUnik;

    public   civitass(String nama, String kodeUnik) {
        this.nama = nama;
        this.kodeUnik = kodeUnik;
    }

    public String getNama() {
        return nama;
    }

    public String getKodeUnik() {
        return kodeUnik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKodeUnik(String kodeUnik) {
        this.kodeUnik = kodeUnik;
    }

    public void tampilkanIdentitas() {
        System.out.println("Nama      : " + nama);
        System.out.println("Kode Unik : " + kodeUnik);
    }
}
