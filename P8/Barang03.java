package P8;
public class Barang03 {
    int Kode;
    String Nama;
    String Kategori;
    
    public Barang03 (int Kode, String Nama, String Kategori) {
        this.Kode = Kode;
        this.Nama = Nama;
        this.Kategori = Kategori;
    }
    public void TampilDataBarang (){
        System.out.println("=========================================");
        System.out.println("Nama Barang :");
        System.out.println("=========================================");
        System.out.println("Nama Barang :" + Nama);
        System.out.println("Kode Barang :" + Kode);
        System.out.println("Kategori Barang :" + Kategori);
    }
}