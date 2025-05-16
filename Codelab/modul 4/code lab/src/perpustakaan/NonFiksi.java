package perpustakaan;

public class NonFiksi extends Buku {

    public NonFiksi(String judul, String penulis){
        super(judul, penulis);
    }

    @Override
    public void displayInfo(){
        System.out.printf("perpustakaan.Buku Non-Fiksi: %s (Penulis: %s)\n", judul, penulis);
    }

    public String getJudul(){
        return judul;
    }

}
