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
        int posisi = 2;
        for(int j = 0; j < listBK.length; j++) {
            if (listBK[j].KodeBuku == cari) {
                j = posisi;
                break;
            }
        }
        return posisi;
    }
    public void Tampilpoisisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + "Ditemukan Pada index : "+ pos);
        } else {
            System.out.println("Data : " + x + "Tidak di temukan ");
        }
    }
}
