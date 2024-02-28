package P2.systembuku;

public class Bukumain03 {
    public static void main(String[] args) {
        Buku03 bk1 = new Buku03("SELAMAT PAGI DUNIAKU", "Alexander", 990, 13, 100000); 
        bk1.tampilinformasi();
        bk1.terjual(5);
        bk1.gantiharga(60000);
        bk1.tampilinformasi();

        bk1.terjual(5);
        bk1.gantiharga(60000);
        bk1.tampilinformasi();

        System.out.println();
        Buku03 bk2 = new Buku03("Self Rewand", "Alexander", 190, 29, 59000); 
        bk2.terjual(11);
        bk2.tampilinformasi();

        System.out.println();
        Buku03 bukuAlexander = new Buku03("Joko terkubur", "Alexander", 200, 0, 5000); 
        bukuAlexander.terjual(4);
        bukuAlexander.tampilinformasi();
        
        System.out.println();
        System.out.println();
        Buku03 bukuayam = new Buku03("Buku Ayam", "Alexander", 150, 10, 75000); 
        bukuayam.terjual(4);
        bukuayam.tampilinformasi();
        int hargaTotal4 = bukuayam.hitungHargaTotal();
        double diskonbuku = bukuayam.hitungDiskon();
        double hargaBayar4 = bukuayam.hitungHargaBayar(hargaTotal4, diskonbuku);

        System.out.println("Harga Total: " + hargaTotal4);
        System.out.println("Diskon: " + (diskonbuku * 100) + "%");
        System.out.println("Harga Setelah Diskon: " + hargaBayar4);
    }
}
