package gui_practice;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyJPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.drawString("Hello World", 100, 100);
        g.drawString("Hello World2", 100, 120);
    }
    
}
