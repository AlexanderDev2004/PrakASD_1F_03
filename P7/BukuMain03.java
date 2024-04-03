package P7;
import java.util.Scanner;
public class BukuMain03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku03 data = new PencarianBuku03();
        int jmlbuku = 5;

        System.out.println("==========================");
        System.out.println("Masukan Data Buku secara urut dari kode buku yg terkecil : ");
        for (int i = 0 ; i < jmlbuku; i++) {
            System.out.println("=========================");
            System.out.println("Kode Buku \t:");
            int KodeBuku = s.nextInt();
            System.out.println("Judul Buku \t:");
            String JudulBuku = s1.nextLine();
            System.out.println("Tahun Terbit \t:");
            int TahunTerbit = s.nextInt(); 
            System.out.println("Pengarang \t:");
            String Pengarang = s1.nextLine();
            System.out.println("stock Buku \t :");
            int Stock = s.nextInt();

            Buku03 m = new Buku03(KodeBuku, JudulBuku, TahunTerbit, Pengarang, Stock);
            data.tambah(m);
        }
        System.out.println("===========================");
        System.out.println("Data Keseluruan Mahasiswa : ");

        System.out.println("==============================");
        System.out.println("data keseluran Buku :");
        data.tampil();

        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println("pencarian Data :");
        System.out.println("Masukan kode Buku yg di cari :");
        System.out.println("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Seacring");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilpoisisi(cari, posisi);
        
        
    }
}
