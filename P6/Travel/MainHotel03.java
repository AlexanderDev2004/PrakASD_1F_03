package P6.Travel;
import P6.BUKU03.DaftarBuku03;

public class MainHotel03 {
    public static void main(String[] args) {
        HotelService03 kamar = new HotelService03();
        Hotel03 k = new Hotel03("Hotel China", "Banyuwangi", 500000, 5);
        Hotel03 k1 = new Hotel03("Hotel Kembang", "jogja", 400000, 4);
        Hotel03 k2 = new Hotel03("Hotel bibit", "jakarta", 300000, 3);
        Hotel03 k3 = new Hotel03("Hotel Crab", "Bikini Bottom", 200000, 2);
        Hotel03 k4 = new Hotel03("Hotel hantu", "Surabaya", 100000, 1);
        kamar.tambah(k);
        kamar.tambah(k1);
        kamar.tambah(k2);
        kamar.tambah(k3);
        kamar.tambah(k4);

        System.out.println("====================");
        System.out.println("Data Sebelum Diurutkan");
        kamar.tampilAll();
        System.out.println();

        System.out.println("====================");
        System.out.println("Data setelah diurutkan secara ASC berdasarkan Stock");
        kamar.bubbleSortHarga();
        kamar.tampilAll();
        System.out.println();
        
        System.out.println("====================");
        System.out.println("Data setelah diurutkan secara Desc berdasarkan Stock menggunakan selection short");
        kamar.selectionSortHarga();
        kamar.tampilAll();

    }
    
}
