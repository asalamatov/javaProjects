package CS2_RV;
import java.awt.Color;
import java.awt.Graphics;

public class RV {
    private Color bodyColor;
    private int x;
    private int y;

    public RV(Color bodyColor, int x, int y) {
        this.bodyColor = bodyColor;
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "RV [bodyColor=" + bodyColor + ", x=" + x + ", y=" + y + "]";
    }

    public void show(Graphics g) {
        g.setColor(bodyColor);
        g.fillRect(x, y, 100, 50);
    }

    public void input(Color bodyColor, int x, int y) {
        this.bodyColor = bodyColor;
        this.x = x;
        this.y = y;
    }
}