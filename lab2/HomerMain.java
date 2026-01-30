package lab2;

import javax.swing.JFrame;

public class HomerMain {
    public static void main(String[] args) {
    JFrame a = new JFrame(); 
    int width = 500, height = 500; 
    a.add(new Homer());
    a.setVisible(true); 
    a.setSize(width, height);   
  }
}
