package Model.Mouse_Listenner;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.border.LineBorder;

public class Hint extends MouseAdapter
{
    private static JMenuItem  item = new JMenuItem();
    private JLabel lable;
    private int locationX;
    private int locationY;
    private String text;
    private Color color;
    public JPopupMenu Menu = new JPopupMenu();    

    public Hint(JPopupMenu Menu ,JLabel lable, String text, int locationX, int locationY, Color color) 
    {                    
        this.lable = lable;
        this.text = text;     
        this.locationX = locationX;                
        this.locationY = locationY;
        this.Menu = Menu;
        this.color = color;
        
        // Set Item GUI
        this.Menu.add(this.item);
        this.item.setFont(item.getFont().deriveFont(18f));
        this.item.setForeground(Color.black);
        this.item.setEnabled(false);   
        this.item.setOpaque(false);
    }
    
    @Override
    public void mouseEntered(final MouseEvent e)
    {
        this.Menu.removeAll();
        this.Menu.add(this.item);                
        this.Menu.setOpaque(false);        
        this.item.setText(text);
        this.Menu.show(e.getComponent(), this.locationX, this.locationY);  
        this.lable.setBorder(new LineBorder(color));
    }

    @Override
    public void mouseExited(final MouseEvent e)
    {
        this.Menu.setVisible(false);
        this.lable.setBorder(null);
    }    
}
