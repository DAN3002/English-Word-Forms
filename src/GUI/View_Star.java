
package GUI;

import IO.File_Factory;
import Model.Double_ArrayList;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class View_Star extends javax.swing.JFrame 
{
    private ArrayList<Integer> list_Star;
    private Double_ArrayList list;    

    public View_Star() throws FontFormatException, IOException, FileNotFoundException, ClassNotFoundException 
    {
        initComponents();
        set_LookAndFeel();
        get_Data();
        set_GUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel()
        {
            // Set Backgound
            final Image image = Toolkit.getDefaultToolkit().createImage("Data\\Image\\Background_Star.png");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Audio = new javax.swing.JLabel();
        Remove = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Text.setFont(new java.awt.Font("iCiel Showcase Sans", 0, 60)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("Star List");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Audio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Audio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
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

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                try {
                    new View_Star().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(View_Star.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(View_Star.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(View_Star.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(View_Star.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Star.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Star.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Star.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
    }
    
    private void set_GUI() throws FileNotFoundException, FontFormatException, IOException
    {
        // Set Font and Icon
        Font font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("Data\\Font\\ShowcaseSans.ttf"))).deriveFont(Font.PLAIN, 60.0f);
        Text.setFont(font);
        
        Audio.setIcon(new ImageIcon("Data\\Icon\\White_Audio.png"));
        Remove.setIcon(new ImageIcon("Data\\Icon\\Remove.png"));
        Home.setIcon(new ImageIcon("Data\\Icon\\Home.png"));
        
        // Set Boder
        jScrollPane1.setBorder(new LineBorder(Color.BLACK));
        
        // Set transparent
        Table.setOpaque(false);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)Table.getDefaultRenderer(Object.class);
        renderer.setOpaque(false);          
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        
        // Set Table GUI
        Table.setForeground(Color.WHITE);
        Table.setSelectionForeground(Color.YELLOW);
        
        // Set TableHeader Properties
        JTableHeader table_header = Table.getTableHeader();
        table_header.setPreferredSize(new Dimension(jScrollPane1.getWidth(), 23)); 
        table_header.setBorder(new LineBorder(Color.BLACK, 1));
        table_header.setFont(font.deriveFont(Font.BOLD, 20.0f));        
        
        // Set table Model
        DefaultTableModel model = new DefaultTableModel()
        { 
            @Override
            public boolean isCellEditable(int row, int column) 
            {
                return false; 
            }                        
        };                 
        model.addColumn("Word");
        model.addColumn("Type");
        model.addColumn("Meaning");
        Table.setModel(model);             
        
        // Set Row and Column
        Table.getColumnModel().getColumn(0).setPreferredWidth(100);
        Table.getColumnModel().getColumn(1).setPreferredWidth(10);
        Table.getColumnModel().getColumn(2).setMinWidth(300);    
        Table.setRowHeight(70);         

        // Set Font
        Font font_Table = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("Data\\Font\\Thinpaw_0.ttf"))).deriveFont(Font.BOLD, 20);
        Table.setFont(font_Table);  
        
        // Disable
        Table.getTableHeader().setReorderingAllowed(false);         
        
        // Set Data
        if(!list_Star.isEmpty())
        {
            load_Table(list_Star.get(0));
        }
    }
    
    private void get_Data() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        list_Star = (ArrayList<Integer>) File_Factory.Input("Data\\Inf\\Star.txt");
        list = new Double_ArrayList((ArrayList<ArrayList<String>>) File_Factory.Input("Data\\Inf\\List.txt")); 
    }

    public void load_Table(int location) throws IOException, FontFormatException
    {              
        DefaultTableModel data_Model = (DefaultTableModel) Table.getModel();
        data_Model.setRowCount(0); // Remove all Row
        
        // Add Row
        for(int i = 0; i < list.Column_Size(location); i++)
        {
            data_Model.addRow(list.Get(location, i).split("-"));
        }               
    }      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Audio;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Remove;
    private javax.swing.JTable Table;
    private javax.swing.JLabel Text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
