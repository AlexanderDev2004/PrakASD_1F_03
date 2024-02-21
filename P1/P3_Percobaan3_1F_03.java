package P1;
import java.util.Scanner;

public class P3_Percobaan3_1F_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array 2D untuk menyimpan data mata kuliah
        String[][] matakuliah = {
            {"Pancasila", "2", "0", "0", "0", "0"},
            {"Konsep Teknologi Informasi", "2", "0", "0", "0", "0"},
            {"Critical Thinking dan Problem Solving", "2", "0", "0", "0", "0"},
            {"Matematika Dasar", "3", "0", "0", "0", "0"},
            {"Bahasa Inggris", "2", "0", "0", "0", "0"},
            {"Dasar Pemrograman", "2", "0", "0", "0", "0"},
            {"Praktikum Dasar Pemrograman", "3", "0", "0", "0", "0"},
            {"Keselamatan dan Kesehatan Kerja", "2", "0", "0", "0", "0"}
        };

        // Deklarasi variabel untuk menyimpan total SKS dan total nilai akhir
        int totalSks = 0;
        double totalNilaiAkhir = 0;

        // Memasukkan nilai untuk setiap mata kuliah dan menghitung total nilai akhir
        for (int i = 0; i < matakuliah.length; i++) {
            System.out.println("Masukkan nilai untuk mata kuliah " + matakuliah[i][0] + ":");
            double nilaiTugas = input.nextDouble();
            System.out.println("Masukkan nilai kuis untuk mata kuliah " + matakuliah[i][0] + ":");
            double nilaiKuis = input.nextDouble();
            System.out.println("Masukkan nilai UTS untuk mata kuliah " + matakuliah[i][0] + ":");
            double nilaiUTS = input.nextDouble();
            System.out.println("Masukkan nilai UAS untuk mata kuliah " + matakuliah[i][0] + ":");
            double nilaiUAS = input.nextDouble();
            int sks = Integer.parseInt(matakuliah[i][1]);
            totalSks += sks;
            double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
            totalNilaiAkhir += nilaiAkhir * sks;
            matakuliah[i][2] = String.valueOf(nilaiTugas);
            matakuliah[i][3] = String.valueOf(nilaiKuis);
            matakuliah[i][4] = String.valueOf(nilaiUTS);
            matakuliah[i][5] = String.valueOf(nilaiUAS);
        }

        // Menghitung IPK semester
        double ipSemester = totalNilaiAkhir / totalSks;

        System.out.println("------------------------------------------------------------------");
        // Menampilkan hasil
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("Mata Kuliah\t\tNilai Tugas\tNilai Kuis\tNilai UTS\tNilai UAS\tBobot\tNilai Huruf\tIPK");
        for (int i = 0; i < matakuliah.length; i++) {
            int sks = Integer.parseInt(matakuliah[i][1]);
            double nilaiTugas = Double.parseDouble(matakuliah[i][2]);
            double nilaiKuis = Double.parseDouble(matakuliah[i][3]);
            double nilaiUTS = Double.parseDouble(matakuliah[i][4]);
            double nilaiUAS = Double.parseDouble(matakuliah[i][5]);

            double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
            String nilaiHuruf = getNilaiHuruf(nilaiAkhir);

            System.out.printf("%-40s\t%.2f\t%.2f\t%.2f\t%.2f\t%s\t%s\t%.2f\n",
                    matakuliah[i][0], nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, matakuliah[i][1], nilaiHuruf, nilaiAkhir);
        }
        System.out.printf("\nTotal IPK Keseluruhan: %.2f\n", ipSemester);
    }

    private static String getNilaiHuruf(double nilai) {
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
