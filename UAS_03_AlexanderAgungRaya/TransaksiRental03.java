package UAS_03_AlexanderAgungRaya;

public class TransaksiRental03 {
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalbiaya;
    BarangRental03 br;

    public TransaksiRental03(int kodeTransaksi, String namaPeminjam, int lamaPinjam, BarangRental03 br) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;
        this.totalbiaya = calculateTotalBiaya();
    }

    public double calculateTotalBiaya() {
        return lamaPinjam * br.biayasewa;
    }
}