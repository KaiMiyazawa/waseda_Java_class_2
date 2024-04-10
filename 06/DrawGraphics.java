import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JLabel;
import java.awt.Color;
class MyPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // g.drawString("Hello", 10, 10);
        g.drawArc(75, 50, 100, 100, 0, 360);
        g.drawArc(105, 85, 10, 10, 0, 360);
        g.drawArc(135, 85, 10, 10, 0, 360);
        g.drawArc(90, 65, 70, 70, 0, -180);
    }
}

class DrawGraphics extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        Container c = f.getContentPane();
        MyPanel p = new MyPanel();
        c.add(p);
        f.setVisible(true);
    }
}