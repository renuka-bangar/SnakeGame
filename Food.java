import java.awt.*;

public class Food {
    private int x;
    private int y;
    private final int UNIT_SIZE;

    public Food(int unitSize) {
        UNIT_SIZE = unitSize;
    }

    public void generateNewFood(int screenWidth, int screenHeight) {
        int maxX = screenWidth / UNIT_SIZE;
        int maxY = screenHeight / UNIT_SIZE;

        x = (int) (Math.random() * maxX) * UNIT_SIZE;
        y = (int) (Math.random() * maxY) * UNIT_SIZE;
    }

    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x, y, UNIT_SIZE, UNIT_SIZE);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
