package P2.GameNaga;

public class Nagamain03 {
    public static void main(String[] args) {
        Naga03 dragon = new Naga03();
        
        dragon.moveLeft();
        dragon.printPosition(); 
        
        dragon.moveUp();
        dragon.printPosition(); 
        
        dragon.moveRight();
        dragon.printPosition(); 
        
        dragon.moveDown();
        dragon.printPosition(); 
        
        
        dragon.moveLeft(); 
    }
}
