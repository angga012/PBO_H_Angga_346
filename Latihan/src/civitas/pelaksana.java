package civitas;

public class pelaksana extends civitass {
    private String kelasDiajar;

    public pelaksana (String nama, String kodeUnik, String kelasDiajar) {
        super(nama, kodeUnik);
        this.kelasDiajar = kelasDiajar;
    }

    public String getKelasDiajar() {
        return kelasDiajar;
    }

    public void setKelasDiajar(String kelasDiajar) {
        this.kelasDiajar = kelasDiajar;
    }
}
