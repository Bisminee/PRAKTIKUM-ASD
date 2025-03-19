
import java.util.Scanner;

public class bukuDemo {
    public static void main(String[] args) {
        Scanner sc07 = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Buku yang didata: ");
        int jumlah07 = sc07.nextInt();
        sc07.nextLine();
        int sekarang = 2025;
        String judul07, penulis07; 
        double harga07;
        int tahunTerbit07;        
        buku07 infoBuku07[] = new buku07[jumlah07];

        for (int i = 0; i < infoBuku07.length; i++) {
            System.out.println("Masukkan Informasi Buku ke-" + (i+1));
            System.out.print("Masukkan Judul Buku: ");
            judul07 = sc07.nextLine();
            System.out.print("Masukkan Nama Penulis: ");
            penulis07 = sc07.nextLine();
            System.out.print("Masukkan harga buku: ");
            harga07 = sc07.nextInt();
            sc07.nextLine();
            System.out.print("Masukkan Tahun terbit: ");
            tahunTerbit07 = sc07.nextInt();
            sc07.nextLine();
            infoBuku07[i] = new buku07(judul07, penulis07,  harga07, tahunTerbit07);
        }

        for (int i = 0; i < infoBuku07.length; i++) {
            System.out.println("Informasi Buku ke-" + (i+1));
            infoBuku07[i].tampilkanInformasi();
        }
        
    }
}
