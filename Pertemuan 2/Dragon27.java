public class Dragon27 {
    int x, y, width, height;

    Dragon27(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        x--;
        if (x < 0) {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        x++;
        if (x > width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y--;
        if (y < 0) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y++;
        if (y > height) {
            detectCollision(x, y);
        }
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
        System.exit(0);
    }

    void printPosition() {
        System.out.println("Posisi Dragon : (" + x + ", " + y + ")");
    }

}
