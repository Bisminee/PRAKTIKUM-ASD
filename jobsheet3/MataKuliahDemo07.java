
import java.util.Scanner;

public class MataKuliahDemo07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah matka kuliah yang ingin didaftarakan: ");
        int n = sc.nextInt();
        sc.nextLine();

        MataKuliah07 arrayOfMataKuliah[] = new MataKuliah07[n];
        String kode = null;
        String nama = null;
        String dummy = null;
        int sks = 0, jumlahJam = 0;

        for (int i = 0; i < n; i++) {
            arrayOfMataKuliah[i] = new MataKuliah07(kode, nama, sks, jumlahJam);
            arrayOfMataKuliah[i].tambahData(kode, nama, dummy, sks, jumlahJam, i);
        }

        for (int i = 0; i < n; i++) {
            arrayOfMataKuliah[i].cetakInfo(i, arrayOfMataKuliah);
        }
    }
}
