
public class Dosen {

    String kode, nama;
    boolean jenisKelamin;//true = laki, false perempuan
    int usia;

    Dosen(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    Dosen(){
        
    }

    void tampilInfoDosen() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        if (jenisKelamin) {
            System.out.println("Jenis Kelamin: Pria");
        } else {
            System.out.println("Jenis Kelamin: Wanita");
        }
        System.out.println("Usia: " + usia);
    }
}
