package GUI;

import IO.File_Factory;
import IO.Swing_Factory;
import Model.Mouse_Listenner.Hint;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Graphics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class View_History extends javax.swing.JFrame 
{
    private LinkedHashMap<String, Integer> list;
    public static View_History conection;
    public static JPopupMenu Menu = new JPopupMenu();

    public View_History() throws FontFormatException, IOException, FileNotFoundException, ClassNotFoundException
    {
        initComponents();      
        set_LookAndFeel();
        set_GUI();
        input_Data();
        load_Table();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel()
        {
            // Set Backgound
            final Image image = Toolkit.getDefaultToolkit().createImage("Data\\Image\\Background_History.png");
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
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Home = new javax.swing.JLabel();
        Help = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        title.setFont(new java.awt.Font("iCiel Showcase Sans", 0, 45)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("View History");

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Help, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Help, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        Swing_Factory.show_Swing(new Menu(), this);
    }//GEN-LAST:event_HomeMouseClicked

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
        JLabel lable = new JLabel("<html>\"Delete\" : Delete that Word\n" + "<br>" +"\"Ctrl + O\": Search that Word </html>");
        lable.setFont(title.getFont().deriveFont(Font.BOLD, 18.0f));
        JOptionPane.showMessageDialog(this, lable, "Help", JOptionPane.PLAIN_MESSAGE, null);
    }//GEN-LAST:event_HelpMouseClicked

    public static void main(String args[]) 
    {        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                try {
                    new View_History().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(View_History.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(View_History.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(View_History.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void set_LookAndFeel()
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
    }
    
    private void set_GUI() throws FileNotFoundException, FontFormatException, IOException
    {
        Menu.setOpaque(false);
        
        // Set font and Icon
        Font font_1 = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("Data\\Font\\ShowcaseSans.ttf"))).deriveFont(Font.PLAIN, 45);
        title.setFont(font_1);             
        table.setFont(new Font("Arial", Font.PLAIN, 20));
        Home.setIcon(new ImageIcon("Data\\Icon\\Home.png"));
        Help.setIcon(new ImageIcon("Data\\Icon\\Help.png"));

        // Set Table transparent       
        table.setOpaque(false);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)table.getDefaultRenderer(Object.class);
        renderer.setOpaque(false);        
        
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);  
        
        // Set Table Model
        DefaultTableModel dataModel = new DefaultTableModel()
        { 
            @Override
            public boolean isCellEditable(int row, int column) 
            {
                return false; 
            }                        
        };                
        dataModel.addColumn("Word");
        dataModel.addColumn("Time(s)");
        table.setModel(dataModel);
        
        // Set Table Properties
        table.getTableHeader().setReorderingAllowed(false); 
        table.setShowGrid(true);
        table.setRowHeight(37); 
        table.setSelectionForeground(Color.RED); 
        table.getColumnModel().getColumn(0).setPreferredWidth(350);
        
        // Set TableHeader Properties
        JTableHeader table_header = table.getTableHeader();
        table_header.setPreferredSize(new Dimension(jScrollPane1.getWidth(), 23)); 
        table_header.setBorder(new LineBorder(Color.BLACK, 1));
        table_header.setFont(font_1.deriveFont(Font.BOLD, 20.0f));
        
        // Add Listenner
        Home.addMouseListener(new Hint(Menu, Home, "Back to home", -17, 100));
        Help.addMouseListener(new Hint(Menu, Help, "Help", 20, 100));
    }
    
    private void input_Data() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        list = (LinkedHashMap<String, Integer>) File_Factory.Input("Data\\Inf\\History.txt");           
        conection = this;
    }
    
    public void load_Table()
    {
        Object[] list_Key = list.keySet().toArray();
        DefaultTableModel data_Model = (DefaultTableModel) table.getModel();
        data_Model.setRowCount(0);
        if(list_Key.length > 0)
        {
            for(int i = list_Key.length - 1; i >= 0; i--)
            {
                String word = list_Key[i].toString();
                String[] str = {word, list.get(word).toString()};                
                data_Model.addRow(str);
            }           
        } 
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Help;
    private javax.swing.JLabel Home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
