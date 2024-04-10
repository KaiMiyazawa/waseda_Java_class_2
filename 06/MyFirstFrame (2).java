import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
class MyFirstFrame extends JFrame implements ActionListener {
    Container c;
    JButton b, b2, b3;
    public static void main(String[] args) {
        MyFirstFrame mf = new MyFirstFrame();
        mf.setVisible(true);
    }

    public MyFirstFrame() {
        // JFrame f = new JFrame();
        setSize(300, 200);
        setTitle("Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // f.setVisible(true);
        c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
        b = new JButton("Push!");
        b2 = new JButton("PUSH!");
        b3 = new JButton("push!");
        b.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        c.add(b);
        c.add(b2);
        c.add(b3);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        c.setBackground(Color.black);
    }
}