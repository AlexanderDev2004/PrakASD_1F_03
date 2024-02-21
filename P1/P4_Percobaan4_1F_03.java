package P1;

public class P4_Percobaan4_1F_03{
    public static void main(String[] args) {
        // Membuat objek RoyalGarden
        RoyalGarden royalGarden = new RoyalGarden();

        // Menampilkan pendapatan setiap cabang jika semua bunga habis terjual
        System.out.println("Pendapatan Setiap Cabang:");
        royalGarden.displayPendapatanPerCabang();

        // Menampilkan jumlah stock setiap jenis bunga pada setiap cabang
        System.out.println("\nStock Setiap Jenis Bunga Setiap Cabang:");
        royalGarden.displayStockPerCabang();

        // Mengurangi stock bunga karena bunga tersebut mati pada cabang ke-0
        royalGarden.reduceStock(0, new int[]{1, 2, 0, 5});
        System.out.println("\nStock Setiap Jenis Bunga Setelah Pengurangan:");
        royalGarden.displayStockPerCabang();
    }
}

class RoyalGarden {
    private static final int HARGA_AGLONEMA = 75000;
    private static final int HARGA_KELADI = 50000;
    private static final int HARGA_ALOCASIA = 60000;
    private static final int HARGA_MAWAR = 10000;

    private static String[] cabangToko = {"Cabang A", "Cabang B", "Cabang C"};
    private static int[][] stockBunga = {
            {10, 20, 15, 30},
            {15, 25, 20, 35},
            {20, 30, 25, 40}
    };

    // Fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual
    public void displayPendapatanPerCabang() {
        for (int i = 0; i < cabangToko.length; i++) {
            int pendapatan = calculatePendapatan(stockBunga[i]);
            System.out.println("Pendapatan cabang " + cabangToko[i] + ": Rp " + pendapatan);
        }
    }

    // Fungsi untuk menampilkan jumlah Stock setiap jenis bunga pada cabang royalgarden
    public void displayStockPerCabang() {
        for (int i = 0; i < cabangToko.length; i++) {
            System.out.println("Stock cabang " + cabangToko[i] + ":");
            System.out.println("Aglonema: " + stockBunga[i][0]);
            System.out.println("Keladi: " + stockBunga[i][1]);
            System.out.println("Alocasia: " + stockBunga[i][2]);
            System.out.println("Mawar: " + stockBunga[i][3]);
        }
    }

    // Fungsi untuk menghitung pendapatan dari penjualan semua bunga pada suatu cabang
    private int calculatePendapatan(int[] stockBunga) {
        int totalPendapatan = 0;
        totalPendapatan += stockBunga[0] * HARGA_AGLONEMA;
        totalPendapatan += stockBunga[1] * HARGA_KELADI;
        totalPendapatan += stockBunga[2] * HARGA_ALOCASIA;
        totalPendapatan += stockBunga[3] * HARGA_MAWAR;
        return totalPendapatan;
    }

    // Fungsi untuk mengurangi stock bunga karena bunga tersebut mati
    public void reduceStock(int cabangIndex, int[] pengurangan) {
        for (int i = 0; i < pengurangan.length; i++) {
            stockBunga[cabangIndex][i] -= pengurangan[i];
        }
    }

    // Fungsi untuk mendapatkan harga bunga
    public int getHargaBunga(String namaBunga) {
        switch (namaBunga) {
            case "Aglonema":
                return HARGA_AGLONEMA;
            case "Keladi":
                return HARGA_KELADI;
            case "Alocasia":
                return HARGA_ALOCASIA;
            case "Mawar":
                return HARGA_MAWAR;
            default:
                return 0; // Harga default jika nama bunga tidak dikenal
        }
    }
}
