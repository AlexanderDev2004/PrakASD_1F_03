package P2.GameNaga;

public class Nagamain03 {
    public static void main(String[] args) {
        Naga03 kadalterbang = new Naga03();
        
        kadalterbang.moveLeft();
        kadalterbang.printPosition(); 
        
        kadalterbang.moveUp();
        kadalterbang.printPosition(); 
        
        kadalterbang.moveRight();
        kadalterbang.printPosition(); 
        
        kadalterbang.moveDown();
        kadalterbang.printPosition(); 
        
        
        kadalterbang.moveLeft(); 
        System.out.println("Game Selesai");
    }
}
