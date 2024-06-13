package UAS_03_AlexanderAgungRaya;

import java.util.Scanner;

public class peminjamanMain03 {
    static DoubleLinkedList03 mobil = new DoubleLinkedList03();
    static DoubleLinkedList03 transaksi = new DoubleLinkedList03();

    public static void main(String[] args) {
        mobil.addLast(new BarangRental03("TNKB-001", "Honda Beat", "motor", 2017, 10000));
        mobil.addLast(new BarangRental03("TNKB-002", "Honda vario", "motor", 2018, 10000));
        mobil.addLast(new BarangRental03("TNKB-003", "Toyota Innova", "Mobil", 2019, 30000));
        mobil.addLast(new BarangRental03("TNKB-004", "Toyota Yaris", "Mobil", 2021, 60000));
        mobil.addLast(new BarangRental03("TNKB-005", "Toyota Avanza", "Mobil", 2022, 25000));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========================");
            System.out.println("Peminjaman");
            System.out.println("========================");
            System.out.println("1. Daftar kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutan transaksi urut NO TNKB");
            System.out.println("5. Exit");
            System.out.println("Pilihlah menu (1-5) : ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    daftarKendaraan();
                    break;
                case 2:
                    peminjaman(sc);
                    break;
                case 3:
                    tampilkanSeluruhTransaksi();
                    break;
                case 4:
                    urutanTransaksi();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih menu dari 1 hingga 5.");
                    break;
            }
        }
    }

    
    public static void daftarKendaraan() {
        System.out.println("Daftar Kendaraan:");
        mobil.display();
    }

    public static void peminjaman(Scanner sc) {
        System.out.println("Peminjaman Kendaraan:");
        System.out.print("Masukkan kode transaksi: ");
        int kodeTransaksi = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Masukkan nama peminjam: ");
        String namaPeminjam = sc.nextLine();
        System.out.print("Masukkan lama pinjam (hari): ");
        int lamaPinjam = sc.nextInt();

        System.out.println("Pilih kendaraan yang akan dipinjam:");
        mobil.display();
        System.out.print("Masukkan nomor urut kendaraan: ");
        int pilihanKendaraan = sc.nextInt();

        BarangRental03 br = getBarangRentalByIndex(pilihanKendaraan);
        if (br != null) {
            TransaksiRental03 transaksiBaru = new TransaksiRental03(kodeTransaksi, namaPeminjam, lamaPinjam, br);
            transaksi.addLast(transaksiBaru);
            System.out.println("Peminjaman berhasil dilakukan. Total biaya: " + transaksiBaru.totalbiaya);
        } else {
            System.out.println("Kendaraan tidak ditemukan.");
        }
    }

    public static BarangRental03 getBarangRentalByIndex(int index) {
        Node03 current = mobil.head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return (BarangRental03) current.data;
            }
            current = current.next;
            count++;
        }
        return null;
    }

    public static void tampilkanSeluruhTransaksi() {
        System.out.println("Seluruh Transaksi:");
        transaksi.display();
        System.out.println("Jumlah Mobil : " + transaksi.size());
        

    }

    public static void urutanTransaksi() {
        System.out.println("Urutan Transaksi berdasarkan NO TNKB:");
        tampilkanSeluruhTransaksi();
    }
}
