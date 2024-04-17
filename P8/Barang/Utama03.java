package P8.Barang;
import java.util.Scanner;

public class Utama03 {
    public static void main(String[] args) {
        Gudang03 Gudang = new Gudang03(7);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang ");
            System.out.println("3. Tampilkan Tumpukan Barang ");
            System.out.println("4. Tampilkan Barang Teratas ");
            System.out.println("5. Tampilkan Barang Terbawah ");
            System.out.println("6. Cari Barang ");
            System.out.println("7. EXIT ");
            System.out.print("Pilihlah menu :");
            int pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukan Kode Barang : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukan Nama Barang : ");
                    String Nama = sc.nextLine();
                    System.out.print("Masukan Nama Kategori : ");
                    String Kategori = sc.nextLine();
                    Barang03 BarangBaru = new Barang03(kode, Nama, Kategori);
                    Gudang.TambahBarang(BarangBaru);
                    break;
                case 2:
                    Gudang.AmbilBarang();
                    break;
                case 3:
                    Gudang.TampilkanBarang();
                    break;
                case 4: 
                    Gudang.LihatBarangTeratas();
                    break;
                case 5:
                    Gudang.LihatBarangTerbawah();
                    break;
                case 6:
                   System.out.print("Masukan Nama Barang : ");
                   String NamaBarang = sc.nextLine();
                   Barang03 Barang = Gudang.CariBarang(NamaBarang);
                   if (Barang == null) {
                       System.out.println("Barang Tidak Ditemukan");
                   } else {
                       System.out.println("Barang Ditemukan");
                       System.out.println("Kode Barang : " + Barang.Kode);
                       System.out.println("Nama Barang : " + Barang.Nama);
                       System.out.println("Kategori : " + Barang.Kategori);
                   }
                   break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan yang anda masukan salah");
            }
        }
    }
}
