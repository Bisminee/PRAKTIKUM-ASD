package Jobsheet11;

import java.util.Scanner;

public class SLLMain07 {

    public static void main(String[] args) {
        SingleLinkedList07 sll = new SingleLinkedList07();
        Mahasiswa07 mhs[] = {
            new Mahasiswa07("24212201", "Bisma", "1C", 4),
            new Mahasiswa07("22212202", "Cintia", "3C", 3.5),
            new Mahasiswa07("23212201", "Bimon", "2B", 3.8),
            new Mahasiswa07("24212202", "Aksa", "1B", 3.6)};
        Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < mhs.length; i++) {
        //     mhs[i] = new Mahasiswa07();
        //     System.out.println("\nData Mahsiswa ke-" + (i+1));
        //     System.out.print("Masukkan Nama Mahasiswa ke-" + (i+1) + ": ");
        //     mhs[i].nama = sc.nextLine();
        //     System.out.print("Masukkan NIM Mahasiswa ke-" + (i+1) + ": ");
        //     mhs[i].nim = sc.nextLine();
        //     System.out.print("Masukkan Kelas Mahasiswa ke-" + (i+1) + ": ");
        //     mhs[i].kelas = sc.nextLine();
        //     System.out.print("Masukkan IPK Mahasiswa ke-" + (i+1) + ": ");
        //     mhs[i].ipk = sc.nextDouble();
        //     sc.nextLine();
        // }
        // sll.print();
        sll.addFirst(mhs[0]);
        System.out.println(sll.head.data.nama);
        // sll.print();
        sll.addLast(mhs[2]);
        // sll.print();
        sll.insertAfter(mhs[0].nama, mhs[1]);
        sll.insertAt(2, mhs[3]);
        // sll.print();

        System.out.println("data index 1 :");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}
