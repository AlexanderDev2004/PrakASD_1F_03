import java.util.Scanner;

public class VaksinMain03 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        Scanner sx1 = new Scanner(System.in);

        DoubleLinkedLists pasien = new DoubleLinkedLists();

        try {
            while (true) {
                System.out.println("====================================");
                System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
                System.out.println("====================================");
                System.out.println("1. Tambah Data Penerima Vaksin");
                System.out.println("2. Hapus Data Pengantri Vaksin");
                System.out.println("3. Daftar Penerima Vaksin");
                System.out.println("4. Keluar");
                System.out.println("====================================");
                System.out.print("Pilih Menu : ");
                int pilih = sx.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.print("Nomor Antrian : ");
                        int nomerAntrian = sx.nextInt();
                        System.out.print("Nama Penerima : ");
                        String nama = sx1.nextLine();
                        Pasien03 tempPenerima = new Pasien03(nomerAntrian, nama);
                        pasien.Enqueue(tempPenerima);
                        break;
                    case 2:
                        pasien.dequeue();
                        break;
                    case 3:
                        pasien.print();
                        System.out.println("Sisa Antrian :" + pasien.size());
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan Tidak Tersedia");
                        break;
                }
            }    
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan : " + e.getMessage());
        }        
    }
}
