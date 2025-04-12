
public class DataDosen {

    Dosen dataDosen[] = new Dosen[10];
    int idx;

    void tambahDosen(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen dsn : dataDosen) {
            if (dsn != null) {
                dsn.tampilInfoDosen();
                System.out.println("-------------------------------");
            }
        }
    }

    void SortingASC() {
        for (int i = 0; i < dataDosen.length; i++) {
            for (int j = 1; j < dataDosen.length - i; j++) {
                if (dataDosen[j].usia > dataDosen[j - 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
    }

    void SortingDSC() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void InsertionSort() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    int PencarianDataSequential(String cari) {
        int posisi = -1;
        int ditemukan = 0;
        for (int j = 0; j < dataDosen.length; j++) {
            if (dataDosen[j].nama.equalsIgnoreCase(cari)) {
                ditemukan++;
                if (ditemukan == 1) {
                    posisi = j;
                } else if (ditemukan >= 2) {
                    System.out.println("\nDATA DITEMUKAN LEBIH DARI 1!");
                }
            }
        }
        return posisi;
    }

    void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan usia :" + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch07(int pos) {
        if (pos != -1) {
            System.out.println("Kode\t: " + dataDosen[pos].kode);
            System.out.println("Nama\t: " + dataDosen[pos].nama);
            if (dataDosen[pos].jenisKelamin) {
                System.out.println("Jenis Kelamin: Pria");
            } else {
                System.out.println("Jenis Kelamin: Wanita");
            }
            System.out.println("Usia\t: " + dataDosen[pos].usia);
        }
    }

    //DSC sort dulu
    int PencarianDataBinary07(int ditemukan, int cari, int left, int right) {
        int mid; 
        int posisi = -1;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == dataDosen[mid].usia) {
                ditemukan++;
                posisi = mid;
            } else if (dataDosen[mid].usia < cari || mid != 0) {
                return PencarianDataBinary07(ditemukan, cari, left, mid - 1);
            } else if(dataDosen[mid].usia > cari || mid != dataDosen.length){
                return PencarianDataBinary07(ditemukan, cari, mid + 1, right);
            }
        }

        return posisi;
    }
}
