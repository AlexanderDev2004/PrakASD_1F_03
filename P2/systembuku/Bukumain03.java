package P2.systembuku;

public class Bukumain03 {
    public static void main(String[] args) {
        Buku03 bk1 = new Buku03();
        bk1.judul = "Today end & Tomorrow coming";
        bk1.pengarang ="Alexander";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiharga(6000);
        bk1.tampilInformasi();
    }
}