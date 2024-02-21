package P1;
import java.util.Scanner;
public class P2_Percobaan2_1F_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Nim Terakhir Anda 23410333310 (10) :");
        String nim = sc.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
    
        if (n < 10) {
            n += 10;
        }

        System.out.println("Hasil");
        for (int i= 1; i <= n; i++) {
            if (i == 6 || i ==10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.println(i + "");
            } else {
                System.out.println("*");
            }
        }
    }
}
