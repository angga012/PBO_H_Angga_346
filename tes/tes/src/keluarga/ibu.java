package keluarga;
public class ibu extends ayah {
    private String melahirkan;

    public ibu(String nama, String umur, String melahirkan){
        super(nama,umur);
        this.melahirkan = melahirkan;
    }

    public String getMelahirkan(){
        return melahirkan;
    }

    public void setMelahirkan(String melahirkan) {
        this.melahirkan = melahirkan;
    }
}