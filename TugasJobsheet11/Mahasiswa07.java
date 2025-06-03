package TugasJobsheet11;


public class Mahasiswa07 {
    String nim, nama, kelas;
    double ipk;
    
    
    public Mahasiswa07() {
    }
    
    public Mahasiswa07(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    
    public void tampilIformasi(){
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t" + ipk);
    }


}
