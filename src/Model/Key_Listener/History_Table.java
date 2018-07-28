package Model.Key_Listener;

import GUI.Search;
import GUI.View_History;
import java.awt.event.KeyAdapter;
import javax.swing.JTable;
import static GUI.View_History.list_History;
import IO.File_Factory;
import Model.PopUp_Factory;
import java.awt.FontFormatException;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class History_Table extends KeyAdapter
{
    private JTable table;

    public History_Table(JTable table) 
    {
        this.table = table;
    }
    
    @Override
    public void keyPressed(final KeyEvent e)   
    {
        if(e.getKeyCode() == KeyEvent.VK_DELETE)
        {
            try {
                delete();
            } catch (IOException ex) {
                Logger.getLogger(History_Table.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            if ((e.getKeyCode() == KeyEvent.VK_O) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) 
            {
                try {
                    open();
                } catch (FontFormatException ex) {
                    Logger.getLogger(History_Table.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(History_Table.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(History_Table.class.getName()).log(Level.SEVERE, null, ex);
                }
            }        
        }
    }
    
    private void delete() throws IOException
    {
        int[] seletion = this.table.getSelectedRows();
        int answer  = PopUp_Factory.show_Confirm("Are you sure to delete ?", View_History.conection.title.getFont().deriveFont(20.0f), View_History.conection);
        if(answer == JOptionPane.YES_OPTION)
        {
            for(int i : seletion)
            {
                String key = (String) table.getValueAt(i, 0);
                list_History.remove(key);
            }
            File_Factory.Output(list_History, "Data\\Inf\\History.txt");
            View_History.conection.load_Table();
        }
    }
    
    private void open() throws FontFormatException, IOException, FileNotFoundException, ClassNotFoundException
    {
        int[] selection = this.table.getSelectedRows();
        if(selection.length == 1)
        {
            Search.conection.setLocation(View_History.conection.getLocation());
            Search.conection.setVisible(true);
            String str = (String) table.getValueAt(selection[0], 0);
            Search.conection.load_Table(Search.conection.list.IndexOf(str));
            Search.conection.add_History(str);
            Search.conection.TextField.setText("");
            View_History.conection.dispose();
        }
        else
        {
            PopUp_Factory.show_Message("Select only one word !", "Warning",View_History.conection.title.getFont().deriveFont(20.0f), View_History.conection);
        }
    }
    

       
}
