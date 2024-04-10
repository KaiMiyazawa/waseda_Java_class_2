import javax.swing.JFrame;
class MyFirstFrame extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 200);
        f.setTitle("Demo");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);


    }
}