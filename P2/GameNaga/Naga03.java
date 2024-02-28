package P2.GameNaga;
public class Naga03 {
    int x ,y, width, height;

    void Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        if (x > 0) {
            x--;
        } else {
            detectCollision();
        }
    }

    public void moveRight() {
        if (x < width) {
            x++;
        } else {
            detectCollision();
        }
    }

    public void moveUp() {
        if (y > 0) {
            y--;
        } else {
            detectCollision();
        }
    }

    public void moveDown() {
        if (y < height) {
            y++;
        } else {
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Position: (" + x + ", " + y + ")");
    }

    private void detectCollision() {
        System.out.println("HA-HA-HA Kasihan....Game Over");
    }
}
