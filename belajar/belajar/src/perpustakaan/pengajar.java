package perpustakaan;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class pengajar extends model implements tampilkanJumlah{
    private ArrayList<Integer> rekapNilai;

    public pengajar(String nama, String kodeUnik){
        super(nama, kodeUnik);
        rekapNilai = new ArrayList<>();

    }
    public void tambahkanRekap(int nilai){
        rekapNilai.add(nilai);

    }
    @Override
    public void tampilkanJumlah(){
        System.out.println("Rekap Nilai (Bagian 1-5 ):");
        for (int i = 0; i < rekapNilai.size(); i++){
            System.out.println("Bagian " +(i +1) + ":" + rekapNilai.get(i));
        }
    }


}
