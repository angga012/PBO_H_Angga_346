
package perpustakaan;

public class Fiksi extends Buku{

    public Fiksi(String judul, String penulis){
        super(judul, penulis);
    }

    @Override
    public void displayInfo(){
        System.out.printf("perpustakaan.Buku Fiksi: %s (Penulis: %s)\n", judul, penulis);
    }

    public String getJudul(){
        return judul;
    }

}
