package UTS_03_AlexanderAgungRaya_1F;

import java.util.Scanner;

public class MainSystem03 {
    public static void main(String[] args) {
        ServiceClass03 listBarang = new ServiceClass03();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("Selamat Datang di Toko Menasuka");
        System.out.println("===============================");
        System.out.println("BAnk Menu : ");
        System.out.println("1. Data Barang ");
        System.out.println("2. Data Transaksi");
        System.out.println("3. Pencarian Data");
        System.out.println("4. Pengurutan Data");
        System.out.println("5. Tampilkan Data Terbalik");
        System.out.println("6. Exit Program");
        System.out.print("Pilihlah Menu (1-6): ");
        
        int Pilihanmenu = sc.nextInt(); // Corrected variable declaration
        
        switch (Pilihanmenu) {
            case 1:
                System.out.println("===============================");
                System.out.println("1. Tambah Data Barang");
                System.out.println("2. Hapus Data Barang");
                System.out.println("3. Cari Data Barang");
                System.out.println("4. Exit Program");
                System.out.print("Pilihlah Menu (1-4): ");
                
                int Pilihanmenu2 = sc.nextInt();
                
                switch (Pilihanmenu2) {
                    case 1:
                         
                        break;
                    case 2:
                        // Add code for menu 2 here
                        break;
                    case 3:
                        // Add code for menu 3 here
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan program ini. Sampai jumpa!");
                        break;
                    default:
                        System.out.println("Pilihan menu tidak valid. Silakan pilih menu dari 1 hingga 4.");
                        break;
                }
                break;
            case 2:
                // Add code for menu 2 here
                break;
            case 3:
                // Add code for menu 3 here
                break;
            case 4:
                // Add code for menu 4 here
                break;
            case 5:
                // Add code for menu 5 here
                break;
            case 6:
                System.out.println("Terima kasih telah menggunakan program ini. Sampai jumpa!");
                break;
            default:
                System.out.println("Pilihan menu tidak valid. Silakan pilih menu dari 1 hingga 6.");
                break;
        }
        
        sc.close(); 
    }
}
