package GUI;

import IO.File_Factory;
import Model.Auto_Complete;
import Model.Double_ArrayList;
import Model.TTS;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import IO.Swing_Factory;
import Model.Hint;
import Model.Star_MouseListenner;
import javax.swing.JPopupMenu;

public class Search extends javax.swing.JFrame {
// Var
    private Double_ArrayList list;
    private static TTS tts;
    private static JPopupMenu Menu = new JPopupMenu();
    public  static int star_Status = 1;
    
    public Search() throws FontFormatException, IOException, FileNotFoundException, ClassNotFoundException 
    {
        initComponents();
        Get_Data();
        Set_GUI();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel()
        {
            // Set Backgound
            final Image image = Toolkit.getDefaultToolkit().createImage("Data\\Image\\Background_Search.png");
            @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                if (image != null)
                {
                    g.drawImage(image, 0, 0, this);
                }
            }
        }
        ;
        Text = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Input = new javax.swing.JComboBox<>();
        Home = new javax.swing.JLabel();
        Audio = new javax.swing.JLabel();
        Star = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("Search Word Form");

        ScrollPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table.setSelectionBackground(new java.awt.Color(255, 0, 0));
        Table.setSelectionForeground(new java.awt.Color(255, 0, 0));
        Table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        ScrollPane.setViewportView(Table);

        Input.setEditable(true);
        Input.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Input.setRequestFocusEnabled(true);

        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        Audio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AudioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(Audio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Star, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Audio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Star, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AudioMouseClicked
        System.out.println(star_Status);
        Object str = Table.getValueAt(Table.getSelectedRow(), 0);
        tts.say(str.toString(), (float) 120.0);        
    }//GEN-LAST:event_AudioMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        Swing_Factory.show_Swing(new Menu(), this);
    }//GEN-LAST:event_HomeMouseClicked

    public static void main(String args[]) 
    {
        Set_LookAndFeel();
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                try {
                    new Search().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static void Set_LookAndFeel()
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
    }
    
    public void Set_GUI() throws FileNotFoundException, FontFormatException, IOException
    {                
        // Set Font, Icon
        Font font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("Data\\Font\\ShowcaseSans.ttf"))).deriveFont(Font.PLAIN, 60);
        Text.setFont(font);
        
        // Set RequestFocus
        Input.setRequestFocusEnabled(true);
        
        // Add Listener
         JTextField TextField = (JTextField) Input.getEditor().getEditorComponent();
         TextField.addKeyListener(new Auto_Complete(list, Input, Table));
         
        // SetTable
        // Set Gird
        Table.setGridColor(Color.BLACK);
        Table.setShowGrid(true);
        
        // Set Font
        Font font_Table = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("Data\\Font\\Thinpaw_0.ttf"))).deriveFont(Font.BOLD, 20);
        Table.setFont(font_Table);
        
        // Disable
        Table.getTableHeader().setReorderingAllowed(false);   
        
        // Set Size
        Table.setRowHeight(70); 
        
        // Set Jtable transparent 
        Table.setOpaque(false);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)Table.getDefaultRenderer(Object.class);
        renderer.setOpaque(false);        
        
        ScrollPane.setOpaque(false);
        ScrollPane.getViewport().setOpaque(false);  
        
        // Set Icon
        Audio.setIcon(new ImageIcon("Data\\Icon\\Audio.png"));
        Star.setIcon(new ImageIcon("Data\\Icon\\Star.png"));
        Home.setIcon(new ImageIcon("Data\\Icon\\Home.png"));                        
        
        // Add Hint
        Audio.addMouseListener(new Hint(Menu, "Play Sound", -8));
        Star.addMouseListener(new Star_MouseListenner(Menu, star_Status));
        Home.addMouseListener(new Hint(Menu, "Back to home", -17));
        Menu.setOpaque(false);
               
    }    
    
    public void Get_Data() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        list = new Double_ArrayList((ArrayList<ArrayList<String>>) File_Factory.Input("Data\\Inf\\List.txt")); 
        
        tts = new TTS("kevin16");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Audio;
    private javax.swing.JLabel Home;
    private javax.swing.JComboBox<String> Input;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Star;
    private javax.swing.JTable Table;
    private javax.swing.JLabel Text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
