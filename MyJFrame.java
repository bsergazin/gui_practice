package gui_practice;
import javax.swing.JFrame;

public class MyJFrame extends JFrame {
    public MyJFrame(String title) {
        super(title);
        //MyJPanel myJPanel = new MyJPanel();
        //setContentPane(myJPanel);
        setSize(300,300);
        setLocation(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
