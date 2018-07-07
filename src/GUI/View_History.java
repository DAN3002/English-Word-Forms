package GUI;

import IO.File_Factory;
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
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class View_History extends javax.swing.JFrame 
{
    private LinkedHashMap<String, Integer> list;
    public static View_History conection;

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
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
        // Set font and Icon
        Font font_1 = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("Data\\Font\\ShowcaseSans.ttf"))).deriveFont(Font.PLAIN, 45);
        title.setFont(font_1);     
        
        table.setFont(new Font("Arial", Font.PLAIN, 20));

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
        table.getColumnModel().getColumn(0).setPreferredWidth(300);
        
        // Set TableHeader Properties
        JTableHeader table_header = table.getTableHeader();
        table_header.setPreferredSize(new Dimension(jScrollPane1.getWidth(), 23)); 
        table_header.setBorder(new LineBorder(Color.BLACK, 1));
        table_header.setFont(font_1.deriveFont(Font.BOLD, 20.0f));
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
