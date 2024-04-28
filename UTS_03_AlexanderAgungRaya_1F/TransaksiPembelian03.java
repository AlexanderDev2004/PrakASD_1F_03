package UTS_03_AlexanderAgungRaya_1F;

public class TransaksiPembelian03 {
    String KodeTransaksi;
    String NamaPembeli;
    String tanggalPembeli;
    int qty;
    int brg;

    
    public TransaksiPembelian03(String kode, String nama, String tanggal, int jumlahQty, int jumlahBarang) {
        this.KodeTransaksi = kode;
        this.NamaPembeli = nama;
        this.tanggalPembeli = tanggal;
        this.qty = jumlahQty;
        this.brg = jumlahBarang;
    }
    
}
