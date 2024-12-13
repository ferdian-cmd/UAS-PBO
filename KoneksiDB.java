/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan9;

/**
 *
 * @author ferdian
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class KoneksiDB {
    // URL JDBC, username, dan password untuk PostgreSQL
    private static final String URL = "jdbc:postgresql://localhost:5432/toko_bunga"; // Ganti sesuai dengan URL database kamu
    private static final String USER = "postgres"; // Ganti dengan username PostgreSQL kamu
    private static final String PASSWORD = "ferdian123"; // Ganti dengan password PostgreSQL kamu

    // Metode untuk mendapatkan koneksi ke database
    public static Connection getConnection() {
        Connection connection = null;

        try {
            // Mencoba untuk membuat koneksi ke database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi ke database berhasil!"); // Menampilkan pesan jika koneksi berhasil
        } catch (SQLException e) {
            // Jika terjadi kesalahan saat mencoba koneksi
            System.out.println("Gagal menyambung ke database.");
            e.printStackTrace();
        }

        return connection; // Mengembalikan koneksi (null jika gagal)
    }
}