
import java.util.Scanner;

public class MataKuliah07 {

    Scanner sc = new Scanner(System.in);

    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah07(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(String kode, String nama, String dummy, int sks, int jumlahJam, int i) {
    
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode          : ");
            this.kode = sc.nextLine();
            System.out.print("Nama          : ");
            this.nama = sc.nextLine();
            System.out.print("SKS           : ");
            dummy = sc.nextLine();
            this.sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = sc.nextLine();
            this.jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------");

        
    }

    void cetakInfo(int i, MataKuliah07 arrayOfMataKuliah[]) {
        System.out.println("Data Mata Kuliah ke-" + (i + 1));
        System.out.println("Kode        : " + arrayOfMataKuliah[i].kode);
        System.out.println("Nama        : " + arrayOfMataKuliah[i].nama);
        System.out.println("SKS         : " + arrayOfMataKuliah[i].sks);
        System.out.println("Jumlah Jam  : " + arrayOfMataKuliah[i].jumlahJam);
        System.out.println("---------------------------------");
    }
}
