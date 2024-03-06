package P3.ArrayBalok;

public class Arraybalok03 {
    public static void main(String[] args) {
        Balok03 [] blarry = new Balok03[3];

        blarry[0] = new Balok03(100, 30, 12);
        blarry[1] = new Balok03(120, 40, 15);
        blarry[2] = new Balok03(210, 50, 25);

        for (int i = 0 ; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ":" + blarry[i].hitungVolume());
        }
    }
}
