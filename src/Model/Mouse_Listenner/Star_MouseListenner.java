package Model.Mouse_Listenner;

import GUI.Search;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import static GUI.Search.star_Status;
import static GUI.Search.star_Location;
import static GUI.Search.list_Star;
import IO.File_Factory;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class Star_MouseListenner extends MouseAdapter
{
    private static JMenuItem  item = new JMenuItem();
    private JLabel lable;
    private int location;
    public JPopupMenu Menu = new JPopupMenu();    

    public Star_MouseListenner(JPopupMenu Menu ,JLabel lable) 
    {                    
        this.lable = lable;
        this.Menu = Menu;        
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
        if(star_Status != 0)
        {
            if(star_Status == 1)
            {
                this.item.setText("Star");
                this.location = 20;
            } 
            else
            {
                this.item.setText("Unstar");
                this.location = 10;
            }
            
            this.Menu.removeAll();
            this.Menu.add(this.item);
            this.Menu.setOpaque(false);        
            this.Menu.show(e.getComponent(), this.location, 100);  
            this.lable.setBorder(new LineBorder(Color.BLACK));            
        }
        else
        {
            System.out.println("Sds");
        }
    }    

    @Override
    public void mouseExited(final MouseEvent e)
    {
        this.Menu.setVisible(false);
        this.lable.setBorder(null);
    }    
    
    @Override
    public void mouseClicked(final MouseEvent e)
    {      
        if(star_Status == 1)
        {
            list_Star.add(star_Location);
            star_Status = 2;
            Search.conection.Star.setIcon(new ImageIcon("Data\\Icon\\Star.png"));
        }
        else
        {
            if(star_Status == 2)
            {
                list_Star.remove(list_Star.indexOf(star_Location));
                star_Status = 1;
                Search.conection.Star.setIcon(new ImageIcon("Data\\Icon\\Unstar.png"));                
            }
        }        
        try {
            File_Factory.Output(list_Star, "Data\\Inf\\Star.txt");
        } catch (IOException ex) {
            Logger.getLogger(Star_MouseListenner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
