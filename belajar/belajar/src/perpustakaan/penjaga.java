package perpustakaan;
public class penjaga extends model {
    private String dijaga;
    public penjaga(String nama, String umur, String dijaga){
        super(nama,umur);
        this.dijaga = dijaga;
    }

    public String getDijaga() {
        return dijaga;
    }

    public void setDijaga(String dijaga) {
        this.dijaga = dijaga;
    }
}