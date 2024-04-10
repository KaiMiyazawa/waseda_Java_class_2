import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
class EventTest extends JFrame implements ActionListener {
    JButton blackButton;
    Container c;

    public static void main(String[] args) {
        EventTest ev = new EventTest();
        ev.setVisible(true);
    }

    public EventTest() {
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(new FlowLayout());
        blackButton = new JButton("黒");
        blackButton.addActionListener(this);
        c.add(blackButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.setBackground(Color.black);
    }
}