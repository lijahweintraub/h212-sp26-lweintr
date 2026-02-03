package lab3;

import javax.swing.JFrame;

public class ScaledMain {
    public static void main(String[] args) {
        JFrame a = new JFrame();

        int size = args.length >= 1 ? Integer.parseInt(args[0]) : 500;

        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setSize(size + 20, size + 40);
        a.add(new Scaled(size, size)); 
        a.setVisible(true);
    }
}