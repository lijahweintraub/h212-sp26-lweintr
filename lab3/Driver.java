package lab3;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Polygon;

public class Driver extends JComponent {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        Driver panel = new Driver();
        frame.add(panel);

        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // clears properly

        // Create your drawing objects (NO Graphics passed into constructor)
        Drawing d  = new Drawing(100, 200, 200);
        Drawing d2 = new Drawing(300, 100, 500);
        Drawing d3 = new Drawing(500, 100, 100);
        Drawing d4 = new Drawing(600, 400, 200);

        // Draw them (call THEIR draw method)
        d.draw(g);
        d2.draw(g);
        d3.draw(g);
        d4.draw(g);
    }
}