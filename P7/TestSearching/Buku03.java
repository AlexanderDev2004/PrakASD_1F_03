package P7.TestSearching;

public class Buku03 {
    int KodeBuku;
    String JudulBuku;
    int TahunTerbit;
    String Pengarang;
    int Stock;

    public Buku03(int KodeBuku,String JudulBuku,int TahunTerbit, String Pengarang, int Stock) {
        this.KodeBuku = KodeBuku;
        this.JudulBuku = JudulBuku;
        this.TahunTerbit = TahunTerbit;
        this.Pengarang = Pengarang;
        this.Stock = Stock;
    }
    public void TampilDataBuku () {
        System.out.println("=====================");
        System.out.println("kode Buku  :\t " + KodeBuku);
        System.out.println("Judul Buku  :\t " + JudulBuku);
        System.out.println("Tahun Terbit  :\t " + TahunTerbit);
        System.out.println("Pengarang  : \t" + Pengarang);
        System.out.println("Stock Buku : \t" + Stock);
    }
}
