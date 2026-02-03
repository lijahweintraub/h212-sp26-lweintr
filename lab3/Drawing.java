package lab3;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Polygon;

public class Drawing extends JComponent{
    int scale, x, y;
    Graphics g;

    public Drawing() {} 


    public Drawing(int scale, int x, int y, Graphics g) {
        this.scale = scale;
        this.x = x;
        this.y = y;
        this.g = g;
    }

    public int scale(int value) {
        return (int) (scale / 500.0 * value);
    }

    public void draw() {
        g.setColor(Color.black);
        g.fillRect(100, 200, 100, 100);
        g.setColor(Color.red);
        g.fillOval(x + scale(13), y + scale(13), scale(75), scale(50));
    }
}
