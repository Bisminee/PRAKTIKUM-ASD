public class Mahasiswa07{
    String nama, nim, kelas;
    int nilai;
    
    Mahasiswa07(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    public Mahasiswa07() {
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}