package P1;
import java.util.Scanner;

public class T1_Tugas1_1F_03 {
    public static void main(String[] args) {
        // Array untuk kode plat mobil
        char[] KODE = {'A','B', 'D', 'E', 'L', 'N', 'R', 'S', 'T', 'W', 'Z'};
        
        // Array untuk nama kota yang berpasangan dengan kode plat mobil
        String[][] KOTA = {
            {"Aceh", "Ambon", "Anambas"},
            {"Banyuwangi", "Bandung", "Bekasi", "Bojonegoro", "Balikpapan", "Banjar", "Bogor", "Bangka", "Blitar", "Bima"},
            {"Denpasar", "Dumai", "Depok", "Demak", "Dompu", "Dairi", "Dumoga", "Donggala", "Dogiyai", "Dairi"},
            {"Ende", "Enrekang", "Empat Lawang", "Enrekang", "Ende", "Ende", "Enrekang", "Enrekang", "Ende", "Enrekang"},
            {"Lampung", "Lombok", "Lubuklinggau", "Lamongan", "Lamongan", "Lampung", "Lamongan", "Lampung", "Lamongan", "Lombok"},
            {"Nganjuk", "Ngawi", "Ngada", "Nganjuk", "Ngawi", "Ngada", "Ngawi", "Nganjuk", "Ngawi", "Ngada"},
            {"Rembang", "Rembang", "Rembang", "Rembang", "Rembang", "Rembang", "Rembang", "Rembang", "Rembang", "Rembang"},
            {"Samarinda", "Singaraja", "Surabaya", "Semarang", "Surakarta", "Sidoarjo", "Samarinda", "Sorong", "Samarinda", "Surakarta"},
            {"Tangerang", "Tegal", "Tanjung Pinang", "Tasikmalaya", "Tulungagung", "Tegal", "Tasikmalaya", "Tulungagung", "Tasikmalaya", "Tanjung Pinang"},
            {"Wonosobo", "Wonosobo", "Wonosobo", "Wonosobo", "Wonosobo", "Wonosobo", "Wonosobo", "Wonosobo", "Wonosobo", "Wonosobo"},
            {"Pangkal Pinang", "Pangkal Pinang", "Pangkal Pinang", "Pangkal Pinang", "Pangkal Pinang", "Pangkal Pinang", "Pangkal Pinang", "Pangkal Pinang", "Pangkal Pinang", "Pangkal Pinang"}
        };
        
        Scanner scanner = new Scanner(System.in);
        
        // Input kode plat mobil dari pengguna
        System.out.print("Masukkan kode plat mobil: ");
        char kodePlat = scanner.next().charAt(0);
        
        // Cari indeks kode plat mobil di array KODE
        int indeksKode = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                indeksKode = i;
                break;
            }
        }
        
        // Jika kode plat mobil ditemukan
        if (indeksKode != -1) {
            // Tampilkan nama kota yang berpasangan dengan kode plat mobil
            for (int i = 0; i < KOTA[indeksKode].length; i++) {
                System.out.println(KOTA[indeksKode][i]);
            }
        } else {
            System.out.println("Kode plat mobil tidak valid.");
        }
        
        scanner.close();
    }
}
