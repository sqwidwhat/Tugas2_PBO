import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int pilihan;

            do {
                System.out.println("===== TUGAS 2 =====");
                System.out.println("1. Luas Alas Balok");
                System.out.println("2. Luas Permukaan Balok");
                System.out.println("3. Setter dan Getter (Validasi Nilai)");
                System.out.println("4. Volume Kubus");
                System.out.println("5. Pegawai");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan panjang balok: ");
                        double p = input.nextDouble();
                        System.out.print("Masukkan lebar balok: ");
                        double l = input.nextDouble();
                        Balok balok1 = new Balok(p, l, 1); // tinggi diisi sembarang (1)
                        balok1.hitungLuasAlas();
                    }
                    case 2 -> {
                        System.out.print("Masukkan panjang balok: ");
                        double p = input.nextDouble();
                        System.out.print("Masukkan lebar balok: ");
                        double l = input.nextDouble();
                        System.out.print("Masukkan tinggi balok: ");
                        double t = input.nextDouble();
                        Balok balok2 = new Balok(p, l, t);
                        balok2.hitungLuasPermukaan();
                    }
                    case 3 -> {
                        System.out.println("=== Uji Validasi Setter dan Getter ===");
                        System.out.print("Masukkan panjang balok: ");
                        double p = input.nextDouble();
                        System.out.print("Masukkan lebar balok: ");
                        double l = input.nextDouble();
                        System.out.print("Masukkan tinggi balok: ");
                        double t = input.nextDouble();

                        Balok balok3 = new Balok(p, l, t);

                        System.out.println("\n=== Hasil Validasi Ukuran Balok ===");
                        System.out.println("Panjang: " + balok3.getP());
                        System.out.println("Lebar  : " + balok3.getL());
                        System.out.println("Tinggi : " + balok3.getT());
                    }
                    case 4 -> {
                        System.out.print("Masukkan panjang sisi kubus: ");
                        double sisi = input.nextDouble();
                        Balok kubus = new Balok(sisi);
                        kubus.hitungVolume();
                    }
                    case 5 -> {
                        System.out.print("Masukkan NIM: ");
                        int nim = input.nextInt();
                        input.nextLine(); // buang newline

                        System.out.print("Masukkan Nama: ");
                        String nama = input.nextLine();

                        System.out.print("Masukkan Golongan (A/B/C/D): ");
                        String golongan = input.nextLine().toUpperCase();

                        Pegawai pegawai = new Pegawai(nim, nama, golongan);

                        System.out.println("\n=== Data Pegawai ===");
                        System.out.println("NIM         : " + pegawai.getNim());
                        System.out.println("Nama        : " + pegawai.getNama());
                        System.out.println("Golongan    : " + pegawai.getGolongan());
                        System.out.println("Gaji Pokok  : Rp " + pegawai.gajiPokok());
                        System.out.println("Tunjangan   : Rp " + pegawai.tunjangan());
                        System.out.println("Pajak       : Rp " + pegawai.pajak());
                        System.out.println("Gaji Total  : Rp " + pegawai.gajiTotal());

                    }
                    case 0 -> System.out.println("Terima kasih!");
                    default -> System.out.println("Pilihan tidak valid.");
                }

                System.out.println();
            } while (pilihan != 0);
        }
    }
}