package Jobsheet12;

import java.util.Scanner;

public class DLLMain {

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di Awal");
            System.out.println("2. Tambah di Akhir");
            System.out.println("3. Hapus di Awal");
            System.out.println("4. Hapus di Akhir");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("7. Sisipkan Data Mahasiswa");
            System.out.println("8. Jumlah Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> {
                    System.out.println("Data sudah dihapus. Data yang terhapus adalah: ");
                    list.head.data.tampil();
                    list.removeFirst();
                }
                case 4 -> {
                    System.out.println("Data sudah dihapus. Data yang terhapus adalah: ");
                    list.tail.data.tampil();
                    list.removeLast();
                }
                case 5 ->
                    list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node01 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan data setelah NIM: ");
                    String nim = scan.nextLine();
                    list.insertAfter(nim, inputMahasiswa(scan));
                }
                case 8 ->
                    System.out.println("Jumlah Mahasiswa: " + list.getSize()); 
                case 0 ->
                    System.out.println("Keluar dari program");
                default ->
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        scan.close();
    }

    public static Mahasiswa01 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return (new Mahasiswa01(nama, nim, kelas, ipk));
    }

}
