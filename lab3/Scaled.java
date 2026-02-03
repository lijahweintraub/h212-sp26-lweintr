package lab3;

import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.Color;

public class Scaled extends JComponent {

    int width, height;

    public Scaled(int width, int height) {
        this.width = width;
        this.height = height;
    }

    
    int scale(int value) {
        return (int)(this.width / 500.0 * value);
    }

    public void paintComponent(Graphics g) {
        // background
        g.setColor(Color.white);
        g.fillRect(0, 0, scale(500), scale(500));

        Color homerSkin = new Color(255, 217, 15);
        Color mouthColor = new Color(214, 185, 120);

        // head
        g.setColor(homerSkin);
        g.fillOval(scale(100), scale(60), scale(200), scale(300));

        g.setColor(Color.black);

        // thicker outline (scaled offsets too)
        g.drawOval(scale(100), scale(60), scale(200), scale(300));
        g.drawOval(scale(100), scale(60), scale(200), scale(300));
        g.drawOval(scale(101), scale(60), scale(200), scale(300));
        g.drawOval(scale(100), scale(61), scale(200), scale(300));
        g.drawOval(scale(101), scale(61), scale(200), scale(300));

        // eyes
        g.setColor(Color.white);
        g.fillOval(scale(160), scale(140), scale(90), scale(90)); // left
        g.fillOval(scale(220), scale(140), scale(80), scale(80)); // right

        // eye outlines (thicker)
        g.setColor(Color.black);
        g.drawOval(scale(160), scale(140), scale(90), scale(90));
        g.drawOval(scale(161), scale(140), scale(90), scale(90));
        g.drawOval(scale(160), scale(141), scale(90), scale(90));

        g.drawOval(scale(220), scale(140), scale(80), scale(80));
        g.drawOval(scale(221), scale(140), scale(80), scale(80));
        g.drawOval(scale(220), scale(141), scale(80), scale(80));

        // inner eye
        g.setColor(Color.black);
        g.fillOval(scale(190), scale(180), scale(12), scale(12));
        g.fillOval(scale(265), scale(173), scale(12), scale(12));

        // nose
        g.setColor(homerSkin);
        g.fillArc(scale(210), scale(215), scale(84), scale(20), 180, 280);
        g.setColor(Color.black);
        g.drawArc(scale(210), scale(215), scale(84), scale(20), 180, 280);
        g.drawArc(scale(211), scale(215), scale(84), scale(20), 180, 280);
        g.drawArc(scale(210), scale(216), scale(84), scale(20), 180, 280);

        // mouth
        g.setColor(mouthColor);
        g.fillOval(scale(140), scale(228), scale(180), scale(80));
        g.fillOval(scale(134), scale(240), scale(130), scale(110));

        g.setColor(Color.black);
        g.drawArc(scale(150), scale(270), scale(160), scale(30), 220, 140);
        g.drawArc(scale(151), scale(270), scale(160), scale(30), 220, 140);
        g.drawArc(scale(150), scale(271), scale(160), scale(30), 220, 140);

        g.drawArc(scale(168), scale(286), scale(20), scale(20), 100, 110);
        g.drawArc(scale(169), scale(286), scale(20), scale(20), 100, 110);
        g.drawArc(scale(168), scale(287), scale(20), scale(20), 100, 110);

        // ear
        g.setColor(homerSkin);
        g.fillOval(scale(85), scale(210), scale(45), scale(55));
        g.setColor(Color.black);
        g.drawArc(scale(85), scale(210), scale(45), scale(55), 90, 220);
        g.drawArc(scale(86), scale(210), scale(45), scale(55), 90, 220);
        g.drawArc(scale(85), scale(211), scale(45), scale(55), 90, 220);

        g.drawLine(scale(104), scale(250), scale(104), scale(230));
        g.drawLine(scale(94), scale(236), scale(114), scale(230));

        // cover inner eye
        g.setColor(Color.white);
        g.fillOval(scale(202), scale(145), scale(43), scale(79));

        // hair
        g.setColor(Color.black);
        g.drawArc(scale(145), scale(55), scale(70), scale(70), 20, 150);
        g.drawArc(scale(146), scale(55), scale(70), scale(70), 20, 150);
        g.drawArc(scale(145), scale(56), scale(70), scale(70), 20, 150);

        g.drawArc(scale(165), scale(55), scale(70), scale(70), 20, 120);
        g.drawArc(scale(166), scale(55), scale(70), scale(70), 20, 120);
        g.drawArc(scale(165), scale(56), scale(70), scale(70), 20, 120);

        g.drawLine(scale(90), scale(210), scale(92), scale(180));
        g.drawLine(scale(92), scale(180), scale(104), scale(200));
        g.drawLine(scale(104), scale(200), scale(110), scale(170));
        g.drawLine(scale(110), scale(170), scale(117), scale(210));
    }
}