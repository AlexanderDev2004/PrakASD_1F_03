package P3.ArrayBalok;
public class sgArray03 {
    public static void main(String[] args) {
      
        Segitiga03[] sgArray03 = new Segitiga03[4];

        
        sgArray03[0] = new Segitiga03(10, 4);
        sgArray03[1] = new Segitiga03(20, 10);
        sgArray03[2] = new Segitiga03(15, 6);
        sgArray03[3] = new Segitiga03(25, 10);

       
        for (int i = 0; i < sgArray03.length; i++) {
            System.out.println("sgArray ke-" + i + ":");
            System.out.println("Alas: " + sgArray03[i].alas + ", Tinggi: " + sgArray03[i].tinggi);
            System.out.println();
        }

        for (int i = 0; i < sgArray03.length; i++) {
            System.out.println("sgArray ke-" + i + ":");
            System.out.println("Luas: " + sgArray03[i].hitungLuas());
            System.out.println("Keliling: " + sgArray03[i].hitungKeliling());
            System.out.println();
        }
    }
}
