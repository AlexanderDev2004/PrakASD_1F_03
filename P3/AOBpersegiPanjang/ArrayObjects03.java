package P3.AOBpersegiPanjang;
import java.util.Scanner;
public class ArrayObjects03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang03[][] pparry = new PersegiPanjang03[3][3];
        
        // pparry [0] = new PersegiPanjang03();
        // pparry [0].panjang = 110;
        // pparry [0].lebar = 30;

        // pparry [1] = new PersegiPanjang03();
        // pparry [1].panjang = 80;
        // pparry [1].lebar = 40;

        // pparry [2] = new PersegiPanjang03();
        // pparry [2].panjang = 100;
        // pparry [2].lebar = 20;

        // System.out.println("Persegi panjang ke-0, Panjnag : "+ pparry[0].panjang + "Lebar :" + pparry[0].lebar);
        // System.out.println("Persegi panjang ke-0, Panjnag : "+ pparry[1].panjang + "Lebar :" + pparry[1].lebar);
        // System.out.println("Persegi panjang ke-0, Panjnag : "+ pparry[2].panjang + "Lebar :" + pparry[2].lebar);
        // for (int i = 0; i < 3; i++) {
        //     pparry [i] = new PersegiPanjang03();
        //     System.out.println("Persegi panjang ke- " + i);
        //     System.out.println("Masukan panjang :" );
        //     pparry[i].panjang = sc.nextInt();
        //     System.out.println("Masukan lebar :" );
        //     pparry[i].lebar = sc.nextInt();
        // }
        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Persegi panjang ke- "+ i);
        //     System.out.println("Panjang :" + pparry[i].panjang + "Lebar : " + pparry[i].lebar);
        // }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pparry[i][j] = new PersegiPanjang03(j,j);
                System.out.println("Persegi panjang ke- " + i + ", " + j);
                System.out.println("Masukan panjang :");
                pparry[i][j].panjang = sc.nextInt();
                System.out.println("Masukan lebar :");
                pparry[i][j].lebar = sc.nextInt();
            }
        }

        System.out.println("Data Persegi Panjang:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Persegi panjang ke- " + i + ", " + j);
                System.out.println("Panjang: " + pparry[i][j].panjang + ", Lebar: " + pparry[i][j].lebar);
            }
        }

    }    
}
