package P2.systembuku;

public class Buku03 {
    String judul, pengarang;
    String halaman, stock; 
    String harga; 

    void tampilinformasi (){
        System.out.println("Judul :" + judul);
        System.out.println("pengarang :" + pengarang);
        System.out.println("isi halaman :" + halaman);
        System.out.println("stock buku :" + stock); 
        System.out.println("harga Buku :" + harga); 
    }
    void terjual (int jml){
        
        stock = String.valueOf(Integer.parseInt(stock) - jml);
    }
    void restok (int jml){
        
        stock = String.valueOf(Integer.parseInt(stock) + jml);
    }
    void gantiharga (int hrg){
        harga = String.valueOf(hrg);
    }
}