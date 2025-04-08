// Superclass KarakterGame
class KarakterGame {
    private String nama; // Nama karakter
    private int kesehatan; // Jumlah kesehatan karakter

    // Constructor untuk inisialisasi nama dan kesehatan
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // Getter untuk mendapatkan nama karakter
    public String getNama() {
        return nama;
    }

    // Setter untuk mengubah nama karakter
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk mendapatkan kesehatan karakter
    public int getKesehatan() {
        return kesehatan;
    }

    // Setter untuk mengubah kesehatan karakter
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // Method serang yang akan di-override oleh subclass
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getNama() + "!");
    }
}

// Subclass Pahlawan
class Pahlawan extends KarakterGame {
    // Constructor Pahlawan menggunakan super() untuk memanggil constructor superclass
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override method serang untuk memberikan efek serangan unik
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Orbital Strike!");
        target.setKesehatan(target.getKesehatan() - 20); // Mengurangi 20 poin kesehatan target
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

// Subclass Musuh
class Musuh extends KarakterGame {
    // Constructor Musuh menggunakan super() untuk memanggil constructor superclass
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override method serang untuk memberikan efek serangan unik
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Snake Bite!");
        target.setKesehatan(target.getKesehatan() - 15); // Mengurangi 15 poin kesehatan target
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

// Kelas Main
public class cl3 {
    public static void main(String[] args) {
        // Membuat objek karakter umum
        KarakterGame umum = new KarakterGame("Karakter Umum", 100);

        // Membuat objek Pahlawan dengan nama "Brimstone" dan kesehatan 150
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);

        // Membuat objek Musuh dengan nama "Viper" dan kesehatan 200
        Musuh viper = new Musuh("Viper", 200);

        // Menampilkan status awal kesehatan Pahlawan dan Musuh
        System.out.println("Kesehatan awal Brimstone: " + brimstone.getKesehatan());
        System.out.println("Kesehatan awal Viper: " + viper.getKesehatan());
        System.out.println();

        // Simulasi pertarungan
        brimstone.serang(viper); // Brimstone menyerang Viper
        System.out.println();
        viper.serang(brimstone); // Viper menyerang Brimstone
    }
}
