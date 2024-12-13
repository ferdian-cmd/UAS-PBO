/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan9;

/**
 *
 * @author ferdian
 */
public class UserSession {
    private static String pegawaiId;
    private static String namaLengkap;
    private static String jabatan;
    private static String tanggalLahir;
    private static String tanggalMasuk;
    private static String nomorKTP;
    private static String bank;
    private static String nomorRekening;
    private static String username;
    private static String password;
    private static String alamat;
    private static String kontak;
    private static byte[] foto; 

    public static void setSessionData(String id, String nama, String jab, String tglLahir,
                                      String tglMasuk, String ktp, String bankName, 
                                      String noRek, String user, String pass, 
                                      String almt, String ktk, byte[] photo) {
        pegawaiId = id;
        namaLengkap = nama;
        jabatan = jab;
        tanggalLahir = tglLahir;
        tanggalMasuk = tglMasuk;
        nomorKTP = ktp;
        bank = bankName;
        nomorRekening = noRek;
        username = user;
        password = pass;
        alamat = almt;
        kontak = ktk;
        foto = photo;
    }

    public static String getPegawaiId() { return pegawaiId; }
    public static String getNamaLengkap() { return namaLengkap; }
    public static String getJabatan() { return jabatan; }
    public static String getTanggalLahir() { return tanggalLahir; }
    public static String getTanggalMasuk() { return tanggalMasuk; }
    public static String getNomorKTP() { return nomorKTP; }
    public static String getBank() { return bank; }
    public static String getNomorRekening() { return nomorRekening; }
    public static String getUsername() { return username; }
    public static String getPassword() { return password; }
    public static String getAlamat() { return alamat; }
    public static String getKontak() { return kontak; }
    public static byte[] getFoto() { return foto; }
}