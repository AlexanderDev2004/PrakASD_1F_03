package P12.Film03;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class FilmMain03 {
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        DoubleLinkedLists dataFilm = new DoubleLinkedLists();

        try {
            while (true) {
                System.out.println("====================================");
                System.out.println("Data film layar lebar");
                System.out.println("====================================");
                System.out.println("1. Tambah Data Film");
                System.out.println("2. Tambah Data Akhir");
                System.out.println("3. Tambah Data Index tertentu");
                System.out.println("4. Hapus Data Pertama Film");
                System.out.println("5. Hapus Data terakhir Film");
                System.out.println("6. Hapus Data tertentu Film");
                System.out.println("7. Cetak Data Film");
                System.out.println("8. Cari Id Film");
                System.out.println("9. Urut Data Rating Film (Desc) Secara Permanen");
                System.out.println("10. Urut Data Rating Film (Desc) Secara Sementara");
                System.out.println("11. Keluar");
                System.out.println("====================================");
                System.out.print("Pilih menu : ");
                int menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        dataFilm.addFirst(inputFilm());
                        break;
                    case 2:
                        dataFilm.addLast(inputFilm());
                        break;
                    case 3:
                        System.out.print("Masukan di urutan ke-: ");
                        int index = sc.nextInt();
                        dataFilm.add(inputFilm(), index);
                        break;
                    case 4:
                        System.out.println("Film " + dataFilm.removeFirst() + " Telah Dihapus\n");
                        break;
                    case 5:
                        System.out.println("Film " + dataFilm.removeLast() + " Telah Dihapus\n");
                        break;
                    case 6:
                        System.out.print("Hapus data index ke-: ");
                        int idxHps = sc.nextInt();
                        System.out.println("Film " + dataFilm.remove(idxHps) + " Telah Dihapus\n");
                        break;
                    case 7:
                        dataFilm.print();
                        break;
                    case 8:
                        System.out.print("Masukan ID Film: ");
                        int cariId = sc.nextInt();
                        System.out.println("Film dengan ID: " + cariId + " ada di node ke-" + dataFilm.indexOf(cariId));
                        break;
                    case 9:
                        System.out.println("Urutan Berdasarkan ID Film (Desc) Secara Permanen");
                        dataFilm.sortByRatingDescPermanen();
                        break;
                    case 10:
                        System.out.println("Urutan Berdasarkan ID Film (Desc) Secara Sementara");
                        dataFilm.sortByRatingDesSementara();
                        break;
                    case 11:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan Tidak Tersedia");
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Silakan masukkan angka.");
            sc.next(); 
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan : " + e.getMessage());
        }
    }

    private static Film03 inputFilm() {
        System.out.print("Masukkan ID: ");
        int id = sc.nextInt();
        System.out.print("Masukkan Judul: ");
        sc.nextLine(); 
        String judul = sc.nextLine();
        System.out.print("Masukkan Rating: ");
        double rating = sc.nextDouble();
        return new Film03(id, judul, rating);
    }
}
