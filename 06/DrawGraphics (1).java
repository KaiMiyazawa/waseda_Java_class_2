import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

class MyPanel extends JPanel implements ActionListener {
    int x = 0, y = 0, dx = 10, dy = 10;
    int width, height;
    Timer t;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(0, 0, width, height);
        g.drawArc(x, y, 100, 100, 0, 360);
        g.drawArc(x + 30, y + 35, 10, 10, 0, 360);
        g.drawArc(x + 60, y + 35, 10, 10, 0, 360);
        g.drawArc(x + 15, y + 15, 70, 70, 0, -180);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + dx; // x += dx;
        y = y + dy; // y += dy;
        if (x < 0 || x > width) {
            dx = -1 * dx;
        }
        if (y < 0 || y > height) {
            dy = -1 * dy;
        }
        repaint();
    }
    public MyPanel(int w, int h) {
        width = w;
        height = h;
        t = new Timer(200, this);
    }
    public void start() {
        t.start();
    }
}

class DrawGraphics extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        Container c = f.getContentPane();
        MyPanel p = new MyPanel(300, 150);
        c.add(p);
        p.start();
        f.setVisible(true);
    }
}