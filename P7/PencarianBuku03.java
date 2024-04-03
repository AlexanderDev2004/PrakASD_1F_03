package P7;

public class PencarianBuku03 {
    Buku03 listBK[] = new Buku03[5];
    int idx;

    void tambah (Buku03 m){
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }
    void tampil () {
        for (Buku03 m : listBK) {
            m.TampilDataBuku();
        }
    }
    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for(int j = 0; j < listBK.length; j++) {
            if (listBK[j].KodeBuku == cari) {
                j = posisi;
                break;
            }
        }
        return posisi;
    }
    public Buku03 FindBuku (int cari) {
        Buku03 bk = new Buku03(cari, null, cari, null, cari);
        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i].KodeBuku == cari) {
                bk = listBK[i];
                break;
            }
        }
        return bk;
    } 

    public void Tampilpoisisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + "Ditemukan Pada index : "+ pos);
        } else {
            System.out.println("Data : " + x + "Tidak di temukan ");
        }
    }
}
