public class MataKuliahMain07 {
    public static void main(String[] args) {
        MataKuliah07 matkul1 = new MataKuliah07();

        int sksBaru = 0;
        int jam = 0;

        matkul1.kodeMK = "1234567";
        matkul1.nama = "Matematika";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        matkul1.tampilInformasi();
        matkul1.ubahSKS(sksBaru);
        matkul1.tambahJam(jam);
        matkul1.kurangJam(jam);
        matkul1.tampilInformasi();
        

        MataKuliah07 matkul2 = new MataKuliah07("12345", "Matematika", 2, 4);
        matkul2.tampilInformasi();
    }

    
}
