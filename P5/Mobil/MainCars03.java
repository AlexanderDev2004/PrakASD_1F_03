package P5.Mobil;
import java.util.Scanner;

public class MainCars03 {
    public static void main(String[] args) {
        MobilData03 mobil[] = new MobilData03[8];
        mobil[0] = new MobilData03("BMW", "M2 Coupe", "2016", 6816, 728);
        mobil[1] = new MobilData03("Ford", "Fiesta ST", "2014", 3921, 575);
        mobil[2] = new MobilData03("Nissan", "370Z", "2009", 4360, 657);
        mobil[3] = new MobilData03("Subaru", "BRZ", "2014", 4058, 609);
        mobil[4] = new MobilData03("Subaru", "Impreza WRX STI", "2013", 6255, 703);
        mobil[5] = new MobilData03("Toyota", "AE86 Trueno", "1986", 3700, 553);
        mobil[6] = new MobilData03("Toyota", "86/GT86", "2014", 4180, 609);
        mobil[7] = new MobilData03("Volkswagen", "Golf GTI", "2014", 4180, 631);

        System.out.println("Pilih opsi:");
        System.out.println("1. Mobil dengan top acceleration tertinggi");
        System.out.println("2. Mobil dengan top acceleration terendah");
        
        Scanner scanner = new Scanner(System.in);
        int pilihMobil = scanner.nextInt();

        switch (pilihMobil) {
            case 1:
                int tinggi = MobilData03.CariTopDC(mobil, 0, mobil.length - 1);
                System.out.println("Mobil dengan Top tertinggi : ");
                System.out.println("Merek :" + mobil[tinggi].merk);
                System.out.println("Tipe :" + mobil[tinggi].tipe);
                System.out.println("Tahun :" + mobil[tinggi].tahun);
                System.out.println("top_acceleration :" + mobil[tinggi].top_acceleration);
                System.out.println("top Power :" + mobil[tinggi].top_power);
                System.out.println("Rata-Rata Top Power : " + MobilData03.RataTopPowerBF(mobil));
                break;
            case 2:
                int rendah = MobilData03.CariTopRendahDC(mobil, 0, mobil.length - 1);
                System.out.println("Mobil dengan Top terendah : ");
                System.out.println("Merek :" + mobil[rendah].merk);
                System.out.println("Tipe :" + mobil[rendah].tipe);
                System.out.println("Tahun :" + mobil[rendah].tahun);
                System.out.println("top_acceleration :" + mobil[rendah].top_acceleration);
                System.out.println("top Power :" + mobil[rendah].top_power);
                System.out.println("Rata-Rata Top Power : " + MobilData03.RataTopPowerBF(mobil));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        
        scanner.close();
    }
}
