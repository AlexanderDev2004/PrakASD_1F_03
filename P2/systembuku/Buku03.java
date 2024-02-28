package P2.systembuku;

public class Buku03 {
    String judul, pengarang;
    String halaman, stock, harga;

    // Default Constructor
    public Buku03() {
    }

    // Constructor with parameters
    public Buku03(String judul, String pengarang, String halaman, String stock, String harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stock = stock;
        this.harga = harga;
    }

    void tampilinformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Isi Halaman: " + halaman);
        System.out.println("Stok Buku: " + (stock.equals("0") ? "0" : stock));
        System.out.println("Harga Buku: " + harga);
    }

    void terjual(int jml) {
        int stockInt = Integer.parseInt(stock);
        if (stockInt >= jml) {
            stockInt -= jml;
            stock = String.valueOf(stockInt);
            System.out.println(jml + " buku telah terjual.");
        } else {
            System.out.println("Stok tidak mencukupi untuk penjualan.");
        }
    }

    void restok(int jml) {
        int stockInt = Integer.parseInt(stock);
        stockInt += jml;
        stock = String.valueOf(stockInt);
        System.out.println(jml + " buku telah ditambahkan ke dalam stok.");
    }

    void gantiharga(int hrg) {
        harga = String.valueOf(hrg);
        System.out.println("Harga buku telah diubah menjadi " + hrg);
    }
}