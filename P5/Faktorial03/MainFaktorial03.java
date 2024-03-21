package P5.Faktorial03;
import java.util.Scanner;
public class MainFaktorial03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("Masukan Jumlah Elemet :");
        int ijml = sc.nextInt();

        Faktorial03[] fk = new Faktorial03[10];
        for (int i = 0; i < ijml; i++) {
            fk[i] = new Faktorial03();
            System.out.println("masukkan nilai data ke-" + (i + 1) + ":");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai;
          }

        System.out.println("Hasil-BRUTE Force");
        for (int i=0; i < ijml; i++) {
            System.out.println("Hasil perhitungan Faktorial menggunakan Blue Force adalah :" + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("Hasil-Divince And conquer");
        for (int i=0; i < ijml; i++ ) {
            System.out.println("Hasil perhintungan Faktorial menggunakan Divince And conquer Adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
