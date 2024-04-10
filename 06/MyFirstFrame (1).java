import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.FlowLayout;
class MyFirstFrame extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 200);
        f.setTitle("Demo");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton b = new JButton("Push!");
        JButton b2 = new JButton("PUSH!");
        JButton b3 = new JButton("push!");
        c.add(b);
        c.add(b2);
        c.add(b3);

    }
}