/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Penjualan;

import Koneksi.connect;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author ANDIKA RISKY FAIZATAMA
 */
public class Penjualan extends javax.swing.JFrame {

    public ArrayList barcode = new ArrayList();
    public ArrayList tanggal = new ArrayList();
    public ArrayList nama = new ArrayList();
    public ArrayList satuan = new ArrayList();
    public ArrayList harga = new ArrayList();
    public ArrayList stok = new ArrayList();
    public ArrayList diskon = new ArrayList();
    public ArrayList total = new ArrayList();
    public ArrayList list = new ArrayList();
    public ArrayList terjual = new ArrayList();
    int h;
    int r;
    connect db;
    DefaultListModel Jlista;
    
    
    public Penjualan() {
        db = new connect();
        initComponents();
        setHeader();
        new Thread(){
            public void run(){
            while (true) {            
            Calendar kal = new GregorianCalendar();
            int tahun = kal.get(Calendar.YEAR);
            int bulan = kal.get(Calendar.MONTH)+1;
            int hari = kal.get(Calendar.DAY_OF_MONTH);
            int jam = kal.get(Calendar.HOUR_OF_DAY);
            int menit = kal.get(Calendar.MINUTE);
            int detik = kal.get(Calendar.SECOND);
            
            String tanggal = hari+"/"+bulan+"/"+tahun;
            String waktu = jam+":"+menit+":"+detik;
            
            txttanggal.setText(tanggal);
            txtjam.setText(waktu);
            }
        }
        }.start();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txttotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtjam = new javax.swing.JLabel();
        txtsisa = new javax.swing.JLabel();
        txtdiskon = new javax.swing.JLabel();
        txttanggal = new javax.swing.JLabel();
        txtbayar = new javax.swing.JTextField();
        txtsatuan = new com.toedter.components.JSpinField();
        txtsearch = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnToAdmin = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAddBarang = new javax.swing.JButton();
        btnBayar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKasir = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1350, 500));
        setPreferredSize(new java.awt.Dimension(1350, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttotal.setBackground(new java.awt.Color(255, 255, 255));
        txttotal.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txttotal.setForeground(new java.awt.Color(255, 255, 255));
        txttotal.setText("0");
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 490, 150, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL   : Rp.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, 150, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Diskon  : Rp.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 150, 30));

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BAYAR   : Rp.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 150, 30));

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SISA    : Rp.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 620, 150, 30));
        jLabel5.getAccessibleContext().setAccessibleName("Kembalian :");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 610, 350, 3));

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jam      :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 30));

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal  :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 140, 30));

        txtjam.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txtjam.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 140, 30));

        txtsisa.setBackground(new java.awt.Color(255, 255, 255));
        txtsisa.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txtsisa.setForeground(new java.awt.Color(255, 255, 255));
        txtsisa.setText("0");
        getContentPane().add(txtsisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 620, 150, 30));

        txtdiskon.setBackground(new java.awt.Color(255, 255, 255));
        txtdiskon.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txtdiskon.setForeground(new java.awt.Color(255, 255, 255));
        txtdiskon.setText("0");
        getContentPane().add(txtdiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 530, 150, 30));

        txttanggal.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txttanggal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 140, 30));

        txtbayar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txtbayar.setForeground(new java.awt.Color(255, 255, 255));
        txtbayar.setOpaque(false);
        txtbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbayarKeyTyped(evt);
            }
        });
        getContentPane().add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 570, 150, 30));

        txtsatuan.setOpaque(false);
        getContentPane().add(txtsatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 80, 40));

        txtsearch.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txtsearch.setForeground(new java.awt.Color(255, 255, 255));
        txtsearch.setOpaque(false);
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsearchKeyTyped(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 230, 40));

        btnNew.setContentAreaFilled(false);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 100, 40));

        btnDelete.setContentAreaFilled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 100, 40));

        btnToAdmin.setBackground(new java.awt.Color(58, 4, 58));
        btnToAdmin.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnToAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnToAdmin.setText("ADMIN");
        btnToAdmin.setContentAreaFilled(false);
        btnToAdmin.setOpaque(false);
        btnToAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnToAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 110, 40));

        btnUpdate.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setOpaque(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, 40));

        btnAddBarang.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnAddBarang.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBarang.setText("Tambah");
        btnAddBarang.setContentAreaFilled(false);
        btnAddBarang.setOpaque(false);
        btnAddBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBarangActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 110, 40));

        btnBayar.setBackground(new java.awt.Color(0, 0, 204));
        btnBayar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("BAYAR");
        btnBayar.setContentAreaFilled(false);
        btnBayar.setOpaque(false);
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 570, -1, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblKasir.setAutoCreateRowSorter(true);
        tblKasir.setBackground(new java.awt.Color(24, 0, 47));
        tblKasir.setForeground(new java.awt.Color(255, 255, 255));
        tblKasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kodebarang", "Tanggal", "NamaBarang", "Satuan", "Harga", "Stok", "Diskon", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKasir.setToolTipText("");
        tblKasir.setAlignmentX(0.0F);
        tblKasir.setAlignmentY(0.0F);
        tblKasir.setColumnSelectionAllowed(true);
        tblKasir.setDragEnabled(true);
        tblKasir.setEditingColumn(1);
        tblKasir.setGridColor(new java.awt.Color(255, 255, 255));
        tblKasir.setOpaque(false);
        tblKasir.setPreferredSize(new java.awt.Dimension(1235, 510));
        tblKasir.setRowHeight(30);
        tblKasir.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblKasir.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblKasir.setShowGrid(false);
        tblKasir.setSurrendersFocusOnKeystroke(true);
        tblKasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKasirMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKasir);
        tblKasir.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (tblKasir.getColumnModel().getColumnCount() > 0) {
            tblKasir.getColumnModel().getColumn(0).setResizable(false);
            tblKasir.getColumnModel().getColumn(0).setPreferredWidth(160);
            tblKasir.getColumnModel().getColumn(1).setResizable(false);
            tblKasir.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblKasir.getColumnModel().getColumn(2).setResizable(false);
            tblKasir.getColumnModel().getColumn(2).setPreferredWidth(315);
            tblKasir.getColumnModel().getColumn(3).setResizable(false);
            tblKasir.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblKasir.getColumnModel().getColumn(4).setResizable(false);
            tblKasir.getColumnModel().getColumn(4).setPreferredWidth(170);
            tblKasir.getColumnModel().getColumn(5).setResizable(false);
            tblKasir.getColumnModel().getColumn(5).setPreferredWidth(80);
            tblKasir.getColumnModel().getColumn(6).setResizable(false);
            tblKasir.getColumnModel().getColumn(6).setPreferredWidth(110);
            tblKasir.getColumnModel().getColumn(7).setResizable(false);
            tblKasir.getColumnModel().getColumn(7).setPreferredWidth(150);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 107, 1250, 300));

        jScrollPane2.setOpaque(false);

        jList1.setOpaque(false);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 230, 50));

        Background.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/n1.png"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Background.setMinimumSize(new java.awt.Dimension(960, 680));
        Background.setPreferredSize(new java.awt.Dimension(1350, 900));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1350, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        barcode.clear();
        tanggal.clear();
        nama.clear(); 
        satuan.clear();
        harga.clear();
        stok.clear();
        diskon.clear();
        total.clear();
        txtbayar.setText("");
        txtsisa.setText("0");
        setTable();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnToAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToAdminActionPerformed
        new Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnToAdminActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        int t = Integer.parseInt(txttotal.getText());
        int d = Integer.parseInt(txtdiskon.getText());
        int b = Integer.parseInt(txtbayar.getText());
        int s = b-t-d;
        txtsisa.setText(Integer.toString(s));
        setBarang();
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnAddBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBarangActionPerformed
        if(txtsearch.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Masukan Barcode atau Nama Barang");
        }
        else{
            addKasir();
            setTable();
            txtsearch.setText("");
            Jlista.removeAllElements();
            jList1.setModel(Jlista);
        }
        
    }//GEN-LAST:event_btnAddBarangActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tblKasir.getSelectedRow();
        barcode.remove(row);
        tanggal.remove(row);
        nama.remove(row); 
        satuan.remove(row);
        harga.remove(row);
        stok.remove(row);
        diskon.remove(row);
        total.remove(row);
        setTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblKasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKasirMouseClicked
        r = tblKasir.getSelectedRow();
        txtsatuan.setValue((int) satuan.get(r));
    }//GEN-LAST:event_tblKasirMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int t = txtsatuan.getValue() * (int) harga.get(r);
        Object set = total.set(r,t);
        Object set1 = satuan.set(r, txtsatuan.getValue());
        setTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped
        try {
            ResultSet rs;
            rs = db.searchDB(txtsearch.getText());
            while(rs.next()){
                    list.add(rs.getString("nama"));
            }
        } catch (SQLException ex) {
            System.out.println("tidak menemukan"+ex);
        }
        Jlista = new DefaultListModel();
        for (int i = 0; i < list.size(); i++) {
            Jlista.addElement(list.get(i));
        }
        jList1.setModel(Jlista);
        list.clear();
    }//GEN-LAST:event_txtsearchKeyTyped

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        txtsearch.setText(jList1.getSelectedValue());
    }//GEN-LAST:event_jList1MouseClicked

    private void txtbayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbayarKeyTyped
        char key = evt.getKeyChar();
        if(key == KeyEvent.VK_ENTER){
            int t = Integer.parseInt(txttotal.getText());
            int d = Integer.parseInt(txtdiskon.getText());
            int b = Integer.parseInt(txtbayar.getText());
            int s = b-t-d;
            txtsisa.setText(Integer.toString(s));
            setBarang();
        }
    }//GEN-LAST:event_txtbayarKeyTyped
    
    private void setBarang(){
        for(int i = 0 ;i<satuan.size();i++){
            int x,y;
            String z;
            x = (int)stok.get(i)- (int)satuan.get(i);
            y = (int)terjual.get(i)+ (int)satuan.get(i);
            z = (String) barcode.get(i);
            db.updateStok(x,y,z);
        }
    }
    private void setHeader(){
        tblKasir.setOpaque(false);
        ((DefaultTableCellRenderer) tblKasir.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        JTableHeader header = tblKasir.getTableHeader();
        header.setPreferredSize(new Dimension(20,50));
        header.setOpaque(false);
        header.setBackground(Color.WHITE);
        header.setFont(new Font("Courier new", Font.BOLD,18));
    }
    private void setTable(){
        int t = 0;
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode Barang");
        tbl.addColumn("Tanggal");
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Satuan");
        tbl.addColumn("Harga");
        tbl.addColumn("Stok");
        tbl.addColumn("Diskon");
        tbl.addColumn("Total");
        for (int n=0; n<barcode.size(); n++){
            t += Integer.parseInt(total.get(n).toString());
            tbl.addRow(new Object[]{
                barcode.get(n),
                tanggal.get(n),
                nama.get(n), 
                satuan.get(n),
                harga.get(n),
                stok.get(n),
                diskon.get(n),
                total.get(n)
            });
        }
        int d = t/100000*5000;
        txttotal.setText(Integer.toString(t));
        txtdiskon.setText(Integer.toString(d));
        tblKasir.setModel(tbl);
        if (tblKasir.getColumnModel().getColumnCount() > 0) {
            tblKasir.getColumnModel().getColumn(0).setResizable(false);
            tblKasir.getColumnModel().getColumn(0).setPreferredWidth(160);
            tblKasir.getColumnModel().getColumn(1).setResizable(false);
            tblKasir.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblKasir.getColumnModel().getColumn(2).setResizable(false);
            tblKasir.getColumnModel().getColumn(2).setPreferredWidth(315);
            tblKasir.getColumnModel().getColumn(3).setResizable(false);
            tblKasir.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblKasir.getColumnModel().getColumn(4).setResizable(false);
            tblKasir.getColumnModel().getColumn(4).setPreferredWidth(170);
            tblKasir.getColumnModel().getColumn(5).setResizable(false);
            tblKasir.getColumnModel().getColumn(5).setPreferredWidth(80);
            tblKasir.getColumnModel().getColumn(6).setResizable(false);
            tblKasir.getColumnModel().getColumn(6).setPreferredWidth(110);
            tblKasir.getColumnModel().getColumn(7).setResizable(false);
            tblKasir.getColumnModel().getColumn(7).setPreferredWidth(150);
        }
    }
    private void addKasir(){
        try {
            ResultSet rs;
            rs = db.searchDB(txtsearch.getText());
            while(rs.next()){
                    barcode.add(rs.getString("Barcode"));
                    tanggal.add(txttanggal.getText());
                    nama.add(rs.getString("Nama"));
                    satuan.add(txtsatuan.getValue());
                    harga.add(rs.getInt("Harga"));
                    stok.add(rs.getInt("Stok"));
                    diskon.add("-");
                    total.add(rs.getInt("harga")*txtsatuan.getValue());
                    terjual.add(rs.getInt("terjual"));       
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Terjadi Eror pada"+ex);
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnAddBarang;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnToAdmin;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblKasir;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JLabel txtdiskon;
    private javax.swing.JLabel txtjam;
    private com.toedter.components.JSpinField txtsatuan;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JLabel txtsisa;
    private javax.swing.JLabel txttanggal;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables
}
