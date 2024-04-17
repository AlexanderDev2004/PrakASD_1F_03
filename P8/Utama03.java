package P8;
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
            System.out.println("5. EXIT ");
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
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan yang anda masukan salah");
            }
        }
    }
}
