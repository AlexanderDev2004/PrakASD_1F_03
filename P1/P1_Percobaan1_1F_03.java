package P1;
import java.util.Scanner; 
public class P1_Percobaan1_1F_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("============================");
        System.out.println("Program Menghitung nilai Akhir");
        System.out.println("============================");
        System.out.println();

        // Memberikan Input yg nanti di sediakan
        System.out.println("Masukkan nilai tugas : ");
        int tugas = Integer.parseInt(sc.nextLine());
        System.out.println("Masukkan nilai kuis : ");
        int kuis = Integer.parseInt(sc.nextLine());
        System.out.println("Masukkan nilai UTS : ");
        int UTS = Integer.parseInt(sc.nextLine());
        System.out.println("Masukkan nilai UAS : ");
        int UAS = Integer.parseInt(sc.nextLine());
        // Memberikan kondisi
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || UTS < 0 || UTS > 100 || UAS < 0 || UAS > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (UTS * 0.3) + (UAS * 0.4);

            // Tentukan nilai huruf
            String nilaiHuruf;
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 75) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 70) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            // Tentukan keterangan LULUS/TIDAK LULUS
            String keterangan = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) ? "LULUS" : "TIDAK LULUS";

            // Output nilai akhir, nilai huruf, dan keterangan
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Keterangan: " + keterangan);
        }
    }
}
