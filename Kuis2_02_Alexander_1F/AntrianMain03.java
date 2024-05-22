package Kuis2_02_Alexander_1F;

import java.util.Scanner;

public class AntrianMain03 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // penyimpanan data antrian dan pesanan
        DoubleLinkedLists03 antrian = new DoubleLinkedLists03();
        antrian.Enqueue(new pembeli03("001", "Alex", "0894123456"), new pesanan03("001", "Mie Ayam", 2000));
        antrian.Enqueue(new pembeli03("002", "Dedy", "0895777777"), new pesanan03("002", "Bakso", 1000));
        antrian.Enqueue(new pembeli03("003", "Yefta", "0894111111"), new pesanan03("003", "Rujak Soto", 3000));
        antrian.Enqueue(new pembeli03("004", "Roky", "0894222222"), new pesanan03("004", "Soto Ayam", 4000));

        try {
            while (true) {
                System.out.println("====================================");
                System.out.println("PENGANTRI pesanan makanan");
                System.out.println("====================================");
                System.out.println("1. Tambah Data Antrian");
                System.out.println("2. Daftar Antrian");
                System.out.println("3. Hapus Data Antrian");
                System.out.println("4. Laporan urutan pesanan by nama ");
                System.out.println("5. Hitung total pendapatan");
                System.out.println("6. Keluar");
                System.out.println("====================================");
                System.out.print("Pilih Menu (1-6): ");
                int pilih = sc.nextInt();
                sc.nextLine();
                switch (pilih) {
                    case 1:
                        System.out.print("Nomor Antrian: ");
                        String nomerAntrian = sc.nextLine();
                        System.out.print("Nama Antrian: ");
                        String nama = sc.nextLine();
                        System.out.print("Nomor Telepon: ");
                        String noTelp = sc.nextLine();
                        System.out.print("Nama Pesanan: ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga: ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        antrian.Enqueue(new pembeli03(nomerAntrian, nama, noTelp), new pesanan03(nomerAntrian, namaPesanan, harga));
                        break;
                    case 2:
                        antrian.print();
                        System.out.println("Sisa Antrian: " + antrian.size());
                        break;
                    case 3:
                        antrian.Dequeue();
                        break;
                    case 4:
                        antrian.printSortedByName();
                        break;
                    case 5:
                        int totalRevenue = antrian.calculateTotalRevenue();
                        System.out.println("Total Pendapatan: " + totalRevenue);
                        break;
                    case 6:
                        System.out.println("Terima Kasih");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan Tidak Tersedia");
                }
            }
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
