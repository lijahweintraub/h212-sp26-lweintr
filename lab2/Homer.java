package lab2;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;

public class Homer extends JComponent {

    public void paintComponent(Graphics g) {

        // background
        g.setColor(Color.white);
        g.fillRect(0, 0, 500, 500);

        Color homerSkin = new Color(255, 217, 15);
        g.setColor(homerSkin);

        // head
        g.setColor(homerSkin); 
        g.fillOval(100, 60, 200, 300);
        g.setColor(Color.black); 

        //thicker
        g.drawOval(100, 60, 200, 300);
        g.drawOval(100, 60, 200, 300);
        g.drawOval(101, 60, 200, 300);
        g.drawOval(100, 61, 200, 300);
        g.drawOval(101, 61, 200, 300);

        // eyes
        g.setColor(Color.white);
        g.fillOval(160, 140, 90, 90); // left
        g.fillOval(220, 140, 80, 80); // right

        //outline
        g.setColor(Color.black);
        g.drawOval(160, 140, 90, 90);
        g.drawOval(161, 140, 90, 90);
        g.drawOval(160, 141, 90, 90);
 

        g.drawOval(220, 140, 80, 80);
        g.drawOval(221, 140, 80, 80);
        g.drawOval(220, 141, 80, 80);
   



        // inner eye
        g.setColor(Color.black);
        g.fillOval(190, 180, 12, 12);
        g.fillOval(265, 173, 12, 12);

        // nose
        g.setColor(homerSkin);
        g.fillArc(210, 215, 84, 20, 180, 280);
        g.setColor(Color.black);
        g.drawArc(210, 215, 84, 20, 180, 280);
        g.drawArc(211, 215, 84, 20, 180, 280);
        g.drawArc(210, 216, 84, 20, 180, 280);
        

        Color mouthColor = new Color(214, 185, 120);
        //mouth
        g.setColor(mouthColor);
        g.fillOval(140, 228, 180, 80);
        g.fillOval(134, 240, 130, 110);
        g.setColor(Color.black);
        g.drawArc(150, 270, 160, 30, 220, 140);
        g.drawArc(151, 270, 160, 30, 220, 140);
        g.drawArc(150, 271, 160, 30, 220, 140);

        g.drawArc(168, 286, 20, 20, 100, 110);
        g.drawArc(169, 286, 20, 20, 100, 110);
        g.drawArc(168, 287, 20, 20, 100, 110);




        //ear
        g.setColor(homerSkin);
        g.fillOval(85, 210, 45, 55);
        g.setColor(Color.black);
        g.drawArc(85, 210, 45, 55, 90, 220);
        g.drawArc(86, 210, 45, 55, 90, 220);
        g.drawArc(85, 211, 45, 55, 90, 220);
        g.drawLine(104, 250, 104, 230);
        g.drawLine(94, 236, 114, 230);


        //cover inner eye
        g.setColor(Color.white);
        g.fillOval(202, 145, 43, 79);


        //hair
        g.setColor(Color.black);
        g.drawArc(145, 55, 70, 70, 20, 150);
        g.drawArc(146, 55, 70, 70, 20, 150);
        g.drawArc(145, 56, 70, 70, 20, 150);

        g.drawArc(165, 55, 70, 70, 20, 120);
        g.drawArc(166, 55, 70, 70, 20, 120);
        g.drawArc(165, 56, 70, 70, 20, 120);

        g.drawLine(90, 210, 92, 180);
        g.drawLine(92, 180, 104, 200);
        g.drawLine(104, 200, 110, 170);
        g.drawLine(110, 170, 117, 210);
}
}