import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

class ChangeBGCButton extends JFrame implements ActionListener{
  Container c;
  JButton b,b2,b3;
  int i1 = 0;
  int i2 = 0;


  public static void main(String[] args){
    ChangeBGCButton mf = new ChangeBGCButton();
    mf.setVisible(true);
  }

  public  ChangeBGCButton() {
    // JFrame f = new JFrame();
    setSize(200,300);
    setTitle("複数のボタンを押したら背景色が変わる");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    // f.setVisible(true);
    c = getContentPane();
    c.setLayout(new FlowLayout());
    b = new JButton("Push!");
    b2 = new JButton("Push!");
    b3 = new JButton("Push!");
    b.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    c.add(b);
    c.add(b2);
    c.add(b3);
  }

  @Override
  public void actionPerformed(ActionEvent e){
    
    if(e.getSource()==b){
      if(i1 == 0){
        i1 ++;
      }
      if(i2 == 1){
        c.setBackground(Color.black);
      }
    }
    if(e.getSource()==b2){
      if(i2 == 0){
        i2 ++;
      }
      if(i1 == 1){
        c.setBackground(Color.black);
      }
    }
    // if(e.getSource()==b2){
    // c.setBackground(Color.white);
    // }
    if(e.getSource()==b3){
    c.setBackground(Color.blue);
    }
  }
}