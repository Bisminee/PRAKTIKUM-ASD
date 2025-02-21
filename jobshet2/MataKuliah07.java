import java.util.Scanner;

public class MataKuliah07 {
    Scanner sc = new Scanner(System.in);

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void menu(){
        System.out.println("\n====================");
        System.out.println("    Mata Kuliah     ");
        System.out.println("====================");
        System.out.println("1. Tampilkan Informasi Mata Kuliah");
        System.out.println("2. Ubah SKS Mata Kuliah");
        System.out.println("3. Tambah Jam Mata Kuliah");
        System.out.println("4. Mengurangi Mata Kuliah");
        System.out.println("0. Keluar");
        System.out.print("Pilihan: ");
    }


    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Total Jam per Minggu: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        System.out.print("Masukkan SKS baru: ");
        sksBaru = sc.nextInt();
        sc.nextLine();
        sks = sksBaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam){
        System.out.print("Berapa jam yang ingin ditambahkan: ");
        jam = sc.nextInt();
        sc.nextLine();

        jumlahJam += jam;
    }

    void kurangJam(int jam){
        System.out.print("Berapa jam yang ingin dikurangi: ");
        jam = sc.nextInt();
        sc.nextLine();
        if(jam <= jumlahJam){
            System.out.println("\nJam tidak dapat dikurangi dengan jumlah pengurangan tersebut");
        }else{
            jumlahJam -= jam;
        }
    }

    public MataKuliah07(){

    } 

    public MataKuliah07(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this. sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
