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

        bk1.terjual(5);
        bk1.gantiharga(60000);
        bk1.tampilinformasi();

        // System.out.println();
        // Buku03 bk2 = new Buku03(); 
        // bk2.judul = "How To Train Your Dragon"; 
        // bk2.pengarang = "Alexander"; 
        // bk2.halaman = "490"; 
        // bk2.stock = "0"; 
        // bk2.harga = "275000"; 

        // bk2.tampilinformasi();
        // bk2.terjual(4);
        // bk2.gantiharga(60000);
        // bk2.tampilinformasi();

        System.out.println();
        Buku03 bk2 = new Buku03("Self Rewand", "Alexander", "190", "29", "59000"); 
        bk2.terjual(11);
        bk2.tampilinformasi();
    }
}
