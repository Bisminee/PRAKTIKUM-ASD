package jobsheet1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cek = true;
        char Kode[] = {'A', 'B', 'D', 'E', 'F', 
                       'G', 'H', 'L', 'N', 'T'};
        char Kota[][] = {{'B','A','N','T','E','N'},
                         {'J','A','K','A','R','T','A'},
                         {'B','A','N','D','U','N','G'},
                         {'C','I','R','E','B','O','N'},
                         {'B','O','G','O','R'},
                         {'P','E','K','A','L','O','N','G','A','N'},
                         {'S','E','M','A','R','A','N','G'},
                         {'S','U','R','A','B','A','Y','A'},
                         {'M','A','L','A','N','G'},
                         {'T','E','G','A','L'}};

        System.out.print("Masukkan Plat Nomor Yang Ingin Dicari(huruf plat): ");
        while(cek){
            char cari = sc.nextLine().charAt(0);
            for(int i = 0; i < Kode.length; i++){
                if(cari == Kode[i]){
                    System.out.println("\nPlat yang anda cari berasal dari daerah: ");
                    for (char n : Kota[i]) {
                        System.out.print(n);
                    }
                    cek = false;
                }
                
                
            }
            
        }

    }
}
