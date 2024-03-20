package P5;
import java.util.Scanner;
public class MainPangkat03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================");
        System.out.println("Masukan Jumlah element yg di hitung : ");
        int elemen = sc.nextInt();
        
        Pangkat03[] png = new Pangkat03[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukan nilai hendak pangkat : ");
            int nilai = sc.nextInt();
            System.out.println("Masukan nilai pangkat ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat03(nilai, pangkat);
        } 

        System.out.println("Pilih metode penghitungan pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide And Conquer");
        System.out.println("Masukkan pilihan Anda: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil pangkat - Brute Force ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " Pangkat " + png[i].pangkat + " Adalah " + png[i].PangkatBF(png[i].nilai,png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil pangkat - Divide And Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai+ " pangkat " + png[i].pangkat+ " Adalah "+ png[i].pangkatDC(png[i].nilai, png[i].pangkat) );
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
