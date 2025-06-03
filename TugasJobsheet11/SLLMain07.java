package TugasJobsheet11;

import java.util.Scanner;

public class SLLMain07 {

    public static void main(String[] args) {
        SingleLinkedList07 sll = new SingleLinkedList07();
        Scanner sc = new Scanner(System.in);
        String nama, kelas, nim;
        double ipk;
        int i = 1;
        while (!sll.isFull()) {
            System.out.println("Menu");
            System.out.println("1. Tambahkan Data");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Depan");
            System.out.println("4. Cek Antrian Belakang");
            System.out.println("5. Jumlah Antrian");
            int pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("\nMasukkan Antrian ke-" + (i));
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    sc.nextLine();
                    sll.add(new Mahasiswa07(nim, nama, kelas, ipk));
                    i++;
                    break;
                case 2:
                    sll.dequeueFirst();
                    break;
                case 3:
                    sll.printFirst();
                    break;
                case 4:
                    sll.printLast();
                    ;
                    break;
                case 5:
                    sll.count();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
