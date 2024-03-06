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

        
        for (int i = 0; i < jumlahMahasiswa; i++) {
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

       
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama : " + nama[i]);
            System.out.println("NIM : " + nim[i]);
            System.out.println("Jenis Kelamin : " + jenisKelamin[i]);
            System.out.println("IPK : " + ipk[i]);
        }

        scanner.close();
        
    }
}
