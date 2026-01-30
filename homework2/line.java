package homework2;

import java.awt.Graphics;

public class line {
    point one, two;
    public line(point one, point two) {
        this.one = one;
        this.two = two;
    }
    public void draw(Graphics g) {
        g.drawLine(this.one.x, this.one.y, this.two.x, this.two.y);
        this.one.draw(g);
        this.two.draw(g);
    }
}
