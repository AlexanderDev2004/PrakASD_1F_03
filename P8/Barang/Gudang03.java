package P8.Barang;

import java.net.Socket;

public class Gudang03 {
    static Barang03 tumpukan[] ;
    static int Size;
    static int Top;

    public Gudang03 (int Kapasitas) {
        Size = Kapasitas;
        tumpukan = new Barang03[Size];
        Top = -1;
    }
    public Boolean CekKosong () {
        if (Top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public static Boolean CekPenuh () {
        if (Top == Size -1) {
            return true;
        } else {
            return false;
        }
    }
    public static void TambahBarang(Barang03 brg) {
        if (!CekPenuh()) {
            Top++;
            tumpukan[Top] = brg;
            System.out.println("Barang  " + brg.Nama + "berhasil Di tambahkan");
        } else {
            System.out.println("Maaf Barang Di gudang  Sudah Penuh ");
        }
    }
    public Barang03 AmbilBarang() {
        if (!CekKosong()) {
            Barang03 delete = tumpukan[Top];
            Top--;
            System.out.println("Barang "+ delete.Nama +"Diambil Dari Gudang.");
            System.out.println("Kode unik dalam biner : " + KonversiDesimalKeBiner(delete.Kode));
            return delete;
        } else {
            System.out.println("Tumpukan BaranG kosong");
            return null;
        }
    }
    public Barang03 LihatBarangTeratas() {
        if (!CekKosong()) {
            Barang03 barangTeratas = tumpukan[Top];
            System.out.println("Barang Teratas : " + barangTeratas.Nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }
    

    public void TampilkanBarang() {
        if (!CekKosong()) {
            System.out.println("Rincian Tumpukan Barang Di gudang ");
            for (int i = Top; i >= 0; i--) {
                System.out.printf("Kode %d : %s (kategori %s)\n", tumpukan[i].Kode, tumpukan[i].Nama, tumpukan[i].Kategori);
            }
        } else {
            System.out.println("Tumpukan Barang Kosong");
        }
    }
    // public String KonversiDesimalKeBiner(int kode) {
    //     StackKonversi stack = new StackKonversi(kode);
    //     while (kode > 0) {
    //         int sisa = kode % 2;
    //         stack.push(sisa);
    //         kode = kode / 2;
    //     }
    //     StringBuilder biner = new StringBuilder();
    //     while (!stack.CekKosong()) {
    //         biner.append(stack.pop());
    //     }
    //     return biner.toString(); 
    // }
    public String KonversiDesimalKeBiner(int kode) {
        StackKonversi stack = new StackKonversi(kode);
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        StringBuilder biner = new StringBuilder();
        while (!stack.CekKosong()) {
            biner.append(stack.pop());
        }
        return biner.toString(); 
    }    
} 
