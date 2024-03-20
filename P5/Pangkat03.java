package P5;

public class Pangkat03 {
    public int nilai,pangkat;

    int PangkatBF(int a, int n) {
        int Hasil = 1;
        for (int i = 0; i < n; i++) {
            Hasil *= a;
        }
        return Hasil;
    }
    int pangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            if (n%2 == 1) {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            } else {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }
    
}
