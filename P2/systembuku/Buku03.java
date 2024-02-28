package P2.systembuku;

public class Buku03 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku03() {

    }

    public Buku03(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi(){
        System.out.println("Judul :" + judul);
        System.out.println("Pengarang :" + pengarang);
        System.out.println("Jumlah halaman :" + halaman);
        System.out.println("Sisa Stok :" + stok);
        System.out.println("Harga Buku :" +harga);   
    }

    void terjual (int jml) {
        if (stok > 0) {
            stok -= jml;
        }
        if (stok < 0 ) {
            stok = 0;
        } else {
            System.out.println("Stok habis bang/mbak");
        }
    }
    void restock (int jml) {
        stok += jml;
    }
    void gantiharga (int hrg) {
        harga += hrg;
    }
}
