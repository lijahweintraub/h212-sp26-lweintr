package homework2;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;

public class Shapes extends JComponent{
    public static void main(String[] args) {
        JFrame a = new JFrame();
        a.setVisible(true);
        a.setSize(500, 500);
        a.add(new Shapes());
    }
    point a;
    line l1, l2;
    triangle t;
    public Shapes() {
        this.a = new point(100, 130);
        point a = new point(50, 250), b = new point(150, 180);
        this.l1 = new line(a, b);
        point c = new point(200, 10), d = new point(280, 170);
        this.l2 = new line(c, d);
        point f  = new point(80, 160), g = new point(120, 370);
        this.t = new triangle(f, g, new point(380, 200));
    }
    public void paintComponent(Graphics g) {
        this.a.draw(g);
        this.l1.draw(g);
        this.l2.draw(g);
        this.t.draw(g);
    }
}
