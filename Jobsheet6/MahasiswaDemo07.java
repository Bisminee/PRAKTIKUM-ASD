
import java.util.Scanner;


public class MahasiswaDemo07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07();
        Mahasiswa07 Mhs[] = new Mahasiswa07[list.listMhs.length];
        for (int i = 0; i < Mhs.length; i++) {
            if (i >= Mhs.length) {
                System.out.println("Data sudah penuh");
            }else{
                System.out.println("----------------------");
                System.out.println("Mahasiswa ke-" + (i+1));
                Mhs[i] = new Mahasiswa07();
                System.out.print("Masukkan NIM: ");
                Mhs[i].nim = sc.nextLine();
                System.out.print("Nama Mahasiswa: ");
                Mhs[i].nama = sc.nextLine();
                System.out.print("Masukkan kelas: ");
                Mhs[i].kelas = sc.nextLine();
                System.out.print("Masukkan IPK: ");
                Mhs[i].ipk = sc.nextDouble();
                sc.nextLine();
                list.tambah(Mhs[i]);

            }
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        // System.out.println("Data Mahasiswa setelah BUBBLE SORT berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();
        // System.out.println("Data Mahasiswa setelah SELECTION SORT (ASC) berdasarkan IPK : ");
        // list.SelectionSort();
        // list.tampil();
        System.out.println("Data Mahasiswa setelah INSERTION SORT (ASC) berdasarkan IPK : ");
        list.InsertionSort();
        list.tampil();
    }
}
