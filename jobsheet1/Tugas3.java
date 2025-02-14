package jobsheet1;

import java.util.Scanner;

public class Tugas3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("Masukkan jumlah mata kuliah: ");
        n = sc.nextInt();
        sc.nextLine();

        String namaMatkul[] = new String[n];
        int sks[] = new int[n];
        int semester[] = new int[n];
        String hariKuliah[] = new String[n];
        boolean cek = true;
        int pilih;

        for(int i = 0; i < n; i++){
            System.out.println("Mata Kuliah ke-" + (i+1));
            System.out.print("Masukkan Nama Mata Kuliah: ");
            namaMatkul[i] = sc.nextLine();
            System.out.print("Masukkan SKS: ");
            sks[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        while (cek){
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 0:
                    cek = false;
                case 1:
                    tampilSemua(namaMatkul, sks, semester, hariKuliah);
                    break;

                case 2:
                    cariBerdasarHari(namaMatkul, sks, semester, hariKuliah);
                    break;

                case 3:
                    cariBerdasarSemester(namaMatkul, sks, semester, hariKuliah);
                    break;

                case 4:
                    cariInfoMatkul(namaMatkul, sks, semester, hariKuliah);
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
            }

        }
    }

    static void menu(){
        System.out.println("\nMENU JADWAL KULIAH");
        System.out.println("1. Tampilkan Seluruh Jadwal");
        System.out.println("2. Cari Jadwal berdasarkan Hari");
        System.out.println("3. Cari Jadwal berdasarkan Semester");
        System.out.println("4. Cari Info Mata Kuliah");
        System.out.println("0. Keluar");
        System.out.print("Masukkan Pilihan: ");
    }

    static void tampilSemua(String namaMatkul[], int sks[], int semester[], String hariKuliah[]){
        System.out.println("Mata Kuliah\t\t\tSemester\t\t\tSKS\t\t\tHari Kuliah");
        for(int i = 0; i < namaMatkul.length; i++){
            System.out.println(namaMatkul[i] + "\t\t\t\t" + semester[i] + "\t\t\t\t" + sks[i] + "\t\t\t\t" + hariKuliah[i]);
        }
    }

    static void cariBerdasarHari(String namaMatkul[], int sks[], int semester[], String hariKuliah[]){
        Scanner cin = new Scanner(System.in);
        String keyword;
        
        System.out.println("Masukkan Hari yang ingin dicari");
        keyword = cin.nextLine();

        System.out.println("Mata Kuliah\t\t\tSemester\t\t\tSKS\t\t\tHari Kuliah");
        for (int i = 0; i < hariKuliah.length; i++){
            if(keyword.equalsIgnoreCase(hariKuliah[i])){
                System.out.println(namaMatkul[i] + "\t\t\t" + semester[i] + "\t\t\t" + sks[i] + "\t\t\t" + hariKuliah[i]);
            }
        }
    }

    static void cariBerdasarSemester(String namaMatkul[], int sks[], int semester[], String hariKuliah[]){
        Scanner cin = new Scanner(System.in);
        int keyword;
        
        System.out.println("Masukkan Hari yang ingin dicari");
        keyword = cin.nextInt();
        cin.nextLine();

        System.out.println("Mata Kuliah\t\t\tSemester\t\t\tSKS\t\t\tHari Kuliah");
        for (int i = 0; i < hariKuliah.length; i++){
            if(keyword == semester[i]){
                System.out.println(namaMatkul[i] + "\t\t\t" + semester[i] + "\t\t\t" + sks[i] + "\t\t\t" + hariKuliah[i]);
            }
        }
    }

    static void cariInfoMatkul(String namaMatkul[], int sks[], int semester[], String hariKuliah[]){
        Scanner cin = new Scanner(System.in);
        String keyword;
        
        System.out.println("Masukkan Hari yang ingin dicari");
        keyword = cin.nextLine();

        System.out.println("Mata Kuliah\t\t\tSemester\t\t\tSKS\t\t\tHari Kuliah");
        for (int i = 0; i < hariKuliah.length; i++){
            if(keyword.equalsIgnoreCase(namaMatkul[i])){
                System.out.println(namaMatkul[i] + "\t\t\t" + semester[i] + "\t\t\t" + sks[i] + "\t\t\t" + hariKuliah[i]);
            }
        }
    }
}
