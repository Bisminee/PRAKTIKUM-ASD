package jobsheet1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai[][] = new double[8][2];
        String namaMatkul[] = new String[8];
        double ip = 0;
        String nilaiHuruf[] = new String[8];

        for(int i = 0; i < namaMatkul.length; i++){

            System.out.print("Masukkan nama Mata kuliah ke-" + (i+1) + ": ");
            namaMatkul[i] = sc.nextLine();
        }
        
        for(int i = 0; i < namaMatkul.length; i++){

            System.out.print("Masukkan Nilai " + namaMatkul[i] + ": ");
            nilai[i][0] = sc.nextDouble();      
            if(nilai[i][0] <= 39){
                nilai[i][1] = 0;
                nilaiHuruf[i] = "E";
            }else if(nilai[i][0] > 39 && nilai[i][0] <= 50){
                nilai[i][1] = 1;
                nilaiHuruf[i] = "D";
            }else if(nilai[i][0] > 50 && nilai[i][0] <= 60){
                nilai[i][1] = 2;
                nilaiHuruf[i] = "C";
            }else if(nilai[i][0] > 60 && nilai[i][0] <= 65){
                nilai[i][1] = 2.5;
                nilaiHuruf[i] = "C+";
            }else if (nilai[i][0] > 65 && nilai[i][0] <= 73){
                nilai[i][1] = 3;
                nilaiHuruf[i] = "B";
            }else if (nilai[i][0] > 73 && nilai[i][0] <= 80){
                nilai[i][1] = 3.5;
                nilaiHuruf[i] = "B+";
            }else if (nilai[i][0] > 80){
                nilai[i][1] = 4;
                nilaiHuruf[i] = "A";
            }
            ip += nilai[i][1];
        }

        ip = ip / namaMatkul.length;
        
        System.out.println("============================");
        System.out.println("    HASIL KONVERSI NILAI    ");
        System.out.println("============================");

        System.out.println("MK\t\t\tNILAI ANGKA\t\t\tNILAI HURUF\t\t\tBOBOT NILAI");
        for(int i = 0; i < namaMatkul.length; i++){
            System.out.println(namaMatkul[i] + "\t\t\t" + nilai[i][0] + "\t\t\t\t" + nilaiHuruf[i] + "\t\t\t\t" + nilai[i][1]);
        }
        System.out.println("===========================");
        System.out.println("IP : " + ip);
    }
}
