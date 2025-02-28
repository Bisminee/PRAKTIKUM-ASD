
public class Mahasiswa07 {

    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    void cetakInfo() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM     : " + this.nim);
            System.out.println("Nama    : " + this.nama);
            System.out.println("Kelas   : " + this.kelas);
            System.out.println("IPK     : " + this.ipk);
            System.out.println("--------------------------------------");
        }
    }
}
