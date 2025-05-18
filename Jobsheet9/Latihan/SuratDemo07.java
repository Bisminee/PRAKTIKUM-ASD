
import java.util.Scanner;

public class SuratDemo07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat07 stack = new StackSurat07(5);
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin: ");
                    char jenisIzin = sc.nextLine().charAt(0);
                    System.out.print("durasi(jam): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat07 surat = new Surat07(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.printf("Surat %s berhasil didata\n", surat.namaMahasiswa);
                    break;
                case 2:
                    Surat07 diverifikasi = stack.peek();
                    if (diverifikasi != null) {
                        System.out.println("Surat izin " + diverifikasi.namaMahasiswa);
                        System.out.println("ID Surat\tNama\tKelas\tJenis Surat\tDurasi");
                        System.out.println(diverifikasi.idSurat + "\t\t" + diverifikasi.namaMahasiswa + "\t" + diverifikasi.kelas
                                + "\t" + diverifikasi.jenisIzin + "\t\t" + diverifikasi.durasi);
                        System.out.print("Apakah surat diverifikasi(y/n): ");
                        String verifikasi = sc.nextLine();
                        if(verifikasi.equalsIgnoreCase("y")){
                            diverifikasi = stack.pop();
                        } else{
                            break;
                        }
                    }
                    break;
                case 3:
                    Surat07 lihat = stack.peek();
                    if (lihat != null) {;
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama Mahasiswa yang ingin dicari: ");
                    String cariNama = sc.nextLine();
                    Surat07 cari = stack.cariSurat(cariNama);
                    if(cari == null){
                        System.out.println("Mahasiswa " + cariNama + " tidak ditemukan");
                    }else{
                        System.out.println("Surat dengan nama " + cariNama + " ditemukan");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } while (pilih >= 1 && pilih <= 4);
    }

}
