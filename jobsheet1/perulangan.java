package jobsheet1;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nim;
        int n;

        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();

        n = Integer.parseInt(nim.substring(nim.length() - 2));
        System.out.println(n);

        for(int i = 1; i <= n; i++)
            

            if(i == 6){
                System.out.print("* ");
            }else if(i == 10){
                System.out.print("* ");
            }else if(i % 2 != 0){
                System.out.print("* ");
            }else{
                System.out.print(i + " ");
            }
    }
}
