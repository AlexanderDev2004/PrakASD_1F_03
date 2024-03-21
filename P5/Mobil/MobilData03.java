package P5.Mobil;

public class MobilData03 {
    String merk, tipe, tahun;
    int top_acceleration, top_power;

    public MobilData03(String mark, String tipe, String tahun, int top_acceleratio, int top_power) {
        this.merk = mark;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleratio;
        this.top_power = top_power;
    }

    public static int CariTopDC(MobilData03[] arr, int l, int r) {
        if (l == r)
            return l;
        int mid = (l + r) / 2;
        int Lmid = CariTopDC(arr, l, mid);
        int Rmid = CariTopDC(arr, mid + 1, r);
        if (arr[Lmid].top_acceleration < arr[Rmid].top_acceleration) {
            return Rmid;
        } else {
            return Lmid;
        }
    }

    public static int CariTopRendahDC(MobilData03[] arr, int l, int r) {
        if (l == r)
            return l;
        int mid = (l + r) / 2;
        int Lmid = CariTopRendahDC(arr, l, mid);
        int Rmid = CariTopRendahDC(arr, mid + 1, r);
        if (arr[Lmid].top_acceleration > arr[Rmid].top_acceleration) {
            return Rmid;
        } else {
            return Lmid;
        }
    }

    public static double RataTopPowerBF(MobilData03[] arrMobil) {
        int sum = 0;
        for (int i = 0; i < arrMobil.length; i++) {
            sum += arrMobil[i].top_power;
        }
        return (double) sum / arrMobil.length;
    }
}
