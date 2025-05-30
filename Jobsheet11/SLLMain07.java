package Jobsheet11;

import java.util.Scanner;

public class SLLMain07 {
    public static void main(String[] args) {
        SingleLinkedList07 sll = new SingleLinkedList07();
        Mahasiswa07 mhs[] = new Mahasiswa07[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa07();
            System.out.println("\nData Mahsiswa ke-" + (i+1));
            System.out.print("Masukkan Nama Mahasiswa ke-" + (i+1) + ": ");
            mhs[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM Mahasiswa ke-" + (i+1) + ": ");
            mhs[i].nim = sc.nextLine();
            System.out.print("Masukkan Kelas Mahasiswa ke-" + (i+1) + ": ");
            mhs[i].kelas = sc.nextLine();
            System.out.print("Masukkan IPK Mahasiswa ke-" + (i+1) + ": ");
            mhs[i].ipk = sc.nextDouble();
            sc.nextLine();
            
        }

        sll.print();
        sll.addFirst(mhs[3]);
        sll.print();
        sll.addLast(mhs[0]);
        sll.print();
        sll.insertAfter(mhs[3].nama, mhs[2]);
        sll.insertAt(2, mhs[1]);
        sll.print();
    
    }
}
