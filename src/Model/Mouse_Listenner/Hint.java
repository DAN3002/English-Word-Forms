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
    public static JPopupMenu Menu = new JPopupMenu();    

    public Hint(JPopupMenu Menu ,JLabel lable, String text, int locationX, int locationY) 
    {                    
        this.lable = lable;
        this.text = text;     
        this.locationX = locationX;
        this.locationY = locationY;
        this.Menu = Menu;
        
        // Set Item GUI
        this.item.setFont(item.getFont().deriveFont(18f));
        this.item.setForeground(Color.black);
        this.item.setEnabled(false);     
    }
    
    @Override
    public void mouseEntered(final MouseEvent e)
    {
        this.item.setText(text);
        this.Menu.add(this.item);
        this.Menu.show(e.getComponent(), this.locationX, this.locationY);  
        this.lable.setBorder(new LineBorder(Color.BLACK));
    }

    @Override
    public void mouseExited(final MouseEvent e)
    {
        this.Menu.setVisible(false);
        this.lable.setBorder(null);
    }

    
}
