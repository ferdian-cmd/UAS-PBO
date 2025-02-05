/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package percobaan9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ferdian
 */
public class FrameCustomer extends javax.swing.JFrame {

    /**
     * Creates new form FrameCustomer
     */
    public FrameCustomer() {
        initComponents();
        loadCustomerData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCustomer = new javax.swing.JTable();
        txtNamaCustomer = new javax.swing.JTextField();
        txtEmailCustomer = new javax.swing.JTextField();
        txtNoTeleponCustomer = new javax.swing.JTextField();
        txtAlamatCustomer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtID_Pelangan = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("FRAME CUSTOMER");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        TblCustomer.setBackground(new java.awt.Color(102, 102, 255));
        TblCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        TblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Customer ID", "Nama", "Email", "No Telepon", "Alamat"
            }
        ));
        TblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblCustomer);

        txtNamaCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaCustomerActionPerformed(evt);
            }
        });

        txtEmailCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCustomerActionPerformed(evt);
            }
        });

        txtNoTeleponCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoTeleponCustomerActionPerformed(evt);
            }
        });

        txtAlamatCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatCustomerActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama");

        jLabel3.setText("Email");

        jLabel4.setText("No Tel");

        jLabel5.setText("Alamat");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel6.setText("ID pelanggan");

        txtID_Pelangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_PelanganActionPerformed(evt);
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
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCari))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(173, 173, 173)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID_Pelangan)
                                    .addComponent(txtEmailCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                                    .addComponent(txtNamaCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                                    .addComponent(txtNoTeleponCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                                    .addComponent(txtAlamatCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(49, 49, 49)
                        .addComponent(btnNext)
                        .addGap(17, 17, 17))))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtID_Pelangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoTeleponCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlamatCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
    String id = txtID_Pelangan.getText();
    String nama = txtNamaCustomer.getText();
    String email = txtEmailCustomer.getText();
    String noTelepon = txtNoTeleponCustomer.getText();
    String alamat = txtAlamatCustomer.getText();

    // Koneksi dan eksekusi query
    Connection conn = null;
    PreparedStatement pstmt = null;
    try {
        conn = KoneksiDB.getConnection();
        String sql = "INSERT INTO customer (customer_id, nama, email, no_telepon, alamat) VALUES (?, ?, ?, ?, ?)";
pstmt = conn.prepareStatement(sql);
pstmt.setInt(1, Integer.parseInt(txtID_Pelangan.getText())); // ID pelanggan manual
pstmt.setString(2, txtNamaCustomer.getText());
pstmt.setString(3, txtEmailCustomer.getText());
pstmt.setString(4, txtNoTeleponCustomer.getText());
pstmt.setString(5, txtAlamatCustomer.getText());
pstmt.executeUpdate();

        // Refresh tabel
        loadCustomerData();

        // Kosongkan text field
        clearFields();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtEmailCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCustomerActionPerformed

    private void txtNamaCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaCustomerActionPerformed

    private void txtNoTeleponCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoTeleponCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoTeleponCustomerActionPerformed

    private void txtAlamatCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatCustomerActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectedRow = TblCustomer.getSelectedRow();
    if (selectedRow != -1) {
        // Ambil Customer ID dari text field (bukan dari tabel jika ID diinput manual)
        String customerId = txtID_Pelangan.getText(); // Mengambil ID dari text field

        // Ambil data lainnya
        String nama = txtNamaCustomer.getText();
        String email = txtEmailCustomer.getText();
        String noTelepon = txtNoTeleponCustomer.getText();
        String alamat = txtAlamatCustomer.getText();

        // Validasi input
        if (customerId.isEmpty() || nama.isEmpty() || email.isEmpty() || noTelepon.isEmpty() || alamat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi.");
            return; // Hentikan eksekusi jika ada field kosong
        }

        // Koneksi dan eksekusi query
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = KoneksiDB.getConnection();
            String sql = "UPDATE Customer SET nama = ?, email = ?, no_telepon = ?, alamat = ? WHERE customer_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nama);
            pstmt.setString(2, email);
            pstmt.setString(3, noTelepon);
            pstmt.setString(4, alamat);
            pstmt.setString(5, customerId); // Gunakan setString untuk ID jika berbentuk String

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                // Refresh tabel
                loadCustomerData();
                clearFields();
                JOptionPane.showMessageDialog(this, "Data customer berhasil diperbarui.");
            } else {
                JOptionPane.showMessageDialog(this, "Gagal memperbarui data customer. Pastikan ID customer valid.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error saat mengedit data: " + e.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih customer yang ingin diedit.");
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // Mendapatkan baris yang dipilih
        int selectedRow = TblCustomer.getSelectedRow();
        if (selectedRow != -1) {
            int customerId = (int) TblCustomer.getValueAt(selectedRow, 0); // Ambil Customer ID

            // Koneksi dan eksekusi query
            Connection conn = null;
            PreparedStatement pstmt = null;
            try {
                conn = KoneksiDB.getConnection();
                String sql = "DELETE FROM Customer WHERE customer_id = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, customerId);
                pstmt.executeUpdate();

                // Refresh tabel
                loadCustomerData();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (pstmt != null) {
                        pstmt.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String keyword = txtNamaCustomer.getText(); // Ambil dari field nama

        // Koneksi dan eksekusi query
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = KoneksiDB.getConnection();
            String sql = "SELECT * FROM Customer WHERE LOWER(nama) LIKE ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + keyword.toLowerCase() + "%");
            rs = pstmt.executeQuery();

            // Clear table before loading data
            DefaultTableModel model = (DefaultTableModel) TblCustomer.getModel();
            model.setRowCount(0);

            // Tambahkan data ke tabel
            while (rs.next()) {
                int customerId = rs.getInt("customer_id");
                String nama = rs.getString("nama");
                String email = rs.getString("email");
                String noTelepon = rs.getString("no_telepon");
                String alamat = rs.getString("alamat");
                model.addRow(new Object[]{customerId, nama, email, noTelepon, alamat});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void TblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblCustomerMouseClicked
        int row = TblCustomer.getSelectedRow();
    if (row == -1) {
        return;
    }
    // Ambil data dari tabel
    String id = TblCustomer.getValueAt(row, 0).toString(); // Kolom ID (indeks 0)
    String nama = TblCustomer.getValueAt(row, 1).toString();
    String email = TblCustomer.getValueAt(row, 2).toString();
    String noTelpon = TblCustomer.getValueAt(row, 3).toString();
    String alamat = TblCustomer.getValueAt(row, 4).toString();

    // Set ke text field
    txtID_Pelangan.setText(id); // Pastikan Anda memiliki text field untuk ID
    txtNamaCustomer.setText(nama);
    txtEmailCustomer.setText(email);
    txtNoTeleponCustomer.setText(noTelpon);
    txtAlamatCustomer.setText(alamat);
    }//GEN-LAST:event_TblCustomerMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtID_PelanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_PelanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_PelanganActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Dashboard().setVisible(true);  // Membuka kelas Dashboard
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    private void loadCustomerData() {
        DefaultTableModel model = (DefaultTableModel) TblCustomer.getModel();
        model.setRowCount(0);  // Kosongkan tabel

        // Koneksi dan pengambilan data
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = KoneksiDB.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT customer_id, nama, email, no_telepon, alamat FROM Customer";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int customerId = rs.getInt("customer_id");
                String nama = rs.getString("nama");
                String email = rs.getString("email");
                String noTelepon = rs.getString("no_telepon");
                String alamat = rs.getString("alamat");
                model.addRow(new Object[]{customerId, nama, email, noTelepon, alamat});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void clearFields() {
        txtNamaCustomer.setText("");
        txtEmailCustomer.setText("");
        txtNoTeleponCustomer.setText("");
        txtAlamatCustomer.setText("");
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
            java.util.logging.Logger.getLogger(FrameCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblCustomer;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnTambah;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlamatCustomer;
    private javax.swing.JTextField txtEmailCustomer;
    private javax.swing.JTextField txtID_Pelangan;
    private javax.swing.JTextField txtNamaCustomer;
    private javax.swing.JTextField txtNoTeleponCustomer;
    // End of variables declaration//GEN-END:variables
}
