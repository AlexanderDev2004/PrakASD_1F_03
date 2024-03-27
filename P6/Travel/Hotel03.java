package P6.Travel;

public class Hotel03 {
   String nama ;
   String kota;
   int harga;
   byte bintang;

   public Hotel03 (String n, String k, int h, int i) {
     this.nama = n; 
     this.kota = k; 
     this.harga = h;
     this.bintang = (byte) i; 
   }

   public void TampilDataHotel03() {
        System.out.println("=========================");
        System.out.println("Nama Hotel : "+ nama);
        System.out.println("Kota :"+ kota);
        System.out.println("Harga :"+ harga);
        System.out.println("Rating  :"+ bintang);
   }
}
