package UTS_03_AlexanderAgungRaya_1F;

public class ServiceClass03 {
    static Barang03[] Trs;
    static int index;

    // Static block to initialize the Trs array
    static {
        Trs = new Barang03[100]; // Change the size according to your requirement
        index = 0; // Initialize index
    }

    public void TambahDataTranskasi(String Trp) {
        if (index < Trs.length) {
            Trs[index] = new Barang03("SomeKode", Trp, "Trs", 1, 10000); // Assuming "SomeKode" is placeholder for KodeBarang
            index++;
            System.out.println("Data Transaksi Berhasil Ditambahkan");
        } else {
            System.out.println("Array size exceeded. Please increase the size of Trs or handle full array case.");
        }

        // Print all transactions
        System.out.println("Data Transaksi : ");
        System.out.println("=========================");
        for (int i = 0; i < index; i++) {
            Trs[i].TampilDataBarang();
            System.out.println();
        }
        System.out.println("=========================");
        System.out.println("Jumlah Data Transaksi : " + index);
        System.out.println("=========================");
    }

    public void HapusDataTranskasi(String Trp) {
        int pos = -1;
        for (int i = 0; i < index; i++) {
            if (Trs[i].NamaBarang.equals(Trp)) { // Compare with NamaBarang instead of Nama
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            for (int i = pos; i < index - 1; i++) {
                Trs[i] = Trs[i + 1];
            }
            index--;
            System.out.println("Data Transaksi Berhasil Dihapus");
        } else {
            System.out.println("Data Transaksi Tidak Ditemukan");
        }
    }

    public Barang03 Searching03(String nama) {
        if (index != 0) {
            for (int i = 0; i < index; i++) {
                if (Trs[i].NamaBarang.equals(nama)) { // Compare with NamaBarang instead of Nama
                    return Trs[i];
                }
            }
            System.out.println("Barang Tidak Ditemukan");
            return null;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }
}
