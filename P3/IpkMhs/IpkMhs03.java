package P3.IpkMhs;
import java.util.Scanner;
public class IpkMhs03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahMahasiswa = 3; 
        String[] nama = new String[jumlahMahasiswa];
        String[] nim = new String[jumlahMahasiswa];
        char[] jenisKelamin = new char[jumlahMahasiswa];
        double[] ipk = new double[jumlahMahasiswa];

        inputDataMahasiswa(scanner, nama, nim, jenisKelamin, ipk);
        tampilkanDataMahasiswa(nama, nim, jenisKelamin, ipk);

        double rataRataIPK = hitungRataRataIPK(ipk);
        System.out.println("Rata-rata IPK: " + rataRataIPK);
        tampilkanDataMahasiswaTerbesar(nama, nim, jenisKelamin, ipk);

    }

    public static void inputDataMahasiswa(Scanner scanner, String[] nama, String[] nim, char[] jenisKelamin, double[] ipk) {
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama : ");
            nama[i] = scanner.nextLine();
            System.out.print("Masukkan nim : ");
            nim[i] = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P) : ");
            jenisKelamin[i] = scanner.nextLine().charAt(0);
            System.out.print("Masukkan IPK : ");
            ipk[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }
    }

    public static void tampilkanDataMahasiswa(String[] nama, String[] nim, char[] jenisKelamin, double[] ipk) {
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama : " + nama[i]);
            System.out.println("NIM : " + nim[i]);
            System.out.println("Jenis Kelamin : " + jenisKelamin[i]);
            System.out.println("IPK : " + ipk[i]);
        }
    }

    public static double hitungRataRataIPK(double[] ipk) {
        double total = 0;
        for (double nilai : ipk) {
            total += nilai;
        }
        return total / ipk.length;
    }

    public static void tampilkanDataMahasiswaTerbesar(String[] nama, String[] nim, char[] jenisKelamin, double[] ipk) {
        double maxIPK = ipk[0];
        int indexMaxIPK = 0;
        for (int i = 1; i < ipk.length; i++) {
            if (ipk[i] > maxIPK) {
                maxIPK = ipk[i];
                indexMaxIPK = i;
            }
        }
        System.out.println("Data Mahasiswa dengan IPK Terbesar:");
        System.out.println("Nama : " + nama[indexMaxIPK]);
        System.out.println("NIM : " + nim[indexMaxIPK]);
        System.out.println("Jenis Kelamin : " + jenisKelamin[indexMaxIPK]);
        System.out.println("IPK : " + ipk[indexMaxIPK]);
    }
}
