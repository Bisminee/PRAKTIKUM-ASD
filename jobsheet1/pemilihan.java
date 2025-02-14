package jobsheet1;

import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas, kualifikasi = "TIDAK LULUS";
        byte absen;
        int nilaiUAS, nilaikuis, nilaiTugas, nilaiUTS, nilaiUjian;
        double nilaiAkhir;
        String nilaiHuruf = "E";

        System.out.print("Masukkan nilai kuis: ");
        nilaikuis = sc.nextInt();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextInt();
        nilaiAkhir = (double) ((nilaikuis * 20/100) + (nilaiTugas * 15/100) + (nilaiUTS * 30/100) + (nilaiUAS * 35/100));

        if(nilaiAkhir <= 39){
            nilaiHuruf = "E";
            kualifikasi = "TIDAK LULUS";
        }else if(nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
            kualifikasi = "TIDAK LULUS";
        }else if(nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
            kualifikasi = "SELAMAT ANDA LULUS";
        }else if(nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
            kualifikasi = "SELAMAT ANDA LULUS";
        }else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
            kualifikasi = "SELAMAT ANDA LULUS";
        }else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
            kualifikasi = "SELAMAT ANDA LULUS";
        }else if (nilaiAkhir > 80){
            nilaiHuruf = "A";
            kualifikasi = "SELAMAT ANDA LULUS";
        }
        System.out.println("================================");
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai Kuis: " + nilaikuis);
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai UAS: " + nilaiUAS);
        System.out.println("================================");
        if( nilaiTugas < 0 || nilaikuis < 0 || nilaiUAS < 0 || nilaiUTS < 0 || 
            nilaiTugas > 100 || nilaikuis > 100 || nilaiUAS > 100 || nilaiUTS > 100){
            System.out.println("Nilai Tidak Valid");
            System.out.println("================================");
        }else{
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);
            System.out.println("================================");
            System.out.println(kualifikasi);
        }
    }
}
