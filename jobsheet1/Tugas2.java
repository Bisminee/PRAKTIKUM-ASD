package jobsheet1;

import java.util.Scanner;

public class Tugas2 {
    static void menu(){
        System.out.println("==Kalkulator Kubus==");
        System.out.println("1. Volume");
        System.out.println("2. Luas Permukaan");
        System.out.println("3. Keliling");
    }

    static void volumeKubus(double sisi){
        double Volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus adalah: " + Volume);
    }

    static void luasPermukaanKubus(double sisi){
        double luasPermukaan = sisi * sisi * 6;
        System.out.println("Luas Permukaan Kubus adalah: " + luasPermukaan);
    }

    static void kelilingKubus(double sisi){
        double keliling = sisi * 12;
        System.out.println("Keliling Kubus adalah: " + keliling);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        int Pilihan;
        double sisi;
        System.out.print("Masukkan Pilihan: ");
        Pilihan = sc.nextInt();
        System.out.print("Masukkan sisi kubus: ");
        sisi = sc.nextDouble();

        switch (Pilihan) {
            case 1:
                volumeKubus(sisi);
                break;
            case 2: 
                luasPermukaanKubus(sisi);
                break;
            case 3: 
                kelilingKubus(sisi);
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
        }
    }
}
