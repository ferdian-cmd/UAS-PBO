/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package percobaan9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.awt.CardLayout;
/**
 *
 * @author ferdian
 */
public class Pembelian extends javax.swing.JFrame {

    /**
     * Creates new form Pembelian
     */
    public Pembelian() {
        initComponents();
        loadCustomerNames(); // Load customer names into the combo box
        loadFlowerNames();   // Load flower names into the combo box
        setTanggalHariIni();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPembelian = new javax.swing.JTable();
        btnTambahBunga = new javax.swing.JButton();
        btnHapusBunga = new javax.swing.JButton();
        btnSimpanPembelian = new javax.swing.JButton();
        btnBatalPembelian = new javax.swing.JButton();
        spJumlahBunga = new javax.swing.JSpinner();
        CbBunga = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPesanan = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbNamaCustomer = new javax.swing.JComboBox<>();
        btnPrint = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("FRAME PEMBELIAN");

        jLabel3.setText("Nama Customer");

        jLabel4.setText("Tanggal pesanan");

        txtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalActionPerformed(evt);
            }
        });

        jLabel8.setText("Tabel pembelian");

        TblPembelian.setBackground(new java.awt.Color(102, 102, 255));
        TblPembelian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        TblPembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID Pesanan", "Nama Customer", "Harga"
            }
        ));
        jScrollPane1.setViewportView(TblPembelian);

        btnTambahBunga.setText("Tambah Bunga");
        btnTambahBunga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBungaActionPerformed(evt);
            }
        });

        btnHapusBunga.setText("Hapus Bunga");
        btnHapusBunga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusBungaActionPerformed(evt);
            }
        });

        btnSimpanPembelian.setText("Simpan Pembelian");
        btnSimpanPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanPembelianActionPerformed(evt);
            }
        });

        btnBatalPembelian.setText("Batal Pembelian");
        btnBatalPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalPembelianActionPerformed(evt);
            }
        });

        CbBunga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CbBunga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbBungaActionPerformed(evt);
            }
        });

        tblPesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID Pesanan", "Nama Customer", "Tanggal Pesanan", "Nama Bunga", "Jumlah Bunga", "Harga per Bunga", "Total Harga" // Nama kolom
            }
        ));
        jScrollPane2.setViewportView(tblPesanan);

        jLabel2.setText("jumlah");

        jLabel5.setText("Nama Bunga");

        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        jLabel9.setText("Total Harga");

        cbNamaCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNamaCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNamaCustomerActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnSimpanPembelian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBatalPembelian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(29, 29, 29)
                .addComponent(btnPrint)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(btnTambahBunga)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapusBunga))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(CbBunga, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spJumlahBunga, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbBunga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spJumlahBunga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahBunga)
                    .addComponent(btnHapusBunga))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanPembelian)
                    .addComponent(btnBatalPembelian)
                    .addComponent(btnPrint)
                    .addComponent(btnBack))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void btnTambahBungaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBungaActionPerformed
      String namaBunga = CbBunga.getSelectedItem().toString();
    int jumlah = (int) spJumlahBunga.getValue();

    try (Connection conn = KoneksiDB.getConnection()) {
        // Ambil harga bunga berdasarkan nama bunga
        String sql = "SELECT harga FROM Bunga WHERE nama_bunga = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, namaBunga);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            double harga = rs.getDouble("harga");
            double subtotal = harga * jumlah;

            // Masukkan data ke JTable
            DefaultTableModel model = (DefaultTableModel) tblPesanan.getModel();
            model.addRow(new Object[]{null, cbNamaCustomer.getSelectedItem().toString(), txtTanggal.getText(), namaBunga, jumlah, harga, subtotal});

            // Update total harga
            double totalHarga = Double.parseDouble(txtTotalHarga.getText().isEmpty() ? "0" : txtTotalHarga.getText());
            totalHarga += subtotal;
            txtTotalHarga.setText(String.valueOf(totalHarga));
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnTambahBungaActionPerformed

    private void btnHapusBungaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusBungaActionPerformed
        int selectedRow = tblPesanan.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tblPesanan.getModel();
            double subtotal = (double) model.getValueAt(selectedRow, 6);
            double totalHarga = Double.parseDouble(txtTotalHarga.getText());
            totalHarga -= subtotal;
            txtTotalHarga.setText(String.valueOf(totalHarga));
            model.removeRow(selectedRow);
        }
    }//GEN-LAST:event_btnHapusBungaActionPerformed

    private void btnSimpanPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanPembelianActionPerformed
       Connection conn = null;
    try {
        conn = KoneksiDB.getConnection();
        conn.setAutoCommit(false); // Nonaktifkan auto-commit untuk transaksi

        // 1. Simpan ke tabel Pesanan
        String sqlPesanan = "INSERT INTO Pesanan (customer_id, tanggal_pesanan, total_harga) VALUES ((SELECT customer_id FROM Customer WHERE nama = ?), ?, ?)";
        PreparedStatement psPesanan = conn.prepareStatement(sqlPesanan, Statement.RETURN_GENERATED_KEYS);
        psPesanan.setString(1, cbNamaCustomer.getSelectedItem().toString());
        psPesanan.setDate(2, java.sql.Date.valueOf(txtTanggal.getText())); // Pastikan txtTanggal diubah ke format Date SQL
        psPesanan.setDouble(3, Double.parseDouble(txtTotalHarga.getText()));

        psPesanan.executeUpdate();
        ResultSet rsPesanan = psPesanan.getGeneratedKeys();

        int pesananId = 0;
        if (rsPesanan.next()) {
            pesananId = rsPesanan.getInt(1); // Dapatkan pesanan_id yang dihasilkan
        }

        // 2. Simpan ke tabel Detail_Pesanan dan update stok
        String sqlDetailPesanan = "INSERT INTO Detail_Pesanan (pesanan_id, bunga_id, jumlah, subtotal) VALUES (?, (SELECT bunga_id FROM Bunga WHERE nama_bunga = ?), ?, ?)";
        PreparedStatement psDetailPesanan = conn.prepareStatement(sqlDetailPesanan);

        String sqlUpdateStok = "UPDATE Bunga SET stok = stok - ? WHERE bunga_id = (SELECT bunga_id FROM Bunga WHERE nama_bunga = ?)";
        PreparedStatement psUpdateStok = conn.prepareStatement(sqlUpdateStok);

        DefaultTableModel model = (DefaultTableModel) tblPesanan.getModel(); // Mendapatkan model dari tabel pesanan
        for (int i = 0; i < model.getRowCount(); i++) {
            String namaBunga = model.getValueAt(i, 3).toString();
            int jumlah = Integer.parseInt(model.getValueAt(i, 4).toString());
            double subtotal = Double.parseDouble(model.getValueAt(i, 6).toString());

            // Simpan detail pesanan
            psDetailPesanan.setInt(1, pesananId);
            psDetailPesanan.setString(2, namaBunga);
            psDetailPesanan.setInt(3, jumlah);
            psDetailPesanan.setDouble(4, subtotal);
            psDetailPesanan.addBatch(); // Tambahkan ke batch untuk eksekusi batch

            // Update stok bunga
            psUpdateStok.setInt(1, jumlah);
            psUpdateStok.setString(2, namaBunga);
            psUpdateStok.addBatch(); // Tambahkan ke batch untuk eksekusi batch
        }

        psDetailPesanan.executeBatch(); // Jalankan eksekusi batch untuk detail pesanan
        psUpdateStok.executeBatch(); // Jalankan eksekusi batch untuk update stok

        // 3. Commit transaksi
        conn.commit();

        // 4. Tampilkan data ke dalam TblPembelian setelah disimpan ke database
        DefaultTableModel modelPembelian = (DefaultTableModel) TblPembelian.getModel(); // Model dari tabel pembelian

// Tambahkan data ke TblPembelian (hanya ID Pembelian, Nama Customer, dan Total Harga)
modelPembelian.addRow(new Object[]{pesananId, cbNamaCustomer.getSelectedItem().toString(), txtTotalHarga.getText()});

        JOptionPane.showMessageDialog(this, "Pesanan berhasil disimpan.", "Success", JOptionPane.INFORMATION_MESSAGE);

    } catch (SQLException e) {
        if (conn != null) {
            try {
                conn.rollback(); // Rollback jika ada kesalahan
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        }
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (conn != null) {
            try {
                conn.setAutoCommit(true); // Aktifkan kembali auto-commit
                conn.close(); // Tutup koneksi
            } catch (SQLException closeEx) {
                closeEx.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_btnSimpanPembelianActionPerformed

    private void btnBatalPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalPembelianActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblPesanan.getModel();
        model.setRowCount(0); // Clear all rows
        txtTanggal.setText("");
        cbNamaCustomer.setSelectedIndex(0);
        txtTotalHarga.setText("");
    }//GEN-LAST:event_btnBatalPembelianActionPerformed

    private void CbBungaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbBungaActionPerformed

    }//GEN-LAST:event_CbBungaActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void cbNamaCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNamaCustomerActionPerformed

    }//GEN-LAST:event_cbNamaCustomerActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
      try {
        // TODO add your handling code here:
        Connection conn = KoneksiDB.getConnection();
        
        // Query untuk mengambil data pesanan, detail pesanan, dan informasi lainnya
        String sql = "SELECT " +
                     "p.pesanan_id, " +
                     "c.nama AS nama_customer, " +
                     "b.nama_bunga, " +
                     "d.jumlah, " +
                     "d.subtotal, " +
                     "p.tanggal, " +
                     "p.total_harga " +
                     "FROM " +
                     "detail_pesanan d " +
                     "JOIN pesanan p ON d.pesanan_id = p.pesanan_id " +
                     "JOIN customer c ON p.customer_id = c.customer_id " +
                     "JOIN bunga b ON d.bunga_id = b.bunga_id";
        
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        // Menentukan lokasi file jasper report
        File alamat = new File(".");
        System.out.println(alamat.getCanonicalPath());
        File jasperFile = new File(alamat.getCanonicalPath() + "/src/percobaan9/" + "reportNota.jrxml");
        
        // Membuat JasperDesign dan mengisi data dengan ResultSet
        JasperDesign jd = JRXmlLoader.load(jasperFile);
        JRResultSetDataSource jds = new JRResultSetDataSource(rs);
        JasperReport jr = JasperCompileManager.compileReport(jd);
        
        // Mengisi laporan dan menampilkannya
        JasperPrint jp = (JasperPrint) JasperFillManager.fillReport(jr, new HashMap<String, Object>(), jds);
        JasperViewer viewer = new JasperViewer(jp, false);
        viewer.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        viewer.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(Pembelian.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Pembelian.class.getName()).log(Level.SEVERE, null, ex);
    } catch (JRException ex) {
        Logger.getLogger(Pembelian.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
   new Dashboard().setVisible(true);  // Membuka kelas Dashboard
    this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
  
    private void loadFlowerNames() {
        try (Connection conn = KoneksiDB.getConnection()) {
            String sql = "SELECT nama_bunga FROM Bunga"; // Sesuaikan query dengan yang Anda butuhkan
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            CbBunga.removeAllItems(); // Hapus item sebelumnya
            while (rs.next()) {
                String namaBunga = rs.getString("nama_bunga");
                CbBunga.addItem(namaBunga); // Tambahkan item ke combo box
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading flower names: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadCustomerNames() {
        try (Connection conn = KoneksiDB.getConnection()) {
            String sql = "SELECT nama FROM Customer"; // Sesuaikan query dengan yang Anda butuhkan
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            cbNamaCustomer.removeAllItems(); // Hapus item sebelumnya
            while (rs.next()) {
                String namaCustomer = rs.getString("nama");
                cbNamaCustomer.addItem(namaCustomer); // Tambahkan item ke combo box
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading customer names: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void setTanggalHariIni() {
    // Ambil tanggal hari ini
    LocalDate today = LocalDate.now();
    // Format tanggal ke dalam format yang sesuai (misalnya "yyyy-MM-dd")
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = today.format(formatter);

    // Set teks ke dalam txtTanggal
    txtTanggal.setText(formattedDate);
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
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbBunga;
    private javax.swing.JTable TblPembelian;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBatalPembelian;
    private javax.swing.JButton btnHapusBunga;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSimpanPembelian;
    private javax.swing.JButton btnTambahBunga;
    private javax.swing.JComboBox<String> cbNamaCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spJumlahBunga;
    private javax.swing.JTable tblPesanan;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}