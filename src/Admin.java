/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author matth
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    private static String adname, adpass, type = "member", types;

    private static String filepath = "src\\data2.json";
    private static JSONParser jsonParser = new JSONParser();
    private static JSONObject record = new JSONObject();
    private static JSONArray userlist = new JSONArray();
    private static JSONObject user = new JSONObject();

    


    public Admin() {

        initComponents();
        loadJsonToTable(); // Load JSON into JTable
        refreshTable(); // Load data when the window opens
       
        Status12.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        product.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        condition.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        date.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        dispose.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        action1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        
        jButton1.setBorderPainted(true);  // Ensure the border is painted
        jButton1.setFocusPainted(false);   // Remove focus outline
        jButton1.setContentAreaFilled(false); // Remove background color
        jButton1.setOpaque(false);         // Ensure transparency
        jButton1.setForeground(Color.WHITE); // Set text color
        jButton1.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font style & size
        // Add a visible border
        jButton1.setBorder(BorderFactory.createLineBorder(Color.WHITE)); // white border with thickness 2
      
        // Simple style for jComboBox1
        jComboBox1.setFont(new Font("Arial", Font.PLAIN, 16));
        jComboBox1.setForeground(new Color(0, 51, 153)); // Dark blue text
        jComboBox1.setBackground(Color.WHITE);           // White background
        jComboBox1.setOpaque(true);                      // Keep solid background
       jComboBox1.setBorder(BorderFactory.createLineBorder(Color.WHITE)); // Simple white border



        // Optional: Add slight drop shadow effect (UIManager tweak or custom painting needed for full effect)
        jButton2.setBorderPainted(true);  // Ensure the border is painted
        jButton2.setFocusPainted(false);   // Remove focus outline
        jButton2.setContentAreaFilled(false); // Remove background color
        jButton2.setOpaque(false);         // Ensure transparency
        jButton2.setForeground(Color.WHITE); // Set text color to white
        jButton2.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font style & size
        // Add a visible border
        jButton2.setBorder(BorderFactory.createLineBorder(Color.WHITE)); // white border with thickness 2

        jButton3.setBorderPainted(true);  // Ensure the border is painted
        jButton3.setFocusPainted(false);   // Remove focus outline
        jButton3.setContentAreaFilled(false); // Remove background color
        jButton3.setOpaque(false);         // Ensure transparency
        jButton3.setForeground(new Color(0, 51, 153)); // Set text color
        jButton3.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font style & size
        // Add a visible border
        jButton3.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 153), 2)); // Blue border with thickness 2

        jButton4.setBorderPainted(true);  // Ensure the border is painted
        jButton4.setFocusPainted(false);   // Remove focus outline
        jButton4.setContentAreaFilled(false); // Remove background color
        jButton4.setOpaque(false);         // Ensure transparency
        jButton4.setForeground(new Color(0, 51, 153)); // Set text color
        jButton4.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font style & size
        // Add a visible border
        jButton4.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 153), 2)); // Blue border with thickness 2

        jButton5.setBorderPainted(true);  // Ensure the border is painted
        jButton5.setFocusPainted(false);   // Remove focus outline
        jButton5.setContentAreaFilled(false); // Remove background color
        jButton5.setOpaque(false);         // Ensure transparency
        jButton5.setForeground(new Color(0, 51, 153)); // Set text color
        jButton5.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font style & size
        // Add a visible border
        jButton5.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 153), 2)); // Blue border with thickness 2
        
        
        
        jButton6.setBorderPainted(true);  // Ensure the border is painted
        jButton6.setFocusPainted(false);   // Remove focus outline
        jButton6.setContentAreaFilled(false); // Remove background color
        jButton6.setOpaque(false);         // Ensure transparency
        jButton6.setForeground(new Color(0, 51, 153)); // Set text color
        jButton6.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font style & size
        // Add a visible border
        jButton6.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 153), 2)); // Blue border with thickness 2
        
        
        jButton7.setBorderPainted(true);  // Ensure the border is painted
        jButton7.setFocusPainted(false);   // Remove focus outline
        jButton7.setContentAreaFilled(false); // Remove background color
        jButton7.setOpaque(false);         // Ensure transparency
        jButton7.setForeground(new Color(0, 51, 153)); // Set text color
        jButton7.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font style & size
        // Add a visible border
        jButton7.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 153), 2)); // Blue border with thickness 2
        
      
        jButton8.setBorderPainted(true);  // Ensure the border is painted
        jButton8.setFocusPainted(false);   // Remove focus outline
        jButton8.setContentAreaFilled(false); // Remove background color
        jButton8.setOpaque(false);         // Ensure transparency
        jButton8.setForeground(new Color(0, 51, 153)); // Set text color
        jButton8.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font style & size
        // Add a visible border
        jButton8.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 153), 2)); // Blue border with thickness 2
        
      
       
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        product = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        condition = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dispose = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Status12 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        action1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME ADMIN USER");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "1MTH: Exp Date", "Category", "DISPOSE DATE   YYYY-MM-DD", "Status", "Alerted Expiration", "Action"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        product.setText("PRODUCT NAME");
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("PRODUCT");

        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("1M:EXP:, DATE  YYYY-MM-DD:");

        date.setText("YYYY-MM-DD");
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("CATEGORY");

        condition.setText("CATEGORY");

        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("DISPOSE DATE   YYYY-MM-DD");

        dispose.setText("DISPOSE DATE   YYYY-MM-DD");
        dispose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disposeActionPerformed(evt);
            }
        });

        jButton3.setText("ADD DETAILS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("CLEAR ALL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("DELETE DETAILS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setText("ALERT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setText("UPDATE DETAILS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("FILL IN THE FORM:");

        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("ACTION BUTTON PRESSED TO PERFORM:");

        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("STATUS");

        Status12.setText("STATUS");

        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("ACTION");

        action1.setText("ACTION");

        jComboBox1.setForeground(new java.awt.Color(0, 51, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FILTER ALERTED", "FILTER OUT OF STOCK" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton8.setText("AUTO FILL");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dispose, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Status12, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(action1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(Status12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(dispose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(action1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jTabbedPane2.addTab("PRODUCT LOGS", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 51, 153));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("MABUHAY, WELCOME TO THE ADMIN DASHBOARD!");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TYPE", "USERNAME", "LOGIN & LOGOUT TIME", "CURRENTLY"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("ACCESS LOGS", jPanel3);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1426, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, Short.MAX_VALUE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login_Page Login_Page = new Login_Page();
        Login_Page.setVisible(true);
        dispose(); // Hides the Admin panel

        JSONParser jsonParser = new JSONParser();
        JSONArray userlist = new JSONArray();

        try (FileReader reader = new FileReader(filepath)) {

            // Parse the JSON file
            JSONObject data = (JSONObject) jsonParser.parse(reader);
            userlist = (JSONArray) data.get("users");

            // Iterate and print each user
            if (userlist != null) {
                JSONObject lastUser = (JSONObject) userlist.get(userlist.size() - 1); // Access the last element in the array

                // Get current date and time
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String formattedDateTime = currentDateTime.format(formatter);

                // Extract fields like username and type
                String type = (String) lastUser.get("type");
                String userName = (String) lastUser.get("username");
                String Logout = "LOGOUT";

                // Print the last entry fields
                System.out.println("Last Entry:");

                System.out.println("Type: " + type);
                System.out.println("Username: " + userName);
                System.out.println("Positive: " + Logout);

                // Create new user object
                JSONObject user = new JSONObject();
                user.put("Login", formattedDateTime);
                user.put("type", type);
                user.put("username", userName);
                user.put("Current", Logout); // Store date & time

                // Add the new user to the existing list
                userlist.add(user);
                record.put("users", userlist); // Ensure users are updated in the record

                save(); // Save the updated JSON file
                JOptionPane.showMessageDialog(null, "Successfully recorded, username  and loginout time !", "Success", JOptionPane.INFORMATION_MESSAGE);

                for (Object obj : userlist) {
                    JSONObject users = (JSONObject) obj; // Cast each object to JSONObject

                }
            } else {
                System.out.println("No users found in the JSON file.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refreshTable(); // Call the refresh method
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            filecheck(); // Ensure JSON data is loaded

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Get text from input fields
            String Product = product.getText().trim();
            String Date =  date.getText().trim(); ;
            String Condition = condition.getText().trim();
            String Status1 = Status12.getText().trim();
            String Action = action1.getText().trim();
            String Dispose1 = dispose.getText().trim();

            boolean updated = false; // Flag to check if update was successful

            for (Object obj : userlist) {
                JSONObject existingUser = (JSONObject) obj;

                // Check if the product exists
                if (Product.equalsIgnoreCase((String) existingUser.get("Product"))) {
                    // Update details
                    
                    existingUser.put("Date", Date);
                    existingUser.put("Condition", Condition);
                    existingUser.put("Dispose", Dispose1);
                    existingUser.put("Status", Status1);
                    existingUser.put("Action", Action);

                    updated = true; // Mark as updated
                    break; // Exit loop after updating
                }
            }

            if (updated) {
                save(); // Save changes to file
                JOptionPane.showMessageDialog(null, "Successfully Updated the Details!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Product not found! Update failed.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException | ParseException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (isChecking) {
            // Stop checking
            if (timer != null) {
                timer.stop();
            }
            isChecking = false;
            jButton4.setText("Start Checking");
            JOptionPane.showMessageDialog(this, "Expiration check stopped.");
            System.out.println("Stopped checking for expiration dates.");
            return;
        }

        // Start checking every 5 seconds
        timer = new Timer(5000, e -> checkExpiration());
        timer.start();
        isChecking = true;
        jButton4.setText("Stop Checking");
        JOptionPane.showMessageDialog(this, "Expiration check started.");
        System.out.println("Started checking for expiration dates...");
        }

        private void checkExpiration() {
            try {
                filecheck(); // Ensure JSON data is loaded

                String currentDate = LocalDate.now().toString(); // Get today's date
                boolean found = false;
                StringBuilder expiredProducts = new StringBuilder(); // ✅ Initialize list

                System.out.println("Still checking for expiration dates..."); // ✅ Console log

                for (Object obj : userlist) {
                    JSONObject existingUser = (JSONObject) obj;
                    String recordDate = (String) existingUser.get("Date");
                    String productName = (String) existingUser.get("Product"); // ✅ Extract product name
                    String notificationStatus = (String) existingUser.get("Notification");

                    if (recordDate != null && productName != null) { // ✅ Ensure values exist
                        // ✅ Check if date matches and has not been informed yet
                        if (currentDate.equalsIgnoreCase(recordDate)
                            && (notificationStatus == null || !"Already Informed".equalsIgnoreCase(notificationStatus))) {

                            existingUser.put("Notification", "Already Informed"); // ✅ Change status
                            expiredProducts.append(productName).append("\n"); // ✅ Append correct product name
                            System.out.println("Alert triggered for product: " + productName + " (Date: " + recordDate + ")"); // ✅ Console log
                            found = true;
                        }
                    }
                }

                if (found) {
                    save(); // Save changes if match is found
                    JOptionPane.showMessageDialog(null,
                        "⚠️ Alert! The following products have expired:\n" + expiredProducts.toString(),
                        "Expiration Alert", JOptionPane.WARNING_MESSAGE);
                    System.out.println("Changes saved to file. Notification set to 'Already Informed'"); // ✅ Console log
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            filecheck(); // Ensure JSON data is loaded

            // Get text from input fields to identify the product to delete
            String ProductToDelete = product.getText().trim();

            // Ask for confirmation before deleting
            int confirmation = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to delete the sales data for product: " + ProductToDelete + "?",
                    "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            boolean deleted = false; // Flag to check if deletion was successful

            // Only proceed if user clicks YES
            if (confirmation == JOptionPane.YES_OPTION) {

                // Iterate through the userlist and find the product to delete
                for (Object obj : userlist) {
                    JSONObject existingUser = (JSONObject) obj;

                    // Check if the product exists
                    if (ProductToDelete.equalsIgnoreCase((String) existingUser.get("Product"))) {
                        userlist.remove(existingUser); // Remove the product from the list
                        deleted = true; // Mark as deleted
                        break; // Exit loop after deleting
                    }
                }

                if (deleted) {
                    save(); // Save changes to file after deletion
                    JOptionPane.showMessageDialog(null, "Successfully Deleted the Product: " + ProductToDelete, "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Product not found! Deletion failed.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Deletion cancelled.", "Info", JOptionPane.INFORMATION_MESSAGE);
            }


        } catch (IOException | ParseException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        product.setText("");
        date.setText("");
        condition.setText("");
        dispose.setText("");
        Status12.setText("");
        action1.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            filecheck(); // Ensure JSON data is loaded

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Get text from input fields
            String Product = product.getText().trim();
            String Date = date.getText().trim();
            String Condition = condition.getText().trim(); // ✅ Get text correctly
            String Status1 = Status12.getText().trim();
            String Dispose1 = dispose.getText().trim();
            String Action = action1.getText().trim();

            // Create a new JSON object
            JSONObject user = new JSONObject();
            user.put("Product", Product);
            user.put("Date", Date);
            user.put("Status", Status1);
            user.put("Condition", Condition); // ✅ Corrected (store text, not JTextField)
            user.put("Dispose", Dispose1);
            user.put("Action", Action);

            // Add user data to list and save
            userlist.add(user);
            record.put("users", userlist);

            save(); // Ensure `save()` writes changes back to the file

            JOptionPane.showMessageDialog(null, "Successfully Added the Details!", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException | ParseException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void disposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disposeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disposeActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // Get the input text from the date field
        String inputDate = date.getText().trim();

        try {
            // Parse input into a LocalDate (assuming input follows a valid pattern)
            LocalDate parsedDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            // Format it to YY-MM-DD
            String formattedDate = parsedDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            // Set the corrected date back into the text field
            date.setText(formattedDate);

        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid date format! Please use YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_dateActionPerformed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
   
        String selectedValue = (String) jComboBox1.getSelectedItem();
        
        
        System.out.println("Selected Value: " + selectedValue);
         // Check if the selected value is "Alerted"
        if ("FILTER ALERTED".equals(selectedValue)) {
            loadJsonToTable(); // Call the method when "ALERTED" is selected
        }  else {
             loadJsonToTable2();
            System.out.println("Invalid selection. No action taken.");
            // Handle unexpected cases
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            filecheck(); // Load product data into 'userlist'

            String searchName = product.getText().trim(); // The name to search
            boolean found = false;

            for (Object obj : userlist) {
                JSONObject item = (JSONObject) obj;

                // Check if product name matches
                if (searchName.equalsIgnoreCase((String) item.get("Product"))) {
                    // ✅ Fill text fields from the correct keys in JSON
                    product.setText((String) item.get("Product"));
                    Status12.setText((String) item.get("Status"));       // example
                    condition.setText((String) item.get("Condition"));   // example
                    date.setText((String) item.get("Date"));             // example
                    dispose.setText(String.valueOf(item.get("Dispose")));
                    action1.setText((String) item.get("Action"));        // example

                    found = true;
                    break;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(this, "Product not found.");
            }

        } catch (Exception e) {
            e.printStackTrace(); // Show error if something goes wrong
        }

    }//GEN-LAST:event_jButton8ActionPerformed
    


    

    private Timer timer;
    private boolean isChecking = false; // Flag to track if checking is running

    private Timer stockCheckTimer; // Renamed timer
    private boolean isStockChecking = false; // Renamed flag    
    

    public void loadJsonToTable() {
        String filePath = "src\\data2.json"; // Update with correct path

        try (FileReader reader = new FileReader(filePath)) {
            JSONParser jsonParser = new JSONParser();
            JSONObject data = (JSONObject) jsonParser.parse(reader);
            JSONArray users = (JSONArray) data.get("users");

            // ✅ Get table model for jTable2
            DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();

            // ✅ Clear existing rows in jTable2
            model2.setRowCount(0);

            // ✅ Iterate through JSON array and add rows with "Action": "NO ACTION YET"
            for (Object obj : users) {
                JSONObject user = (JSONObject) obj;

                // ✅ Add to jTable2 only if "Action" is "NO ACTION YET"
                if (user.containsKey("Status")) {
                    String status1 = (String) user.get("Status");
                    String product = (String) user.get("Product");
                    String quantity = (String) user.get("Dispose");
                    String date = (String) user.get("Date");
                    String condition1 = (String) user.get("Condition");
                    String notification = (String) user.get("Notification");
                    String action = (String) user.get("Action");

                    // ✅ Only add row to model2 if "Action" is "NO ACTION YET"
                    if ("Already Informed".equals(notification)) {
                        model2.addRow(new Object[]{product, date, condition1, quantity, status1, notification, action});
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
     public void loadJsonToTable2() {
        String filePath = "src\\data2.json"; // Update with correct path

        try (FileReader reader = new FileReader(filePath)) {
            JSONParser jsonParser = new JSONParser();
            JSONObject data = (JSONObject) jsonParser.parse(reader);
            JSONArray users = (JSONArray) data.get("users");

            // ✅ Get table model for jTable2
            DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();

            // ✅ Clear existing rows in jTable2
            model2.setRowCount(0);

            // ✅ Iterate through JSON array and add rows with "Action": "NO ACTION YET"
            for (Object obj : users) {
                JSONObject user = (JSONObject) obj;

                // ✅ Add to jTable2 only if "Action" is "NO ACTION YET"
                if (user.containsKey("Status")) {
                    String status1 = (String) user.get("Status");
                    String product = (String) user.get("Product");
                    String quantity = (String) user.get("Dispose");
                    String date = (String) user.get("Date");
                    String condition1 = (String) user.get("Condition");
                    String notification = (String) user.get("Notification");
                    String action = (String) user.get("Action");

                    // ✅ Only add row to model2 if "Action" is "NO ACTION YET"
                    if ("OUT OF STOCK".equals(status1)) {
                        model2.addRow(new Object[]{product, date, condition1, quantity, status1, notification, action});
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     
     
    private void refreshTable() {
        String filePath = "src\\data2.json"; // Adjust to your actual JSON file path

        try (FileReader reader = new FileReader(filePath)) {
            JSONParser jsonParser = new JSONParser();
            JSONObject data = (JSONObject) jsonParser.parse(reader);
            JSONArray users = (JSONArray) data.get("users");

            // Get table model
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();

            // Clear existing rows
            model.setRowCount(0);
            model2.setRowCount(0);

            // Iterate through JSON array and add rows
            for (Object obj : users) {

                JSONObject user = (JSONObject) obj;
                if (user.containsKey("Login")) {
                    String username = (String) user.get("username");
                    String type = (String) user.get("type");
                    String time = (String) user.get("Login");
                    String status = (String) user.get("Current");

                    // Add data to JTable
                    model.addRow(new Object[]{type, username, time, status});

                }

                // ✅ Add to jTable2 (Check if keys exist to avoid errors)
                if (user.containsKey("Status")) {
                    String status1 = (String) user.get("Status");
                    String product = (String) user.get("Product");
                    String quantity = (String) user.get("Dispose");
                    String date = (String) user.get("Date");
                    String condition1 = (String) user.get("Condition");
                    String notification = (String) user.get("Notification");
                    String Action = (String) user.get("Action");

                    model2.addRow(new Object[]{product, date, condition1, quantity, status1, notification, Action});

                }

            }

            System.out.println("Table refreshed successfully!");
            JOptionPane.showMessageDialog(null, "Successfully Refrehsed Tthe table", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    

    public static void filecheck() throws IOException, ParseException {
        File file = new File(filepath);

        // ✅ Check if file exists, if not, create an empty JSON structure
        if (!file.exists()) {
            record = new JSONObject();
            userlist = new JSONArray();
            record.put("users", userlist);
            save(); // Save an empty file to avoid errors
        } else {
            FileReader reader = new FileReader(filepath);
            if (reader.ready()) {
                Scanner scan = new Scanner(reader);
                StringBuilder jsonContent = new StringBuilder();

                while (scan.hasNext()) {
                    jsonContent.append(scan.nextLine());
                }
                reader.close();

                if (!jsonContent.toString().isEmpty()) {
                    record = (JSONObject) jsonParser.parse(jsonContent.toString());
                    userlist = (JSONArray) record.get("users");
                } else {
                    record = new JSONObject();
                    userlist = new JSONArray();
                    record.put("users", userlist);
                }
            }
        }
    }

    public static void save() throws IOException {
        FileWriter file = new FileWriter(filepath);
        file.write(record.toJSONString());
        file.close();
    }

    private void saveJSONToFile(String filePath, JSONObject jsonObject) {
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonObject.toJSONString()); // Writes the JSON object as a string
            file.flush(); // Ensures data is properly written
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving data to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Status12;
    private javax.swing.JTextField action1;
    private javax.swing.JTextField condition;
    private javax.swing.JTextField date;
    private javax.swing.JTextField dispose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField product;
    // End of variables declaration//GEN-END:variables
}
