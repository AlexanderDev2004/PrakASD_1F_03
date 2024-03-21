package P5.Sum03;
import java.util.Scanner;


public class MainSum03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah perusahaan:");
        int numCompanies = sc.nextInt();
        
        // Array 2D untuk menyimpan keuntungan perusahaan
        double[][] keuntunganPerusahaan = new double[numCompanies][];
        
        // Input keuntungan perusahaan
        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Masukkan jumlah bulan untuk perusahaan " + (i+1) + ":");
            int numMonths = sc.nextInt();
            keuntunganPerusahaan[i] = new double[numMonths];
            
            System.out.println("Masukkan keuntungan per bulan untuk perusahaan " + (i+1) + ":");
            for (int j = 0; j < numMonths; j++) {
                System.out.println("Masukkan keuntungan untuk bulan " + (j+1) + ":");
                keuntunganPerusahaan[i][j] = sc.nextDouble();
            }
        }
        
        // Hitung dan tampilkan total keuntungan perusahaan
        for (int i = 0; i < numCompanies; i++) {
            double totalKeuntungan = hitungTotalKeuntungan(keuntunganPerusahaan[i]);
            System.out.println("Total keuntungan perusahaan " + (i+1) + " adalah: " + totalKeuntungan);
        }
    }
    
    // Method untuk menghitung total keuntungan perusahaan
    private static double hitungTotalKeuntungan(double[] keuntungan) {
        double total = 0;
        for (double k : keuntungan) {
            total += k;
        }
        return total;
    }
}