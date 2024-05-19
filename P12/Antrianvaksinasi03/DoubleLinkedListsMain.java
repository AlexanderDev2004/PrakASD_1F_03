package P12.Antrianvaksinasi03;
import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        int pilih;
        do {
            System.out.println("=======================");
            System.out.println("Menu : ");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus data pengantri vaksinasi");
            System.out.println("3. Daftar penerima Vaksin");
            System.out.println("4. Exit");
            System.out.println("=======================");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();  

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nomor Antrian: ");
                    int nomorAntrian = sc.nextInt();
                    sc.nextLine();  
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    dll.addLast(nomorAntrian, nama);
                    break;
                case 2:
                    dll.removeFirst();
                    break;
                case 3:
                    dll.print();
                    break;
                case 4:
                    System.out.println("Keluar program.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }
        } while (pilih != 4);

        sc.close();
    }
}

