package P2.systembuku;

public class Buku03 {
    String judul, pengarang;
    int halaman, stock, harga;

    // Default Constructor
    public Buku03() {
    }

    // Constructor with parameters
    public Buku03(String judul, String pengarang, int halaman, int stock, int harga) {
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
        System.out.println("Stok Buku: " + (stock == 0 ? "0" : stock));
        System.out.println("Harga Buku: " + harga);
    }

    void terjual(int jml) {
        if (stock >= jml) {
            stock -= jml;
            System.out.println(jml + " buku telah terjual.");
        } else {
            System.out.println("Stok tidak mencukupi untuk penjualan.");
        }
    }

    void restok(int jml) {
        stock += jml;
        System.out.println(jml + " buku telah ditambahkan ke dalam stok.");
    }

    void gantiharga(int hrg) {
        harga = hrg;
        System.out.println("Harga buku telah diubah menjadi " + hrg);
    }

    int hitungHargaTotal() {
        return harga * stock;
    }

    double hitungDiskon() {
        int hargaTotal = hitungHargaTotal();
        double diskon = 0.0;
        if (hargaTotal > 150000) {
            diskon = 0.12; // Diskon 12%
        } else if (hargaTotal >= 75000) {
            diskon = 0.05; // Diskon 5%
        }
        return diskon;
    }

    double hitungHargaBayar(int hargaTotal4, double diskonbuku) {
        int hargaTotal = hitungHargaTotal();
        double diskon = hitungDiskon();
        return hargaTotal * (1 - diskon);
    }
}
