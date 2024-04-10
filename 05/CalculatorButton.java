import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;

class CalculatorButton extends JFrame{
  public static void main(String[] args){
    JFrame f = new JFrame();
    f.setSize(300,400);
    f.setTitle("Calculator Button");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = f.getContentPane();

    c.setLayout(new GridLayout(5,4));
    
    JButton bc = new JButton("C");
    JButton bp = new JButton("%");
    JButton be = new JButton("delete");
    JButton bd = new JButton("÷");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton bt = new JButton("×");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton bm = new JButton("-");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton ba = new JButton("+");
    JButton b00 = new JButton("00");
    JButton b0 = new JButton("0");
    JButton bpoint = new JButton(".");
    JButton bequal = new JButton("=");

    c.add(bc);
    c.add(bp);
    c.add(be);
    c.add(bd);
    c.add(b7);
    c.add(b8);
    c.add(b9);
    c.add(bt);
    c.add(b4);
    c.add(b5);
    c.add(b6);
    c.add(bm);
    c.add(b1);
    c.add(b2);
    c.add(b3);
    c.add(ba);
    c.add(b00);
    c.add(b0);
    c.add(bpoint);
    c.add(bequal);

    f.setVisible(true);
  }
}