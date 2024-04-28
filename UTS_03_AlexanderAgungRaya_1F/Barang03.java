package UTS_03_AlexanderAgungRaya_1F;

public class Barang03 {
    String KodeBarang;
    String NamaBarang;
    String Kategori;
    int Stock;
    int harga;

    public Barang03(String KodeBarang, String NamaBarang, String Kategori, int Stock, int harga) {
        this.KodeBarang = KodeBarang;
        this.NamaBarang = NamaBarang;
        this.Kategori = Kategori;
        this.Stock = Stock;
        this.harga = harga;
    }

    public void TampilDataBarang() {
        System.out.println("=========================");
        System.out.println("Kode Barang : " + KodeBarang);
        System.out.println("Nama Barang : " + NamaBarang);
        System.out.println("Kategori : " + Kategori);
        System.out.println("Stock : " + Stock);
        System.out.println("Harga : " + harga);
    }
}
