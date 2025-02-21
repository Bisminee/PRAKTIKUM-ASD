public class DosenMain {
    public static void main(String[] args) {
        boolean status = false;
        int thnSkrg = 0;
        String bidang = null;
        Dosen07 Dosen1 = new Dosen07();
        Dosen07 Dosen2 = new Dosen07("12345", "Bisma", true, 2001, "Computer Science" );

        Dosen1.idDosen = "9807";
        Dosen1.nama = "Aksa";
        Dosen1.statusAktif = true;
        Dosen1.bidangKeahlian = "Computer Vision";
        Dosen1.tahunBergabung = 1999;

        Dosen2.tampilInformasi();
        Dosen2.setStatusAktif(status);
        Dosen2.hitungMasaKerja(thnSkrg);
        Dosen2.ubahKeahlian(bidang);
        Dosen2.tampilInformasi();
    }   
}
