package Model;

import java.awt.EventQueue;
import java.awt.FontFormatException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Auto_Complete extends KeyAdapter
{
    private Double_ArrayList list;
    private JComboBox<String> jcombo;
    private JTable Table;
    private JTextField text_field;
    private ArrayList<String> list_checked = new ArrayList<>();

    public Auto_Complete(Double_ArrayList list, JComboBox<String> jcombo, JTable Table) 
    {
        this.list = list;
        this.jcombo = jcombo;
        this.Table = Table;
        text_field = ((JTextField) jcombo.getEditor().getEditorComponent());
        
    }
    
    
    // Suggestion
    private void Set_Suggestion(ComboBoxModel<String> model, String text)    
    {
        jcombo.setModel(model);
        text_field.setText(text);
    }
    
    private ComboBoxModel<String> Get_Suggestion(String text)
    {        
        String Lower = (text.charAt(0) + "").toLowerCase() + text.substring(1);
        String Upper = (text.charAt(0) + "").toUpperCase()+ text.substring(1);
        
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        list_checked.removeAll(list_checked);
        for(int i = 0; i < list.Total_Size(); i ++)
        {
            for(int j = 0; j < list.Column_Size(i); j++)
            {
                String[] cut = list.Get(i, j).split("-");
                if(cut[0].startsWith(Lower) || cut[0].startsWith(Upper))
                {
                    list_checked.add(cut[0]);
                    model.addElement(cut[0]);
                }
            }
        }
        return model;
    }
    
    
    // Key Event
    @Override 
    public void keyTyped(final KeyEvent e) 
    {
        EventQueue.invokeLater(new Runnable() 
        {
            @Override public void run() 
            {
                String text = ((JTextField) e.getComponent()).getText();
                if(!text.isEmpty())
                {
                    ComboBoxModel<String> model = Get_Suggestion(text);
                    if(model.getSize() != 0)
                    {
                        Set_Suggestion(model, text_field.getText());
                        jcombo.showPopup();
                    } else jcombo.hidePopup();

                } else jcombo.hidePopup();
            }
        });
    } 
    
    @Override 
    public void keyPressed(final KeyEvent e) 
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_ENTER :
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
    }
    
    
    // KeyEvent_Void
    private void Key_Enter() throws IOException, FontFormatException
    {
        if(list_checked.contains(text_field.getText()))
        {
            load_Table(list.IndexOf(text_field.getText()));        
        }
        else
        {
            Table.setModel(new DefaultTableModel());
            jcombo.hidePopup();
        }
        
    }
    
    
    // Load Data for Table
    private Object[] load_ColumName()
    {
        Object[] ob = new Object[]{"Word","Type ","Meaning"};
        return ob;
    }
    
    private Object[][] load_RowData(int location) throws IOException
    {
        Object[][] ob = new Object[list.Column_Size(location)][3];
        for(int i = 0; i < list.Column_Size(location); i++)
        {
            String[] cut = list.Get(location, i).split("-");
            ob[i][0] = cut [0];
            ob[i][1] = cut [1];
            ob[i][2] = cut [2];
        }
        return ob;
    }
    
    private void load_Table(int location) throws IOException, FontFormatException
    {
        TableModel dataModel = new DefaultTableModel(load_RowData(location), load_ColumName())
        { 
            @Override
            public boolean isCellEditable(int row, int column) 
            {
                return false; 
            }                        
        };         
        Table.setModel(dataModel);
        // Set Size
        Table.getColumnModel().getColumn(0).setPreferredWidth(100);
        Table.getColumnModel().getColumn(1).setPreferredWidth(10);
        Table.getColumnModel().getColumn(2).setMinWidth(300);
//----------------------------------------------------------------------------//         
                     
    }      
        
 
}