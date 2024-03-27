package P6.BUKU03;

public class Buku03 {
    int KodeBuku ;
    String judulBuku;
    int tahunTerbit;
    String pengaran;
    int stock;

    public Buku03(int KodeBuku, String judulBuku, int tahunTerbit, String pengaran, int stock) {
        this.KodeBuku = KodeBuku; 
        this.judulBuku = judulBuku; 
        this.tahunTerbit = tahunTerbit; 
        this.pengaran = pengaran; 
        this.stock = stock; 
    }
    public void TampilDataBuku03() {
        System.out.println("==========================");
        System.out.println("kode Buku : "+ KodeBuku);
        System.out.println("Judul Buku : "+ judulBuku);
        System.out.println("Tahun Terbit  : "+ tahunTerbit);
        System.out.println("Pengaran  : "+ pengaran);
        System.out.println("Stock : "+ stock);
    }
}
