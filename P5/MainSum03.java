package P5;

import java.util.Scanner;

public class MainSum03 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("==============================");
       System.out.println("Progres menghitung keutungan total (satuan juta misal 5.9)");
       System.out.println("Masukan jumlah bulan : ");
       int elm = sc.nextInt();

       Sum03 sm = new Sum03();
       sm.sum(elm); 
       System.out.println("==========================");
       for (int i = 0; i < sm.elemen; i++) {
            System.out.println("Masukan untung ke bulan ke- " + (i + 1) + "= ");
            sm.keutungan[i] = sc.nextDouble();
       }
       System.out.println("=========================================");
       System.out.println("Algoritma  Brute Force ");
       System.out.println("Total keutungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keutungan));
       System.out.println("================================================================");
       System.out.println("Algoritma  Divide Conquer");
       System.out.println("Total keutungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keutungan, 0, sm.elemen - 1));
    }
}