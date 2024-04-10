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
        g.drawString("Hello", 10, 10);
    }
}

class JLabelTest extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        Container c = f.getContentPane();
        MyPanel p = new MyPanel();
        c.add(p);
        JLabel l1 = new JLabel("How are you?");
        JLabel l2 = new JLabel("I'm fine.");
        l1.setForeground(Color.red);
        p.add(l1);
        p.add(l2);
        f.setVisible(true);
    }
}