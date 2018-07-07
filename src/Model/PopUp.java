package Model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class PopUp extends JOptionPane
{
    private Image image;

    public PopUp(String img) 
    {
        this.image = Toolkit.getDefaultToolkit().createImage(img);
    }
        
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (image != null)
        {
            g.drawImage(image, 0, 0, this);
        }
    }
}
