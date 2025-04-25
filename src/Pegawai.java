public class Pegawai {
    private int nim;
    private String nama;
    private String golongan; // Golongan A, B, C, atau D

    // Constructor
    public Pegawai(int nim, String nama, String golongan) {
        this.nim = nim;
        this.nama = nama;
        setGolongan(golongan); // Golongan divalidasi di sini
    }

    // Setter dan Getter untuk nim dan nama
    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getGolongan() {
        return golongan;
    }

    // Setter untuk Golongan dengan validasi
    public void setGolongan(String golongan) {
        if (golongan.equals("A") || golongan.equals("B") || golongan.equals("C") || golongan.equals("D")) {
            this.golongan = golongan;
        } else {
            this.golongan = "D"; // Default jika golongan tidak valid
        }
    }

    // Metode untuk menghitung Gaji Pokok
    public double gajiPokok() {
        switch (golongan) {
            case "A":
                return 2500000; // Gaji pokok golongan A
            case "B":
                return 1500000; // Gaji pokok golongan B
            case "C":
                return 1000000; // Gaji pokok golongan C
            case "D":
                return 750000; // Gaji pokok golongan D (default)
            default:
                return 2000000; // Untuk safety, walau tidak diperlukan karena sudah divalidasi
        }
    }

    // Metode untuk menghitung Tunjangan
    public double tunjangan() {
        switch (golongan) {
            case "A":
                return 500000; // Tunjangan golongan A
            case "B":
                return 300000; // Tunjangan golongan B
            case "C":
                return 200000; // Tunjangan golongan C
            case "D":
                return 100000; // Tunjangan golongan D
            default:
                return 800000; // Untuk safety
        }
    }

    // Metode untuk menghitung Pajak (5% dari gaji pokok + tunjangan)
    public double pajak() {
        return 0.05 * (gajiPokok() + tunjangan());
    }

    // Metode untuk menghitung Gaji Total
    public double gajiTotal() {
        return gajiPokok() + tunjangan() - pajak();
    }
}
