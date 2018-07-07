package Model.Mouse_Listenner;
        
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import static GUI.Search.star_Status;

        
public class Star_MouseListenner extends MouseAdapter
{
    private JPopupMenu menu;
    private static JMenuItem  item = new JMenuItem();

    public Star_MouseListenner(JPopupMenu menu, int status) 
    {
        this.menu = menu;
        
        // Set Item GUI
        this.item.setFont(item.getFont().deriveFont(18f));
        this.item.setForeground(Color.black);
        this.item.setEnabled(false);     
    }
    
    
    
    public void mouseEntered(final MouseEvent e)
    {
        switch(star_Status)
        {
            case 1: // Star
            {
                this.item.setText("Star this word !");
                break;
            }
            case 2: // Unstar
            {
                this.item.setText("Unstar this word !");
                break;
            }
            case 0: // Unknow
            {
                break;
            }
        }
    }

    @Override
    public void mouseExited(final MouseEvent e)
    {
        this.menu.setVisible(false);
    }    
    
    
}
