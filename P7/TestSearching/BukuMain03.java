package P7.TestSearching;
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
        
        Buku03 databBuku03 = data.FindBuku(cari);
        databBuku03.TampilDataBuku();
        data.Tampilpoisisi(cari, posisi);

        System.out.println();
        System.out.println("================================");
        System.out.println("Menggunakan Binary Searcing");
        posisi = data.FindBinarySearch(cari, 0, jmlbuku-1);
        data.Tampilpoisisi(cari, posisi);
        databBuku03.TampilDataBuku();
        
        System.out.println("=======================");
        System.out.println("Cari Data Buku yg di cari :");
        String CariJudul =s1.nextLine();

        System.out.println("=================================");
        System.out.println("Pencarian Judul Buku metode Sequential Reseacing");
        int JudulDD = data.FindJudulSeqSearcing(CariJudul);
        if (JudulDD > 1) {
            System.out.println("Judul Buku lebih dari 1 hasil dengan judul :" + CariJudul);
        }
        System.out.println("==================================");
        System.out.println("Pencarian Judul buku metode Binary reascing ");

        int posisiBil = data.FindJudulBinarySearcing(CariJudul, 0, jmlbuku-1);
        if (posisiBil == -1) {
            System.out.println("Judul Buku : " + CariJudul + "Di temukan" );
            data.listBK[posisiBil].TampilDataBuku();
        } else {
            System.out.println("Judul Buku : " + CariJudul + "Tidak temukan Silahkan Cari lagi" );
        }
    }
}