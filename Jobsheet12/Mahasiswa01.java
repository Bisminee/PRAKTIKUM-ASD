package Jobsheet12;

public class Mahasiswa01 {

    public String nama, nim, kelas;
    public double ipk;

    public Mahasiswa01(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + "n Kelas: " + kelas + ", IPK: " + ipk);
    }

}
