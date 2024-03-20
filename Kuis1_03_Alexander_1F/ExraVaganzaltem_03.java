package Kuis1_03_Alexander_1F;

public class ExraVaganzaltem_03 {
    String nama;
    String Category;
    int stock;
    int price;

    static void TampilExraVaganzaltem (String nama, String Category, int Stock, int price) {
        System.out.println("Nama Obat :" + nama);
        System.out.println("Category  Obat :" + Category);
        System.out.println("Stock  Obat :" + Stock);
        System.out.println("Price  Obat :" + price);
    }
    
    void nama (String nama) {
        nama(nama);
    }

    void Category (String Category) {
        Category (Category);
    }

    
    void Obatterjual (int jml) {
        if (stock > 0) {
            stock -= jml;
        }
        if (stock < 0 ) {
            stock = 0;
        } else {
            System.out.println("Stok habis bang/mbak");
        }
    }
    void gantiharga (int hrgobat) {

        price += hrgobat;
    }

    void Price (int jmlprice) {
        stock += jmlprice;
    }
    
    

    

}



