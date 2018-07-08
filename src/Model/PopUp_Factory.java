package Model;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PopUp_Factory 
{
    public static void show_Message(String text, String title, Font font, Component com)
    {
        JLabel lable = new JLabel(text);
        lable.setFont(font);        
        JOptionPane.showMessageDialog(com, lable, title, JOptionPane.PLAIN_MESSAGE, null); 
    }
    
    public static  int show_Confirm(String text, Font font, Component com)
    {
        JLabel lable = new JLabel(text);
        lable.setFont(font);
        return JOptionPane.showConfirmDialog(com, lable, "Wraning", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
    }    
}
