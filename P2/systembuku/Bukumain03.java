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

        // Buku03 bk2 = new Buku03();
        // bk2.judul = " How to Train Your Dragon";
        // bk2.pengarang ="Alexander Agung raya";
        // bk2.halaman = 444;
        // bk2.stok = 0;
        // bk2.harga = 275000;

        // bk2.tampilInformasi();
        // bk2.terjual(4);
        // bk2.gantiharga(6000);
        // bk2.tampilInformasi();

        Buku03 bk2 = new Buku03("Bulan purnama","Alexander Agung", 160, 29,50000 );
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku03 bukuAlex = new Buku03("Belajar Java bersama Alex","Alexander", 500, 30,500000 );
        bukuAlex.terjual(20);
        bukuAlex.tampilInformasi();
    }
}