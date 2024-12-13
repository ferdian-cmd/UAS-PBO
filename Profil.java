/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package percobaan9;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import java.io.FileInputStream;
/**
 *
 * @author ferdian
 */
public class Profil extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public Profil() {
    initComponents();
    tampilkanDataLogin();try {
        conn = KoneksiDB.getConnection();
        if (conn == null) {
            throw new SQLException("Koneksi database gagal.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Gagal terhubung ke database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtKontak = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        txtNomorKTP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIDPegawai = new javax.swing.JTextField();
        txtBank = new javax.swing.JTextField();
        txtNo_Rekening = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTanggal_Lahir = new javax.swing.JTextField();
        txtTanggal_Masuk = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNamaLengkap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        comboJabatan = new javax.swing.JComboBox<>();
        lblPhoto = new javax.swing.JLabel();
        btnGambar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtKontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKontakActionPerformed(evt);
            }
        });

        jLabel11.setText("Tanggal Masuk");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        txtNomorKTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomorKTPActionPerformed(evt);
            }
        });

        jLabel6.setText("ID Pegawai");

        txtIDPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDPegawaiActionPerformed(evt);
            }
        });

        jLabel16.setText("Nomor KTP");

        jLabel19.setText("Nomor Rekening");

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("FRAME PROFIL");

        jLabel10.setText("Tanggal Lahir");

        jLabel4.setText("No Telfon");

        jLabel2.setText("Nama Lengkap");

        jLabel3.setText("Jabatan");

        jLabel9.setText("Alamat");

        jLabel18.setText("Bank");

        comboJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manajer", "Kasir", "Admin" }));
        comboJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJabatanActionPerformed(evt);
            }
        });

        btnGambar.setText("Gambar");
        btnGambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGambarActionPerformed(evt);
            }
        });

        jLabel5.setText("Username");

        jLabel7.setText("password");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(211, 211, 211))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTanggal_Lahir, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(comboJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKontak, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(txtTanggal_Masuk, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(txtNamaLengkap)
                                    .addComponent(txtUserName)
                                    .addComponent(txtPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGambar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIDPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(27, 27, 27)
                .addComponent(btnEdit)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNo_Rekening, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(txtBank)
                    .addComponent(txtNomorKTP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtIDPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKontak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGambar)
                            .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTanggal_Lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTanggal_Masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomorKTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtNo_Rekening, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
     String sql = "UPDATE pegawai SET nama_lengkap = ?, jabatan = ?, kontak = ?, alamat = ?, "
               + "tanggal_lahir = ?, bank = ?, nomor_rekening = ?, foto_karyawan = ? "
               + "WHERE pegawai_id = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        // Menetapkan parameter lainnya
        pstmt.setString(1, txtNamaLengkap.getText());
        pstmt.setString(2, comboJabatan.getSelectedItem().toString()); // Mengambil nilai dari ComboBox
        pstmt.setString(3, txtKontak.getText());
        pstmt.setString(4, txtAlamat.getText());
        pstmt.setDate(5, java.sql.Date.valueOf(txtTanggal_Lahir.getText())); // Pastikan formatnya benar (YYYY-MM-DD)
        pstmt.setString(6, txtBank.getText());
        pstmt.setString(7, txtNo_Rekening.getText());

        // Menangani foto
        if (fileFoto != null) {  // Jika ada foto yang dipilih
            FileInputStream fis = new FileInputStream(fileFoto);
            pstmt.setBinaryStream(8, fis, (int) fileFoto.length());  // Menyimpan foto sebagai byte stream
        } else {
            pstmt.setNull(8, java.sql.Types.BINARY);  // Jika tidak ada foto, set ke NULL
        }

        pstmt.setString(9, txtIDPegawai.getText()); // Menetapkan ID pegawai

        // Menjalankan perintah UPDATE
        int rows = pstmt.executeUpdate();
        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");
        } else {
            JOptionPane.showMessageDialog(this, "Data gagal diperbarui!");
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtNomorKTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorKTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomorKTPActionPerformed

    private void txtIDPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDPegawaiActionPerformed

    private void txtKontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKontakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKontakActionPerformed

    private void comboJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboJabatanActionPerformed

    private void btnGambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGambarActionPerformed
       JFileChooser chooser = new JFileChooser();
    chooser.setDialogTitle("Pilih Foto");
    chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Gambar (JPG, PNG)", "jpg", "jpeg", "png"));

    int result = chooser.showOpenDialog(null);
    if (result == JFileChooser.APPROVE_OPTION) {
        fileFoto = chooser.getSelectedFile(); // Simpan file yang dipilih ke variabel
        try {
            BufferedImage img = ImageIO.read(fileFoto);
            Image scaledImg = img.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
            lblPhoto.setIcon(new ImageIcon(scaledImg)); // Tampilkan gambar di label
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Gagal mengunggah gambar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnGambarActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Dashboard().setVisible(true);  // Membuka kelas Dashboard
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
 private void simpanData() {
        String idPegawai = txtIDPegawai.getText();
        String namaLengkap = txtNamaLengkap.getText();
        String jabatan = comboJabatan.getSelectedItem().toString();
        String kontak = txtKontak.getText();

        // Validasi sederhana
        if (namaLengkap.isEmpty() || kontak.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama Lengkap dan Kontak wajib diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Tampilkan data sebagai simulasi penyimpanan
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan:\n"
                + "ID Pegawai: " + idPegawai + "\n"
                + "Nama Lengkap: " + namaLengkap + "\n"
                + "Jabatan: " + jabatan + "\n"
                + "Kontak: " + kontak, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
 
  private void tampilkanDataLogin() {
    txtIDPegawai.setText(UserSession.getPegawaiId());
    txtNamaLengkap.setText(UserSession.getNamaLengkap());
    comboJabatan.setSelectedItem(UserSession.getJabatan());
    txtTanggal_Lahir.setText(UserSession.getTanggalLahir());
    txtTanggal_Masuk.setText(UserSession.getTanggalMasuk());
    txtNomorKTP.setText(UserSession.getNomorKTP());
    txtBank.setText(UserSession.getBank());
    txtNo_Rekening.setText(UserSession.getNomorRekening());
    txtUserName.setText(UserSession.getUsername());
    txtPassword.setText(UserSession.getPassword());
    txtAlamat.setText(UserSession.getAlamat());
    txtKontak.setText(UserSession.getKontak());
    
    // Menampilkan foto
    byte[] foto = UserSession.getFoto();
    if (foto != null) {
        ImageIcon imageIcon = new ImageIcon(foto);
        Image img = imageIcon.getImage().getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
        lblPhoto.setIcon(new ImageIcon(img));
    } else {
        lblPhoto.setIcon(null); // Jika tidak ada foto
    }
}
private File fileFoto;
private Connection conn;

private void loadProfileData(String pegawaiId) {
    String sql = "SELECT nama_lengkap, jabatan, kontak, alamat, tanggal_lahir, bank, nomor_rekening, foto_karyawan "
               + "FROM pegawai WHERE pegawai_id = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, pegawaiId);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            txtNamaLengkap.setText(rs.getString("nama_lengkap"));
            comboJabatan.setSelectedItem(rs.getString("jabatan"));
            txtKontak.setText(rs.getString("kontak"));
            txtAlamat.setText(rs.getString("alamat"));
            txtTanggal_Lahir.setText(rs.getString("tanggal_lahir"));
            txtBank.setText(rs.getString("bank"));
            txtNo_Rekening.setText(rs.getString("nomor_rekening"));

            // Membaca gambar dari kolom foto_karyawan
            byte[] imgBytes = rs.getBytes("foto_karyawan");
            if (imgBytes != null) {
                ImageIcon imageIcon = new ImageIcon(imgBytes);
                Image img = imageIcon.getImage().getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
                lblPhoto.setIcon(new ImageIcon(img));
            } else {
                lblPhoto.setIcon(null); // Tidak ada foto
            }
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Gagal memuat data profil: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnGambar;
    private javax.swing.JComboBox<String> comboJabatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtBank;
    private javax.swing.JTextField txtIDPegawai;
    private javax.swing.JTextField txtKontak;
    private javax.swing.JTextField txtNamaLengkap;
    private javax.swing.JTextField txtNo_Rekening;
    private javax.swing.JTextField txtNomorKTP;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTanggal_Lahir;
    private javax.swing.JTextField txtTanggal_Masuk;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
