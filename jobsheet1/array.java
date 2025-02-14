package jobsheet1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai[][] = new double[8][2];
        String namaMatkul[] = new String[8];

        for(int i = 0; i < namaMatkul.length; i++){

            System.out.println("Masukkan nama Mata kuliah ke-" + (i+1));
            namaMatkul[i] = sc.nextLine();
        }
        
        for(int i = 0; i < namaMatkul.length; i++){

            System.out.print("Masukkan Nilai " + namaMatkul[i] +": ");
            nilai[i][0] = sc.nextDouble();        
        }
        
    }
}
