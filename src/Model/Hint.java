package Model;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Hint extends MouseAdapter
{
    private JPopupMenu menu;
    private static JMenuItem  item = new JMenuItem();
    private int location;
    private String text;

    public Hint(JPopupMenu menu, String text, int location) 
    {
        this.menu = menu;                       
        this.text = text;     
        this.location = location;
        
        // Set Item GUI
        this.item.setFont(item.getFont().deriveFont(18f));
        this.item.setForeground(Color.black);
        this.item.setEnabled(false);          
    }
    
    @Override
    public void mouseEntered(final MouseEvent e)
    {
        this.item.setText(text);
        this.menu.add(this.item);
        this.menu.show(e.getComponent(), this.location, 100);             
    }

    @Override
    public void mouseExited(final MouseEvent e)
    {
        this.menu.setVisible(false);
    }

    
}
