package jobsheet1;

import java.util.Scanner;

public class Fungsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tokoBunga[][] = {{10, 5, 15, 7},
                             {6, 11, 9, 12},
                             {2, 10, 10, 5},
                             {5, 7, 12, 9}};

        int hargaBunga[] = {75000, 50000, 60000, 10000};//Aglonema, Keladi, Alocasia, Mawar
        String namaBunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        tampilanPendapatan(tokoBunga, hargaBunga);
        System.out.println();
        tampilanCabang4(tokoBunga, namaBunga);
    }

    static void tampilanPendapatan(int tokoBunga[][], int hargaBunga[]){
        int totalPendapatan[] = new int[tokoBunga.length];
        for(int i = 0; i < tokoBunga.length; i++){
            for (int j = 0; j < tokoBunga[i].length; j++){
                totalPendapatan[i] += tokoBunga[i][j] * hargaBunga[j];
            }
        }
        for(int i = 0; i < tokoBunga.length; i++){
            System.out.println("Pendapatan Cabang RoyalGarden " + (i+1) + ": " + totalPendapatan[i]);
        }
    }

    static void tampilanCabang4(int tokoBunga[][], String namaBunga[]){
        tokoBunga[3][0] -= 1;
        tokoBunga[3][1] -= 2;
        tokoBunga[3][3] -= 5;
        System.out.println("\nSisa Persedian Bunga di Cabang 4:");
        for(int i = 0; i < tokoBunga.length; i++){
            System.out.println(namaBunga[i] + " tersisa: " + tokoBunga[3][i]);
        }
    }
}
