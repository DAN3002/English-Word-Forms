package Model;

import java.awt.EventQueue;
import java.awt.FontFormatException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Auto_Complete extends KeyAdapter
{
    private Double_ArrayList list;
    private JComboBox<String> jcombo;
    private JTable Table;
    private JTextField text_field;

    public Auto_Complete(Double_ArrayList list, JComboBox<String> jcombo, JTable Table) 
    {
        this.list = list;
        this.jcombo = jcombo;
        this.Table = Table;
        text_field = ((JTextField) jcombo.getEditor().getEditorComponent());        
    }    
    
    // Suggestion
    private void Set_Suggestion(String text)    
    {
        String Upper = (text.charAt(0) + "").toUpperCase()+ text.substring(1);        
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) jcombo.getModel();
        
        model.removeAllElements();
        model.addElement(text);                
        
        for(int i = 0; i < list.Total_Size(); i ++)
        {
            for(int j = 0; j < list.Column_Size(i); j++)
            {
                String[] cut = list.Get(i, j).split("-");
                
                if(cut[0].startsWith(Upper))
                {
                    model.addElement(cut[0]);
                }
            }
        }
        
        if(jcombo.getItemCount() == 1)
        {
            jcombo.hidePopup();
        } else jcombo.showPopup();
    }    
    
    // Key Event
    @Override 
    public void keyTyped(final KeyEvent e) 
    {
        EventQueue.invokeLater(new Runnable() 
        {
            @Override public void run() 
            {
                if(e.getKeyChar()!= KeyEvent.VK_ENTER)
                {
                    String text = text_field.getText();
                    
                    if(!text.isEmpty())
                    {
                        Set_Suggestion(text);
                    } else jcombo.hidePopup();                    
                }
                else
                {
                    try {
                        Key_Enter();
                    } catch (IOException ex) {
                        Logger.getLogger(Auto_Complete.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (FontFormatException ex) {
                        Logger.getLogger(Auto_Complete.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }         
    
    // KeyEvent_Void
    private void Key_Enter() throws IOException, FontFormatException
    {
        if(jcombo.getItemCount() > 1)
        {
            load_Table(list.IndexOf(text_field.getText()));                 
        }        
        jcombo.hidePopup();
        
    }
    
    // Load Data for Table    
    private void load_Table(int location) throws IOException, FontFormatException
    {              
        DefaultTableModel data_Model = (DefaultTableModel) Table.getModel();
        data_Model.setRowCount(0); // Remove all Row
        
        // Add Row
        for(int i = 0; i < list.Column_Size(location); i++)
        {
            data_Model.addRow(list.Get(location, i).split("-"));
        }
    }              
}