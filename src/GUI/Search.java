package GUI;

import IO.File_Factory;
import Model.Key_Listener.Auto_Complete;
import Model.Double_ArrayList;
import Model.TTS;
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
import Model.Mouse_Listenner.Hint;
import Model.Mouse_Listenner.Input_MouseListenner;
import Model.Mouse_Listenner.Star_MouseListenner;
import java.util.LinkedHashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Search extends javax.swing.JFrame {
// Var
    private Double_ArrayList list;
    private static TTS tts;
    public static JPopupMenu Menu = new JPopupMenu();
    public  static int star_Status = 1;
    public static LinkedHashMap<String, Integer> list_History;
    public static Search conection;
    
    public Search() throws FontFormatException, IOException, FileNotFoundException, ClassNotFoundException 
    {
        initComponents();
        Set_LookAndFeel();
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
        jScrollPane_History = new javax.swing.JScrollPane();
        History_Table = new javax.swing.JTable();
        Text_2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Text.setFont(new java.awt.Font("iCiel Showcase Sans", 0, 60)); // NOI18N
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

        jScrollPane_History.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane_History.setOpaque(false);

        History_Table.setBackground(new java.awt.Color(255, 255, 255));
        History_Table.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        History_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane_History.setViewportView(History_Table);

        Text_2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Text_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text_2.setText("History");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Audio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Star, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane_History, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Text_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Audio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Star, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(Text_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane_History, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
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
        try 
        {
            Object str = Table.getValueAt(Table.getSelectedRow(), 0);
            tts.say(str.toString(), (float) 120.0);              
        } catch (Exception e) 
        {
            JLabel lable = new JLabel("Select word from table");            
            lable.setFont(Text.getFont().deriveFont(Font.BOLD, 20.0f));
            JOptionPane.showMessageDialog(this, lable, "Warning", JOptionPane.WARNING_MESSAGE);
        }      
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

    private static void Set_LookAndFeel()
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
    
    private void Set_GUI() throws FileNotFoundException, FontFormatException, IOException
    {                
        // Set Font, Icon
        Font font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("Data\\Font\\ShowcaseSans.ttf"))).deriveFont(Font.PLAIN, 60);
        Text.setFont(font);
        
        Audio.setIcon(new ImageIcon("Data\\Icon\\Audio.png"));
        Star.setIcon(new ImageIcon("Data\\Icon\\Star.png"));
        Home.setIcon(new ImageIcon("Data\\Icon\\Home.png"));           
        
        // Add Listener
         JTextField TextField = (JTextField) Input.getEditor().getEditorComponent();
         TextField.addKeyListener(new Auto_Complete(list, Input, Table));
         TextField.addMouseListener(new Input_MouseListenner(TextField, History_Table));
         
         Menu.setOpaque(false);
         
        // SetTable        
        // Set Model
        DefaultTableModel dataModel = new DefaultTableModel()
        { 
            @Override
            public boolean isCellEditable(int row, int column) 
            {
                return false; 
            }                        
        };
        dataModel.addColumn("Word");
        dataModel.addColumn("Type");
        dataModel.addColumn("Meaning");
        Table.setModel(dataModel);
       
        Table.setShowGrid(true);
        
        // Set Column size
        Table.getColumnModel().getColumn(0).setPreferredWidth(100);
        Table.getColumnModel().getColumn(1).setPreferredWidth(10);
        Table.getColumnModel().getColumn(2).setMinWidth(300);        
        
        // Set Font
        Font font_Table = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("Data\\Font\\Thinpaw_0.ttf"))).deriveFont(Font.BOLD, 20);
        Table.setFont(font_Table);
        
        // Disable
        Table.getTableHeader().setReorderingAllowed(false);   
        
        // Set Size
        Table.setRowHeight(70); 
        
        // Set Compoment transparent 
        Table.setOpaque(false);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)Table.getDefaultRenderer(Object.class);
        renderer.setOpaque(false);        
        
        ScrollPane.setOpaque(false);
        ScrollPane.getViewport().setOpaque(false);  
            
        // History
        DefaultTableModel dataModel_History = new DefaultTableModel()
        { 
            @Override
            public boolean isCellEditable(int row, int column) 
            {
                return false; 
            }                        
        };
        dataModel_History.addColumn("Word");
        dataModel_History.addColumn("Time(s)");
        // Disable
        History_Table.getTableHeader().setReorderingAllowed(false);   
                        
        History_Table.setShowGrid(true);
        History_Table.setRowHeight(27);

        // Set Compoment transparent 
        History_Table.setModel(dataModel_History);
        jScrollPane_History.setOpaque(false);
        jScrollPane_History.getViewport().setOpaque(false);    
        
        History_Table.getSelectionModel().addListSelectionListener(selsection_History);
        
        // Set Data
        set_History();
        
        // Add Hint
        Audio.addMouseListener(new Hint(Menu, Audio, "Play Sound", -8, 100));
        Star.addMouseListener(new Star_MouseListenner(Menu, star_Status));
        Home.addMouseListener(new Hint(Menu, Home, "Back to home", -17, 100));        
               
    }    
    
    private  void Get_Data() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        list = new Double_ArrayList((ArrayList<ArrayList<String>>) File_Factory.Input("Data\\Inf\\List.txt")); 
        list_History = (LinkedHashMap<String, Integer>) File_Factory.Input("Data\\Inf\\History.txt");
        tts = new TTS("kevin16");
        
        conection = this;        
    }
    
    public void set_History()
    {
        // Set History Data
        Object[] list = list_History.keySet().toArray();
        DefaultTableModel data_Model = (DefaultTableModel) History_Table.getModel();
        data_Model.setRowCount(0);
        if(list.length > 0)
        {
            for(int i = list.length - 1; i >= 0; i--)
            {
                String word = list[i].toString();
                String[] str = {word, list_History.get(word).toString()};                
                data_Model.addRow(str);
            }           
        }        
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
    
    // Creat ListSelectionListener for History_Table
    private ListSelectionListener selsection_History = new ListSelectionListener() 
    {
        @Override
        public void valueChanged(ListSelectionEvent e) 
        {
            if(History_Table.getSelectedRow() >= 0)
            {
                String text = (String) History_Table.getValueAt(History_Table.getSelectedRow(), 0);
                try {
                    load_Table(list.IndexOf(text));
                } catch (IOException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FontFormatException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                }                
            }
        }
    };
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Audio;
    private javax.swing.JTable History_Table;
    private javax.swing.JLabel Home;
    private javax.swing.JComboBox<String> Input;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Star;
    private javax.swing.JTable Table;
    private javax.swing.JLabel Text;
    private javax.swing.JLabel Text_2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane_History;
    // End of variables declaration//GEN-END:variables
}
