package jobsheet1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai[][] = new double[8][2];
        
        System.out.print("Masukkan Nilai Pancasila: ");
        nilai[0][0] = sc.nextDouble();        
        System.out.print("Masukkan Nilai Pancasila: ");
        nilai[1][0] = sc.nextDouble();
        System.out.print("Masukkan Nilai Pancasila: ");
        nilai[2][0] = sc.nextDouble();
        System.out.print("Masukkan Nilai Konsep Teknologi Informasi: ");
        nilai[3][0] = sc.nextDouble();
        System.out.print("Masukkan Nilai Critical Thinking and Problem Solving: ");
        nilai[4][0] = sc.nextDouble();
        System.out.print("Masukkan Nilai Matematika Dasar: ");
        nilai[5][0] = sc.nextDouble();
        System.out.print("Masukkan Nilai Pancasila: ");
        nilai[6][0] = sc.nextDouble();
        System.out.print("Masukkan Nilai Pancasila: ");
        nilai[7][0] = sc.nextDouble();
    }
}
