
import java.util.Scanner;

public class Dosen07 {

    Scanner sc = new Scanner(System.in);
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {

        System.out.println("ID Dosen                : " + idDosen);
        System.out.println("Nama Dosen              : " + nama);
        if (statusAktif == true) {
            System.out.println("Status Keaktifan Dosen  : Aktif");
        } else {
            System.out.println("Status Keaktifan Dosen  : Tidak Aktif");
        }
        System.out.println("Tahun Bergabung         : " + tahunBergabung);
        System.out.println("Bidang Keahlian Dosen   : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        System.out.print("Apakah Status Dosen Masih Aktif(true/false)? ");
        status = sc.nextBoolean();
        sc.nextLine();
        statusAktif = status;
    }

    void hitungMasaKerja(int thnSkrg) {
        thnSkrg = 2025;
        System.out.println("Masa Kerja Dosen adalah: " + (thnSkrg - tahunBergabung));
    }

    void ubahKeahlian(String bidang) {
        System.out.print("Masukkan Keahlian Dosen yang Baru: ");
        bidang = sc.nextLine();

        bidangKeahlian = bidang;
    }

    public Dosen07() {
    }

    public Dosen07(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

}
