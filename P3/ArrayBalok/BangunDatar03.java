package P3.ArrayBalok;

import P3.AOBpersegiPanjang.PersegiPanjang03;

public class BangunDatar03 {
    Segitiga03[] segitigas;
    PersegiPanjang03[] Persegipanjangs;

    void Tambahsgt(Segitiga03[] segitiga) {
        this.segitigas = segitiga;
    }

    void Tambahpp(PersegiPanjang03[] Persegipanjang) {
        this.Persegipanjangs = Persegipanjang;
    }

    void tampiBangunan(){
        for (int i = 0; i < Persegipanjangs.length; i++) {
            System.out.println("persegi panjang "+ (i+1));
            System.out.println("panjang "+Persegipanjangs[i].panjang);
            System.out.println("lebar "+Persegipanjangs[i].lebar);
        }
        System.out.println("======================================");
        for (int j =0; j <segitigas.length; j++) {
            System.out.println("Segitiga"+ (j+1));
            System.out.println("alas"+segitigas[j].alas);
            System.out.println("tinggi"+segitigas[j].tinggi);
        }

    }
}
