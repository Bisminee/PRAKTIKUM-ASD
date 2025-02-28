
public class DataDosen07 {

    void dataSemuaDosen(Dosen07 arrayOfDosen[]) {
        System.out.println("DATA SEMUA DOSEN");
        for (Dosen07 obj : arrayOfDosen) {
            System.out.println("Kode Dosen: " + obj.kode);
            System.out.println("Nama Dosen: " + obj.nama);
            System.out.println("Usia Dosen: " + obj.usia);
            if (obj.gender == true) {
                System.out.println("Jenis Kelamin Dosen: Pria");
            } else {
                System.out.println("Jenis Kelamin Dosen: Wanita");
            }
            System.out.println("---------------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen07 arrayOfDosen[]) {
        
        System.out.println("\nJUMLAH DOSEN PER JENIS KELAMIN");
        int countP = 0;
        int countW = 0;
        for (Dosen07 obj : arrayOfDosen) {
            if (obj.gender == true) {
                countP += 1;
            } else {
                countW += 1;
            }
        }
        System.out.println("Jumlah dosen Pria   : " + countP);
        System.out.println("Jumlah dosen Wannita: " + countW);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen07 arrayOfDosen[]) {
        
        System.out.println("\nRERATA USIA DOSEN PER JENIS KELAMIN");
        int countP = 0;
        double rataP = 0;
        int countW = 0;
        double rataW = 0;
        for (Dosen07 obj : arrayOfDosen) {
            if (obj.gender == true) {
                countP += 1;
                rataP += obj.usia;
            } else {
                countW += 1;
                rataW += obj.usia;
            }
        }
        rataP = rataP / countP;
        rataW = rataW / countW;
        System.out.println("rerata usia dosen pria: " + rataP);
        System.out.println("rerata usia dosen wanita: " + rataW);
    }

    void infoDosenPalingTua(Dosen07 arrayOfDosen[]) {
        
        System.out.println("\nINFO DOSEN PALING TUA");
        int atas = 0;
        int posisi = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > atas) {
                atas = arrayOfDosen[i].usia;
                posisi = i;
            }
        }
        System.out.println("Informasi Dosen Tertua");
        System.out.println("Kode            : " + arrayOfDosen[posisi].kode);
        System.out.println("Nama            : " + arrayOfDosen[posisi].nama);
        if (arrayOfDosen[posisi].gender == true) {
            System.out.println("Jenis Kelamin   : Pria");
        } else {
            System.out.println("Jenis Kelamin   : Wanita");
        }
        System.out.println("Usia            : " + arrayOfDosen[posisi].usia);
    }

    void infoDosenPalingMuda(Dosen07 arrayOfDosen[]) {
        System.out.println("\nINFO DOSEN PALING MUDA");
        int bawah = 1000;
        int posisi = 0;
        for (int i = 0; i < arrayOfDosen.length; i++){

            if (arrayOfDosen[i].usia < bawah) {
                bawah = arrayOfDosen[i].usia;
                posisi = i;
            }
        }
        System.out.println("Informasi Dosen Termuda");
        System.out.println("Kode            : " + arrayOfDosen[posisi].kode);
        System.out.println("Nama            : " + arrayOfDosen[posisi].nama);
        if (arrayOfDosen[posisi].gender == true) {
            System.out.println("Jenis Kelamin   : Pria");
        } else {
            System.out.println("Jenis Kelamin   : Wanita");
        }
        System.out.println("Usia            : " + arrayOfDosen[posisi].usia);
    }
}
