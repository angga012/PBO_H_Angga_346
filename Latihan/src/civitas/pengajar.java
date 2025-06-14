package civitas;

import java.util.ArrayList;

public class pengajar extends civitass implements tampilkanRekap {
    private ArrayList<Integer> rekapNilai;

    public pengajar(String nama, String kodeUnik) {
        super(nama, kodeUnik);
        rekapNilai = new ArrayList<>();
    }

    public void tambahRekap(int nilai) {
        rekapNilai.add(nilai);
    }

    @Override
    public void tampilkanRekap() {
        System.out.println("Rekap Nilai (Bagian 1-5):");
        for (int i = 0; i < rekapNilai.size(); i++) {
            System.out.println("Bagian " + (i+1) + ": " + rekapNilai.get(i));
        }
    }
}
