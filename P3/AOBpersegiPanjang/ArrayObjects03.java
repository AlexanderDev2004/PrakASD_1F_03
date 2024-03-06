package P3.AOBpersegiPanjang;

public class ArrayObjects03 {
    public static void main(String[] args) {
        PersegiPanjang03[] pparry = new PersegiPanjang03[3];
        
        pparry [0] = new PersegiPanjang03();
        pparry [0].panjang = 110;
        pparry [0].lebar = 30;

        pparry [1] = new PersegiPanjang03();
        pparry [1].panjang = 80;
        pparry [1].lebar = 40;

        pparry [2] = new PersegiPanjang03();
        pparry [2].panjang = 100;
        pparry [2].lebar = 20;

        System.out.println("Persegi panjang ke-0, Panjnag : "+ pparry[0].panjang + "Lebar :" + pparry[0].lebar);
        System.out.println("Persegi panjang ke-0, Panjnag : "+ pparry[1].panjang + "Lebar :" + pparry[1].lebar);
        System.out.println("Persegi panjang ke-0, Panjnag : "+ pparry[2].panjang + "Lebar :" + pparry[2].lebar);

    }    
}
