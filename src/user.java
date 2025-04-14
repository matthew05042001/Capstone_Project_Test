
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;


import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author matth
 */
public class user extends javax.swing.JFrame {

    /**
     * Creates new form user
     */
    
     private static String adname, adpass, type = "member", types;

   
    private static String filepath = "src\\leaderboard.json";
    private static JSONParser jsonParser = new JSONParser();
    private static JSONObject record = new JSONObject();
    private static JSONArray userlist = new JSONArray();
    private static JSONObject user = new JSONObject();
  

    
    
    public user() {
        initComponents();
        loadSalesDataIntoTable();
        loadJsonToTable(); // Load JSON into JTable
        refreshTable(); // Load data when the window opens
    
    
        
        jTextField1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        
      
        
        
        
        
        jButton1.setBorderPainted(true);  // Ensure the border is painted
        jButton1.setFocusPainted(false);   // Remove focus outline
        jButton1.setContentAreaFilled(false); // Remove background color
        jButton1.setOpaque(false);         // Ensure transparency
        jButton1.setForeground(new Color(0, 51, 153)); // Set text color
        jButton1.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font style & size
        // Add a visible border
        jButton1.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 153), 2)); // Blue border with thickness 2
        
        
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
        
        
        
        jButton9.setBorderPainted(true);  // Ensure the border is painted
        jButton9.setFocusPainted(false);   // Remove focus outline
        jButton9.setContentAreaFilled(false); // Remove background color
        jButton9.setOpaque(false);         // Ensure transparency
        jButton9.setForeground(new Color(0, 51, 153)); // Set text color
        jButton9.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font style & size
        // Add a visible border
        jButton9.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 153), 2)); // Blue border with thickness 2
    
        
        
        jButton10.setBorderPainted(true);  // Ensure the border is painted
        jButton10.setFocusPainted(false);   // Remove focus outline
        jButton10.setContentAreaFilled(false); // Remove background color
        jButton10.setOpaque(false);         // Ensure transparency
        jButton10.setForeground(Color.WHITE); // Set text color to white
        jButton10.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font style & size
        // Add a visible border
        jButton10.setBorder(BorderFactory.createLineBorder(Color.WHITE)); // white border with thickness 2
      
        
        
         // Simple style for jComboBox1
        jComboBox1.setFont(new Font("Arial", Font.PLAIN, 16));
        jComboBox1.setForeground(new Color(0, 51, 153)); // Dark blue text
        jComboBox1.setBackground(Color.WHITE);           // White background
        jComboBox1.setOpaque(true);                      // Keep solid background
       jComboBox1.setBorder(BorderFactory.createLineBorder(Color.WHITE)); // Simple white border
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
        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME MEMBER USER");

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("ACTION BUTTON PRESSED TO PERFORM:");

        jButton4.setText("ADD DETAILS ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("RANK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("BAR GRAPH");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("LINE GRAPH ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("REFRESH TABLE ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("DELETE DETAILS ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));

        jTextField2.setText("PRODUCT NAME");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });

        jTextField3.setText("UNITS SOLD PER DAY");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("FILL IN THE FORM");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel6.setBackground(new java.awt.Color(0, 51, 153));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Simple Linear Regression Prediction");

        jTextField4.setText("Previous Day unit Sold ");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField5.setText("Current Day Sold ");
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jButton10.setText("PREDICT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextField6.setText("Product Name");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(543, 543, 543)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("TOOLS", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("MABUHAY, WELCOME TO THE MEMBER DASHBOARD!");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product", "CATEGORY", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setText("PRODUCT NAME");

        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PRODUCT LOGS", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, Short.MAX_VALUE))
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

    
        record.clear(); // to ensure you're not saving leftover data

        

        Login_Page Login_Page = new Login_Page();
        Login_Page.setVisible(true);
        dispose(); // Hides the Admin panel

// Define the correct filepath
        String FilePlace = "src\\data2.json"; // Update with your correct file path
        System.out.println("[DEBUG] File path set to: " + FilePlace);

        JSONParser jsonParser = new JSONParser();
        JSONArray userlist = new JSONArray();

        try (FileReader reader = new FileReader(FilePlace)) {
            System.out.println("[DEBUG] File opened successfully.");

            // Parse the JSON file
            JSONObject data = (JSONObject) jsonParser.parse(reader);
            System.out.println("[DEBUG] JSON file parsed successfully.");

            userlist = (JSONArray) data.get("users");
            System.out.println("[DEBUG] User list loaded. Total users: " + userlist.size());

            // Iterate and print each user
            if (userlist != null && !userlist.isEmpty()) {
                JSONObject lastUser = (JSONObject) userlist.get(userlist.size() - 1); // Access the last element
                System.out.println("[DEBUG] Last user entry fetched.");

                // Get current date and time
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String formattedDateTime = currentDateTime.format(formatter);

                // Extract fields like username and type
                String type = (String) lastUser.get("type");
                String userName = (String) lastUser.get("username");
                String Logout = "LOGOUT";

                // Print the last entry fields
                System.out.println("[DEBUG] Last Entry:");
                System.out.println("         Type: " + type);
                System.out.println("         Username: " + userName);
                System.out.println("         Status: " + Logout);

                // Create new user object
                JSONObject user = new JSONObject();
                user.put("Login", formattedDateTime);
                user.put("type", type);
                user.put("username", userName);
                user.put("Current", Logout); // Store date & time

                System.out.println("[DEBUG] New logout record created for user: " + userName);

                // Add the new user to the existing list
                userlist.add(user);
                record.put("users", userlist); // Ensure users are updated in the record

                System.out.println("[DEBUG] User list updated. New size: " + userlist.size());

                save2(); // Save the updated JSON file
                System.out.println("[DEBUG] Changes saved to file.");

                JOptionPane.showMessageDialog(null, "Successfully recorded, username and loginout time!", "Success", JOptionPane.INFORMATION_MESSAGE);

            } else {
                System.out.println("[WARNING] No users found in the JSON file.");
            }

        } catch (Exception e) {
            System.out.println("[ERROR] An error occurred: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       refreshTable(); // Call the refresh method
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        uploadDataToTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            addWeeklySale();  // This will execute your addWeeklySale method
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding weekly sale: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        printSortedProductsBySales();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         showSalesChart();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        showSalesTrendChart();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        refreshTable2();
        System.out.println("Table refreshed successfully!");
        JOptionPane.showMessageDialog(null, "Successfully Refrehsed Tthe table", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     // Get the product name from the text field
        String productName = jTextField2.getText().trim();

        if (productName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a product name to delete.", "No Product Entered", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Ask for confirmation before deleting
        int confirmation = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete the sales data for product: " + productName + "?",
                "Confirm Deletion", JOptionPane.YES_NO_OPTION);

        if (confirmation == JOptionPane.YES_OPTION) {
            try {
                // Load the current sales data from the JSON file
                JSONObject salesData = loadJson();

                // Flag to check if product was found and deleted
                boolean productFound = false;

                // Iterate through each day and remove the product's sales data
                String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

                for (String day : days) {
                    Object dayData = salesData.get(day);
                    if (dayData instanceof JSONArray) {
                        JSONArray daySales = (JSONArray) dayData;
                        for (int i = 0; i < daySales.size(); i++) {
                            JSONObject sale = (JSONObject) daySales.get(i);
                            if (sale.get("Product").equals(productName)) {
                                // Remove the sale entry for the product
                                daySales.remove(i);
                                productFound = true;
                                break;
                            }
                        }
                    }
                }

                if (!productFound) {
                    JOptionPane.showMessageDialog(null, "Product not found in sales data.", "Product Not Found", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Save the updated sales data back to the file
                FileWriter writer = new FileWriter(filepath);
                writer.write(salesData.toJSONString());
                writer.flush();
                writer.close();

                // Refresh the table with the updated data
                loadSalesDataIntoTable();

                JOptionPane.showMessageDialog(null, "Successfully deleted sales data for " + productName + "!", "Deletion Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error deleting sales data: " + e.getMessage(), "Deletion Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setText(""); // Clear username field
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
         jTextField3.setText(""); // Clear username field
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField4.setText(""); // Clear username field
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
         jTextField5.setText(""); // Clear username field
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      try {
            String productName = jTextField6.getText();
            double month1Sales = Double.parseDouble(jTextField4.getText());
            double month2Sales = Double.parseDouble(jTextField5.getText());

            // Perform Linear Regression
            SimpleRegression regression = new SimpleRegression();
            regression.addData(1, month1Sales);
            regression.addData(2, month2Sales);
            double predictedSales = regression.predict(3);

            // Prepare data for graph
            XYSeries series = new XYSeries("Sales Data");
            series.add(1, month1Sales);
            series.add(2, month2Sales);
            series.add(3, predictedSales); // prediction

            XYSeriesCollection dataset = new XYSeriesCollection(series);

            // Create Line Chart
            JFreeChart chart = ChartFactory.createXYLineChart(
                    "Sales Prediction for " + productName,
                    "Day",
                    "Sales",
                    dataset
            );

            // Set background to black and axis to white
            chart.setBackgroundPaint(Color.BLACK); // Entire chart background
            chart.getPlot().setBackgroundPaint(Color.BLACK); // Plot area
            chart.getPlot().setOutlinePaint(Color.WHITE); // Outline

            chart.getTitle().setPaint(Color.WHITE); // Set the title text color to white

            XYPlot plot = chart.getXYPlot();
            plot.getDomainAxis().setTickLabelPaint(Color.WHITE); // X-axis numbers
            plot.getRangeAxis().setTickLabelPaint(Color.WHITE); // Y-axis numbers
            plot.getDomainAxis().setLabelPaint(Color.WHITE); // X-axis label
            plot.getRangeAxis().setLabelPaint(Color.WHITE); // Y-axis label
            plot.setDomainGridlinePaint(Color.GRAY); // Gridlines
            plot.setRangeGridlinePaint(Color.GRAY);

            // Create a ChartPanel for displaying the chart inside a JFrame
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new java.awt.Dimension(500, 400));

            // Create a new JFrame to display the chart in a new window/tab
            JFrame chartFrame = new JFrame("Sales Prediction Chart");
            chartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close the window when done
            chartFrame.getContentPane().add(chartPanel); // Add the chart to the frame
            chartFrame.pack(); // Fit the frame to the content
            chartFrame.setVisible(true); // Show the chart frame

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numbers for month 1 and month 2 sales.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "An error occurred: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
    
    
    private void refreshTable2() {
    loadSalesDataIntoTable(); // Simply call the existing method to refresh the table
}
    
    
     private void addWeeklySale() throws ParseException {
    try {
        filecheck(); // Make sure file and JSON structure are ready

        // Get user input from GUI
        String productName = jTextField2.getText().trim();
        String salesInput = jTextField3.getText().trim();
        String selectedDay = jComboBox1.getSelectedItem().toString();

        // Input validation
        if (productName.isEmpty() || salesInput.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter both product name and sales amount.", "Missing Input", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double saleAmount = Double.parseDouble(salesInput); // convert string to number

        // Load current sales data
        JSONObject salesData = loadJson(); // ✅ returns org.json.simple.JSONObject
        JSONArray daySalesList;

        // Check if data for selected day exists
        Object existingData = salesData.get(selectedDay);

        if (existingData instanceof JSONArray) {
            daySalesList = (JSONArray) existingData;
        } else {
            daySalesList = new JSONArray(); // Create a new array if none exists
        }

        // Create new sale object
        JSONObject newSale = new JSONObject();
        newSale.put("Product", productName);
        newSale.put("Sales", saleAmount);

        // Add the new sale to the array
        daySalesList.add(newSale);

        // Put updated array back into the sales data
        salesData.put(selectedDay, daySalesList);

        // Save updated data to file
        FileWriter writer = new FileWriter(filepath);
        writer.write(salesData.toJSONString()); // use toJSONString() in json.simple
        writer.flush();
        writer.close();

        JOptionPane.showMessageDialog(null, "Successfully added sale for " + selectedDay + "!", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Reset form fields
        jTextField1.setText("");
        jTextField2.setText("");

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter a valid number for sales.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error saving data: " + ex.getMessage(), "Save Error", JOptionPane.ERROR_MESSAGE);
    }
}

     
     
private void printSortedProductsBySales() {
    try {
        JSONObject salesData = loadJson(); // Load sales data from JSON
        Map<String, Double> productSales = new HashMap<>(); // Map to hold the total sales for each product

        // List of days in the week
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Loop through the days of the week and calculate total sales per product
        for (String day : days) {
            if (salesData.containsKey(day)) {
                JSONArray daySales = (JSONArray) salesData.get(day);

                for (Object obj : daySales) {
                    JSONObject sale = (JSONObject) obj;
                    String productName = (String) sale.get("Product");
                    Object salesValue = sale.get("Sales");

                    // Accumulate total sales for each product
                    if (salesValue instanceof Number) {
                        double salesAmount = ((Number) salesValue).doubleValue();
                        productSales.put(productName, productSales.getOrDefault(productName, 0.0) + salesAmount);
                    } else {
                        try {
                            double salesAmount = Double.parseDouble(salesValue.toString());
                            productSales.put(productName, productSales.getOrDefault(productName, 0.0) + salesAmount);
                        } catch (NumberFormatException e) {
                            // Ignore invalid sales data
                        }
                    }
                }
            }
        }

        // Sort products by total sales in descending order
        List<Map.Entry<String, Double>> sortedProductSales = new ArrayList<>(productSales.entrySet());
        sortedProductSales.sort((entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue()));

        // Prepare the sales summary for the dialog
        StringBuilder salesSummary = new StringBuilder("Products Sorted by Sales (Highest to Lowest):\n");

        int rank = 1;
        for (Map.Entry<String, Double> entry : sortedProductSales) {
            salesSummary.append(rank).append(". ").append(entry.getKey())
                    .append(": ₱").append(String.format("%.2f", entry.getValue())).append("\n");
            rank++;
        }

        // Add rank data to the JSON object
        JSONArray rankData = new JSONArray();
        rank = 1;
        for (Map.Entry<String, Double> entry : sortedProductSales) {
            JSONObject rankObject = new JSONObject();
            rankObject.put("Product", entry.getKey());
            rankObject.put("Sales", entry.getValue());
            rankObject.put("Rank", rank);
            rankData.add(rankObject);
            rank++;
        }

        // Add the rank data to the original sales data
        salesData.put("Rank", rankData);

        // Save the updated JSON back to the file
        try (FileWriter file = new FileWriter(filepath)) {
            file.write(salesData.toJSONString());
            file.flush();
        }

        // Show the result in a dialog
        JOptionPane.showMessageDialog(null, salesSummary.toString(), "Sorted Products by Sales", JOptionPane.INFORMATION_MESSAGE);

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to calculate and sort sales: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    


     private void showSalesChart() {
        try {
            // Load your JSON data (replace with your actual file loading method)
            JSONObject jsonData = loadJson(); // You already have this method

            JSONArray rankArray = (JSONArray) jsonData.get("Rank");

            // Create the dataset for the bar chart
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            for (Object obj : rankArray) {
                JSONObject product = (JSONObject) obj;
                String productName = (String) product.get("Product");
                double totalSales = ((Number) product.get("Sales")).doubleValue();

                dataset.setValue(totalSales, "Sales", productName);
            }

            // Create the chart
            JFreeChart chart = ChartFactory.createBarChart(
                    "Total Sales by Product (Ranked)",
                    "Product",
                    "Sales (₱)",
                    dataset
            );

            // Display in a ChartFrame
            ChartFrame frame = new ChartFrame("Product Sales Chart", chart);
            frame.setSize(600, 400);
            frame.setVisible(true);

            // Set background to black and axis to white
            chart.setBackgroundPaint(Color.BLACK); // Entire chart background
            chart.getPlot().setBackgroundPaint(Color.BLACK); // Plot area
            chart.getPlot().setOutlinePaint(Color.WHITE); // Outline

            chart.getTitle().setPaint(Color.WHITE); // Set the title text color to white

            // Get the plot to customize the axes
            CategoryPlot plot = chart.getCategoryPlot();

            // Set X-axis (Domain) and Y-axis (Range) labels and tick labels to white
            plot.getDomainAxis().setLabelPaint(Color.WHITE);  // X-axis label color
            plot.getRangeAxis().setLabelPaint(Color.WHITE);   // Y-axis label color
            plot.getDomainAxis().setTickLabelPaint(Color.WHITE);  // X-axis tick label color
            plot.getRangeAxis().setTickLabelPaint(Color.WHITE);   // Y-axis tick label color

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to load chart: " + e.getMessage());
            e.printStackTrace();
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
        FileWriter file = new FileWriter("src\\leaderboard.json");
        file.write(record.toJSONString());
        file.close();
    }
    
    
      public static void save2() throws IOException {
        FileWriter file = new FileWriter("src\\data2.json");
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

    public void loadJsonToTable() {
        String filePath = "src\\data2.json"; // Update with correct path

        try (FileReader reader = new FileReader(filePath)) {
            JSONParser jsonParser = new JSONParser();
            JSONObject data = (JSONObject) jsonParser.parse(reader);
            JSONArray users = (JSONArray) data.get("users");

            // ✅ Get table model for jTable1
            DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();

            // ✅ Clear existing rows in jTable1
            model1.setRowCount(0);

            // ✅ Iterate through JSON array and add rows
            for (Object obj : users) {
                JSONObject user = (JSONObject) obj;

                // ✅ Extract relevant fields
                String product = (String) user.get("Product");
               
                String condition1 = (String) user.get("Condition");
              
                String status1 = (String) user.get("Status");

                // ✅ Add row to jTable1
                model1.addRow(new Object[]{product,  condition1, status1});
            }
            
          
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void refreshTable() {
        String filePath = "src\\data2.json"; // Adjust to your actual JSON file path
        System.out.println("Refreshing table. Loading data from: " + filePath);

        try (FileReader reader = new FileReader(filePath)) {
            JSONParser jsonParser = new JSONParser();
            JSONObject data = (JSONObject) jsonParser.parse(reader);
            JSONArray users = (JSONArray) data.get("users");

            // ✅ Debug: Check if users array is empty
            if (users.isEmpty()) {
                System.out.println("No records found in JSON file.");
                JOptionPane.showMessageDialog(null, "No records found!", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            // ✅ Get table model for jTable1
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // ✅ Clear existing rows
            model.setRowCount(0);
            System.out.println("Cleared existing rows in JTable.");

            // ✅ Iterate through JSON array and add rows
            for (Object obj : users) {
                JSONObject user = (JSONObject) obj;

                String product = (String) user.get("Product");
               
                String condition1 = (String) user.get("Condition");
              
                String status1 = (String) user.get("Status");

                // ✅ Check if any value is null (to avoid adding invalid rows)
                if (product != null  && condition1 != null && status1 != null) {
                    model.addRow(new Object[]{product, condition1, status1});
                    System.out.println("✔ Added row to JTable.");
                } else {
                    System.out.println("⚠ Skipping row due to missing values: " + user.toJSONString());
                }
            }

            System.out.println("✅ Table refreshed successfully!");
            JOptionPane.showMessageDialog(null, "Successfully refreshed the table", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   public void uploadDataToTable() {
    String filePath = "src\\data2.json"; // Update with correct path
    System.out.println("Loading data from: " + filePath);

    try (FileReader reader = new FileReader(filePath)) {
        JSONParser jsonParser = new JSONParser();
        JSONObject data = (JSONObject) jsonParser.parse(reader);
        JSONArray users = (JSONArray) data.get("users");

        // ✅ Get table model for jTable1
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();

        // ✅ Clear existing rows in jTable1
        model1.setRowCount(0);

        // ✅ Ensure jTextField1 is not null before using it
        if (jTextField1 == null) {
            JOptionPane.showMessageDialog(null, "Error: Product field is NULL!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Stop execution if the text field is null
        }

        // ✅ Get the product name from JTextField (trim to avoid spaces)
        String inputProduct = jTextField1.getText().trim();
        System.out.println("Searching for product: " + inputProduct);

        // ✅ Ensure inputProduct is not empty
        if (inputProduct.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a product name!", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Stop execution if no input is provided
        }

        boolean productFound = false;

        // ✅ Iterate through JSON array and add matching rows
        for (Object obj : users) {
            JSONObject user = (JSONObject) obj;

            // ✅ Get values from JSON (Check if keys exist to avoid NullPointerException)
            String Product = (String) user.getOrDefault("Product", "");
            String condition1 = (String) user.getOrDefault("Condition", "N/A");
            String status1 = (String) user.getOrDefault("Status", "Unknown");

            // ✅ Debug print for each row
            System.out.println("Checking: " + Product);

            // ✅ Check if product matches JTextField input
            if (Product.equalsIgnoreCase(inputProduct)) {
                // ✅ Add row to jTable1
                model1.addRow(new Object[]{Product, condition1, status1});
                productFound = true; // Mark as found
                System.out.println("✅ Match found! Added to table.");
            }
        }

        // ✅ Show message if product is not found
        if (!productFound) {
            JOptionPane.showMessageDialog(null, "No matching product found!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("✅ Data successfully loaded into table!");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

   
   
    private void showSalesTrendChart() {
    try {
        JSONObject jsonData = loadJson(); // Load your JSON
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Days in order for graph
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Map to accumulate daily sales for each product
        Map<String, Map<String, Double>> productDailySales = new HashMap<>();

        for (String day : days) {
            JSONArray daySales = (JSONArray) jsonData.get(day);
            if (daySales != null) {
                for (Object obj : daySales) {
                    JSONObject sale = (JSONObject) obj;
                    String product = (String) sale.get("Product");
                    double sales = ((Number) sale.get("Sales")).doubleValue();

                    // Initialize inner map
                    productDailySales.putIfAbsent(product, new HashMap<>());
                    Map<String, Double> dailyMap = productDailySales.get(product);

                    // Set or add to current day
                    dailyMap.put(day, dailyMap.getOrDefault(day, 0.0) + sales);
                }
            }
        }

        // Now populate the dataset
        for (Map.Entry<String, Map<String, Double>> entry : productDailySales.entrySet()) {
            String product = entry.getKey();
            Map<String, Double> dailyMap = entry.getValue();

            for (String day : days) {
                double sale = dailyMap.getOrDefault(day, 0.0);
                dataset.addValue(sale, product, day);
            }
        }

        // Create the line chart
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Sales Trend Per Day",
                "Day",
                "Sales (₱)",
                dataset
        );

        ChartFrame frame = new ChartFrame("Rise and Fall Sales Chart", lineChart);
        frame.setSize(700, 500);
        frame.setVisible(true);
        
           // Set the background color for the chart and the plot area to black
        lineChart.setBackgroundPaint(Color.BLACK); // Entire chart background
        lineChart.getPlot().setBackgroundPaint(Color.BLACK); // Plot area background
        
         // Set the title color to white
        lineChart.getTitle().setPaint(Color.WHITE); // Set the title text color to white

        
        
        // Set the axis labels and gridlines colors to make them visible on a dark background
        lineChart.getCategoryPlot().getDomainAxis().setLabelPaint(Color.WHITE);  // X-axis label color
        lineChart.getCategoryPlot().getRangeAxis().setLabelPaint(Color.WHITE);   // Y-axis label color
        lineChart.getCategoryPlot().getDomainAxis().setTickLabelPaint(Color.WHITE);  // X-axis tick label color
        lineChart.getCategoryPlot().getRangeAxis().setTickLabelPaint(Color.WHITE);   // Y-axis tick label color
        lineChart.getCategoryPlot().setDomainGridlinePaint(Color.GRAY);  // X-axis gridline color
        lineChart.getCategoryPlot().setRangeGridlinePaint(Color.GRAY);   // Y-axis gridline color
        
        

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to load sales trend chart: " + e.getMessage());
    }
}

    
    
    
    private void loadSalesDataIntoTable() {
    try {
        JSONObject salesData = loadJson(); // Load sales data from the updated JSON file
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        
        // Clear the previous data in the table (remove old rows)
        model.setRowCount(0); 

        // Ensure columns are only added once
        if (model.getColumnCount() == 0) {
            model.addColumn("Rank");
            model.addColumn("Product Name");
            model.addColumn("Monday");
            model.addColumn("Tuesday");
            model.addColumn("Wednesday");
            model.addColumn("Thursday");
            model.addColumn("Friday");
            model.addColumn("Saturday");
            model.addColumn("Sunday");
            model.addColumn("Total");
        }

        // List of days in the week
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        // Map to store the sales data for each product across all days
        Map<String, Double[]> productSales = new HashMap<>();

        // Iterate through each day of the week and collect sales data
        for (String day : days) {
            Object dayData = salesData.get(day); // Get sales data for each day

            if (dayData instanceof JSONArray) {
                JSONArray daySales = (JSONArray) dayData;

                // Iterate through the sales data for each product on the given day
                for (Object saleObj : daySales) {
                    JSONObject sale = (JSONObject) saleObj;
                    String productName = (String) sale.get("Product");
                    double salesAmount = ((Number) sale.get("Sales")).doubleValue();

                    // Initialize product entry if it doesn't exist
                    if (!productSales.containsKey(productName)) {
                        productSales.put(productName, new Double[7]); // Array to hold sales for each day (7 days)
                    }

                    // Find the index for the current day (0 for Monday, 1 for Tuesday, etc.)
                    int dayIndex = Arrays.asList(days).indexOf(day);
                    Double[] salesArray = productSales.get(productName);
                    salesArray[dayIndex] = (salesArray[dayIndex] == null ? 0 : salesArray[dayIndex]) + salesAmount; // Add sales to the day
                }
            }
        }

        // Calculate total sales for each product and sort by total sales
        Map<String, Double> productTotalSales = new HashMap<>();
        for (Map.Entry<String, Double[]> entry : productSales.entrySet()) {
            String productName = entry.getKey();
            Double[] salesArray = entry.getValue();
            double totalSales = 0;
            for (Double sales : salesArray) {
                totalSales += (sales == null ? 0 : sales);
            }
            productTotalSales.put(productName, totalSales);
        }

        // Sort products by total sales in descending order
        List<Map.Entry<String, Double>> sortedProductSales = new ArrayList<>(productTotalSales.entrySet());
        sortedProductSales.sort((entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue()));

        // Prepare the table rows
        int rank = 1;
        for (Map.Entry<String, Double> entry : sortedProductSales) {
            String productName = entry.getKey();
            Double[] salesArray = productSales.get(productName);

            // Calculate the total sales for the product
            double totalSales = 0;
            for (Double sales : salesArray) {
                totalSales += (sales == null ? 0 : sales);
            }

            // Create row data for the JTable
            Object[] rowData = new Object[10]; // 10 columns: rank, product name, sales for each day, total
            rowData[0] = rank; // Rank
            rowData[1] = productName; // Product name

            // Add sales for each day of the week
            for (int i = 0; i < 7; i++) {
                rowData[i + 2] = salesArray[i] == null ? 0 : salesArray[i]; // Sales per day
            }

            rowData[9] = totalSales; // Total sales for the product

            model.addRow(rowData); // Add the row to the table

            rank++; // Increment rank
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading sales data: " + e.getMessage(), "Load Error", JOptionPane.ERROR_MESSAGE);
    }
}


    
    
   private JSONObject loadJson() {
    JSONObject data = new JSONObject(); // Create empty JSON object as fallback

    try {
        File file = new File(filepath); // Make sure 'filepath' is defined elsewhere

        if (!file.exists() || file.length() == 0) {
            return data; // Return empty object if file doesn't exist or is empty
        }

        // Read JSON text from the file
        FileReader reader = new FileReader(file);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(reader);

        if (obj instanceof JSONObject) {
            data = (JSONObject) obj;
        }

        reader.close();

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading JSON file: " + e.getMessage(), "Load Error", JOptionPane.ERROR_MESSAGE);
    }

    return data;
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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
