
import java.util.Scanner;

public class DosenDemo07 {
    public static void main(String[] args) {
        DataDosen07 arrOfDataDosen07 = new DataDosen07();
        Scanner sc = new Scanner(System.in);
        Dosen07 arrOfDosen[] = new Dosen07[3];
        String nama, kode, jenisKelamin;
        boolean gender;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i+1));
            System.out.print("Masukkan kode Dosen: ");
            kode = sc.nextLine();
            System.out.print("Masukkan nama Dosen: ");
            nama = sc.nextLine();
            System.out.print("Masukkan jenis kelamin Dosen(pria/wanita): ");
            jenisKelamin = sc.nextLine();
            if(jenisKelamin.equalsIgnoreCase("pria")){
                gender = true;
            }else if(jenisKelamin.equalsIgnoreCase("wanita")){
                gender = false;
            }else{
                gender = false;
            }
            System.out.print("Masukkan usia Dosen: ");
            usia = sc.nextInt();
            sc.nextLine();
            arrOfDosen[i] = new Dosen07(kode, nama, gender, usia);
            System.out.println("---------------------------------------");
        }

        
        for (Dosen07 obj : arrOfDosen) {
            System.out.println("Kode Dosen: " + obj.kode );
            System.out.println("Nama Dosen: " + obj.nama );
            System.out.println("Usia Dosen: " + obj.usia );
            if(obj.gender == true){
                System.out.println("Jenis Kelamin Dosen: Pria"  );
            }else{
                System.out.println("Jenis Kelamin Dosen: Wanita"  );
            }
            System.out.println("---------------------------------------");
        }

        arrOfDataDosen07.dataSemuaDosen(arrOfDosen);
        arrOfDataDosen07.jumlahDosenPerJenisKelamin(arrOfDosen);
        arrOfDataDosen07.rerataUsiaDosenPerJenisKelamin(arrOfDosen);
        arrOfDataDosen07.infoDosenPalingTua(arrOfDosen);
        arrOfDataDosen07.infoDosenPalingMuda(arrOfDosen);

    }
}
