package P6.Travel;
public class HotelService03 {

    Hotel03 listhtl[] = new Hotel03[5];
    int idx;

    void tambah(Hotel03 H) {
        if (idx < listhtl.length) {
            listhtl[idx] = H;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilAll() {
        for (Hotel03 H : listhtl) {
                H.TampilDataHotel03(); 
            }
        }

    void bubbleSortHarga() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listhtl[j].harga > listhtl[j + 1].harga) {
                    Hotel03 temp = listhtl[j];
                    listhtl[j] = listhtl[j + 1];
                    listhtl[j + 1] = temp;
                    }
                }
            }
        }
    
    void selectionSortHarga() {
        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listhtl[j].harga < listhtl[minIndex].harga) {
                    minIndex = j;
                    }
                }
    
            Hotel03 temp = listhtl[i];
            listhtl[i] = listhtl[minIndex];
            listhtl[minIndex] = temp;
            }
        }
    
    void bubbleSortRating() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listhtl[j].bintang < listhtl[j + 1].bintang) {
                    Hotel03 temp = listhtl[j];
                    listhtl[j] = listhtl[j + 1];
                    listhtl[j + 1] = temp;
                    }
                }
            }
        }
    
    void selectionSortRating() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listhtl[j].bintang > listhtl[maxIndex].bintang) {
                    maxIndex = j;
                    }
                }
    
            Hotel03 temp = listhtl[i];
            listhtl[i] = listhtl[maxIndex];
            listhtl[maxIndex] = temp;
            }

        }

}