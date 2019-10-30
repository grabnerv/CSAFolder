// GraphicsLab01st.java
// The AWT Graphics Program
// This is the student, starting version of Graphics Lab 01.

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsLab01 extends JPanel
{

    public void paintComponent(Graphics g)
    {
        // DRAW CUBE
        g.drawRect(25, 25, 300,300);
        g.drawRect(100, 100, 300, 300);
        g.drawLine(25, 25, 100, 100);
        g.drawLine(25, 325, 100, 400);
        g.drawLine(325, 25, 400, 100);
        g.drawLine(325, 325, 400, 400);
        
        // DRAW SPHERE
        
        //horizontal
        g.drawOval(50, 175, 300, 75);
        g.drawOval(50, 125, 300, 175);
        g.drawOval(50, 75, 300, 300);
        g.drawOval(50, 100, 300, 250);
        
        //vertical
        g.drawOval(162, 75, 75, 300);
        g.drawOval(112, 75, 175, 300);
        g.drawOval(62, 75, 275, 300);
        
       

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(550, 350, 200, 200);
        g.drawLine(550, 450, 722, 380);
        g.drawLine(722, 380, 650, 550);
        g.drawLine(650, 550, 550, 450);
        g.drawOval(575, 400, 100, 100);

        // DRAW APCS


        // DRAW PACMEN FLOWER
        g.fillArc(300, 450, 75, 75, 225, 270);
        g.fillArc(350, 400, 75, 75, 135, 270);
        g.fillArc(350, 500, 75, 75, 315, 270);
        g.fillArc(400, 450, 75, 75, 45, 270);
       

    }

    
    public static void main(String[] args){
          JFrame frame = new JFrame("GraphicsLab01");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setBounds(100, 100, 800, 600);
          frame.setContentPane(new GraphicsLab01());
          frame.setVisible(true);

          
        
    }
}
