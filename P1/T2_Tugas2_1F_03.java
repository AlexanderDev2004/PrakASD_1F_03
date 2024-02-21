package P1;

import java.util.Scanner;

public class T2_Tugas2_1F_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menampilkan menu
        System.out.println("Menu:");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("Pilih rumus yang akan dihitung (1/2/3): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        
        scanner.close();
    }
    
    // Fungsi untuk menghitung kecepatan
    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jarak (km): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        double waktu = scanner.nextDouble();
        
        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        
        scanner.close();
    }
    
    // Fungsi untuk menghitung jarak
    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        double waktu = scanner.nextDouble();
        
        double jarak = kecepatan * waktu;
        System.out.println("Jarak: " + jarak + " km");
        
        scanner.close();
    }
    
    // Fungsi untuk menghitung waktu
    public static void hitungWaktu() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jarak (km): ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = sc.nextDouble();
        
        double waktu = jarak / kecepatan;
        System.out.println("Waktu: " + waktu + " jam");
        
        sc.close();
    }
}
