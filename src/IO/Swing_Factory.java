package IO;

import javax.swing.JFrame;

public class Swing_Factory
{
    public static void show_Swing(JFrame JF_1, JFrame JF_2)
    {
        JF_1.setLocation(JF_2.getLocation());
        JF_1.setVisible(true);
        JF_2.dispose();
    }
    
    public static void showAndHide_Swing(JFrame JF_1, JFrame JF_2)
    {
        JF_1.setLocation(JF_2.getLocation());
        JF_1.setVisible(true);
        JF_2.setVisible(false);
    }    
}