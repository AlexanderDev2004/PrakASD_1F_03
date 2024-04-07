package P7.TestSearching;

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
    public int FindBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listBK[mid].KodeBuku == cari) {
                return mid;
            }
            if (listBK[mid].KodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    public int FindJudulSeqSearcing(String CariJudul) {
        int JudulDD = 0;
        for (int j = 0 ; j < listBK.length; j++) {
            if (CariJudul.equalsIgnoreCase(listBK[j].JudulBuku)) {
                JudulDD ++ ;
                if (JudulDD >= 1) {
                    System.out.println("Data Judul Buku" + CariJudul + ":");
                }
                listBK[j].TampilDataBuku();
            }
        }
        return JudulDD;

    }
    public int FindJudulBinarySearcing(String CariJudul, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right)/2 ;
            int result = listBK[mid].JudulBuku.compareToIgnoreCase(CariJudul);
            if (result == 0) {
                result (mid);
            } else if (result < 0) {
                return FindJudulBinarySearcing(CariJudul, left, mid -1);
            } else {
                return FindJudulBinarySearcing(CariJudul, mid +1, right);
            }
        }
        return -1;
    }
    private void result(int mid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'result'");
    }
   
	
}