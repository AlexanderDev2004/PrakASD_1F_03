package P3.ArrayBalok;
public class Segitiga03 {
    public int alas;
    public int tinggi;

   
    public Segitiga03(int a, int t) {
        alas = a;
        tinggi = t;
    }

    
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    
    private double hitungHipotenusa() {
        return Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }

    
    public double hitungKeliling() {
        double hipotenusa = hitungHipotenusa();
        return alas + tinggi + hipotenusa;
    }
}
