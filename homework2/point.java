package homework2;

import java.awt.Graphics;

public class point {
    int x, y;
    point(int x, int y) {
    this.x = x;
    this.y = y;
    }
    public void draw(Graphics g) {
        g.drawOval(this.x - 5, this.y - 5, 10, 10);
    }
}