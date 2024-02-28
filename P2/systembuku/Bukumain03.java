package P2.systembuku;

public class Bukumain03 {
    public static void main(String[] args) {
        Buku03 bk1 = new Buku03(); 
        bk1.judul = "SELAMAT PAGI DUNIAKU";
        bk1.pengarang = "Alexander";
        bk1.halaman = "990"; 
        bk1.stock = "13"; 
        bk1.harga = "100000"; 

        bk1.tampilinformasi();
        bk1.terjual(5);
        bk1.gantiharga(60000);
        bk1.tampilinformasi();
    }
}