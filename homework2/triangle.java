package homework2;

import java.awt.Graphics;

public class triangle {
    point a, b, c;
    public triangle(point a , point b, point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void draw(Graphics g) {  
        (new line(this.a, this.b)).draw(g);
        (new line(this.b, this.c)).draw(g);
        (new line(this.c, this.a)).draw(g);
    }
}

