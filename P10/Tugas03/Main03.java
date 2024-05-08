package P10.Tugas03;

import java.util.Scanner;

public class Main03 {
    public static void menu() {
        System.out.println("Pilih Menu: ");
        System.out.println("1. Daftarkan Pembeli");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Paling Belakang");
        System.out.println("5. Tampilkan Daftar Pembeli");
        System.out.println("6. Cari Antrian Pembeli");
        System.out.println("7. Exit");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Masukan Jumlah Antrian :");
        int jumlah = sc.nextInt();
        Queue03 antrianpembeli = new Queue03(jumlah);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Nama pembeli : ");
                    String nama = sc1.nextLine();
                    System.out.print("No hp pembeli : ");
                    int nohp = sc.nextInt();
                    pembeli03 dataPmbli = new pembeli03(nama, nohp);
                    antrianpembeli.Enqueue(dataPmbli);
                    break;
                case 2 :
                    pembeli03 data = antrianpembeli.Dequeue();
                    System.out.println("Nama pembeli " + data.nama + " No hp : " + data.nohp);
                    break;
                case 3 :
                    antrianpembeli.peek();
                    break;
                case 4 :
                    antrianpembeli.peekRear();
                    break;
                case 5 :
                    antrianpembeli.print();
                    break;
                case 6 :
                    System.out.println("Masukan nama pembeli");
                    String carinama = sc1.nextLine();
                    antrianpembeli.peekPosition(carinama);
            }
        } while (pilih > 0 && pilih <= 6);
    }
}


