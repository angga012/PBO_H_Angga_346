 package keluarga;
public abstract class ayah {
    protected String nama;
    protected String umur;

    public ayah(String nama, String umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getumur() {
        return umur;
    }

    public void setumur(String umur) {
        this.umur = umur;

    }
}