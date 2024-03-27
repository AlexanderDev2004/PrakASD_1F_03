package P6;

public class DaftarBuku03 {
    Buku03 listBK[] = new Buku03[5];
    int idx;

    void tambah(Buku03 m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }
    void tampil() {
        for (Buku03 m : listBK) {
            m.TampilDataBuku03();
        }
    }
    void BurbleShort() {
        for (int i = 0; i < listBK.length - 1; i++) {
            for (int j = 0; j < listBK.length - 1 - i; j++) {
                if (listBK[j].stock > listBK[j + 1].stock) {
                    Buku03 tempBk = listBK[j];
                    listBK[j] = listBK[j + 1];
                    listBK[j + 1] = tempBk;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < listBK.length -1 ; i++) {
            int  idMix = 1;
            for (int j = i+1; j < listBK.length; j++) {
                if (listBK[j].stock > listBK[idMix].stock ) {
                    idMix = i;
                }
            }
            // Swap
            Buku03 tempBuku03 = listBK[idMix];
            listBK[idMix] = listBK[i];
            listBK[i] = tempBuku03;
        }
    }
    
}
