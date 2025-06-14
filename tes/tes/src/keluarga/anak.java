package keluarga;

import java.util.ArrayList;

public class anak extends ayah implements tampilkanInfo {
    private ArrayList<Integer> rekapNilai;
    public anak(String nama, String umur){
        super(nama,umur);
        rekapNilai = new ArrayList<>();
    }
    public void tampilkanrekap(int nilai){
        rekapNilai.add(nilai);
    }
    @Override
    public void tampilkanInfo(){
        System.out.println("rekap nilai(bagian 1-5):");
        for (int i = 0; i<rekapNilai.size();i++){
            System.out.println("bagian" + (i+1)+":"+rekapNilai.get(i));
        }
    }



}
