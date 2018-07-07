package Model.Mouse_Listenner;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Input_MouseListenner extends MouseAdapter
{
    private JTextField textField;
    private JTable table;    

    public Input_MouseListenner(JTextField textField, JTable table) 
    {
        this.textField = textField;
        this.table = table;
    }
    
    @Override
    public void mouseClicked(final MouseEvent evt)
    {
        this.table.clearSelection();
        this.textField.selectAll();
    }        
}
