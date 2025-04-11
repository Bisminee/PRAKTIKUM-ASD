
import java.util.Scanner;

public class MahasiswaDemo07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa yang ingin didata: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07(jumMhs);
        list.jumMhs = jumMhs;
        Mahasiswa07 Mhs[] = new Mahasiswa07[jumMhs];
        for (int i = 0; i < jumMhs; i++) {
            if (i >= Mhs.length) {
                System.out.println("Data sudah penuh");
            } else {
                System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
                System.out.print("NIM : ");
                String nim = sc.nextLine();
                System.out.print("Nama : ");
                String nama = sc.nextLine();
                System.out.print("Kelas : ");
                String kelas = sc.nextLine();
                System.out.print("IPK : ");
                String ip = sc.nextLine();
                Double ipk = Double.parseDouble(ip);
                System.out.println("----------------------");
                list.tambah(new Mahasiswa07(nim, nama, kelas, ipk));

            }
        }
        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("---------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("---------------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang Dicari: ");
        System.out.print("IPK: ");
        String cariIPK = sc.nextLine();
        double cari = Double.parseDouble(cariIPK);

        System.out.println("Menggunakan Sequential Searching");
        double posisi2 = list.findBinarySeach(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
// System.out.println("---------------------------------------------");
// System.out.println("Pencarian Data");
// System.out.println("---------------------------------------------");
// System.out.println("Masukkan IPK Mahasiswa yang Dicari: ");
// System.out.print("IPK: ");
// String cariIPK = sc.nextLine();
// double cari = Double.parseDouble(cariIPK);

// System.out.println("Menggunakan Sequential Searching");
// double posisi = list.sequentialSearching(cari);
// int pss = (int)posisi;
// list.tampilPosisi(cari, pss);
// list.tampilDataSearch(cari, pss);

// System.out.println("Data Mahasiswa setelah BUBBLE SORT berdasarkan IPK (DESC) : ");
// list.bubbleSort();
// list.tampil();
// System.out.println("Data Mahasiswa setelah SELECTION SORT (ASC) berdasarkan IPK : ");
// list.SelectionSort();
// list.tampil();
// System.out.println("Data Mahasiswa setelah INSERTION SORT (ASC) berdasarkan IPK : ");
// list.InsertionSort();
// list.tampil();
