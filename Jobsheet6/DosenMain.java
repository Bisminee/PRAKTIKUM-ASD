import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen list = new DataDosen();
        Dosen dsn[] = new Dosen[list.dataDosen.length];
        boolean pilihan = true;
        int choose;
        String gender;

        while (pilihan) {
            System.out.println("MENU DOSEN");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Informasi Seluruh Dosen");
            System.out.println("3. Sorting Ascending");
            System.out.println("4. Sorting Desscending");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 0:
                    pilihan = false;
                    break;
                case 1:
                    for (int i = 0; i < dsn.length; i++) {
                        if (i >= dsn.length) {
                            System.out.println("Data sudah penuh");
                        } else {
                            System.out.println("----------------------");
                            System.out.println("Dosen ke-" + (i + 1));
                            dsn[i] = new Dosen();
                            System.out.print("Masukkan Kode Dosen: ");
                            dsn[i].kode = sc.nextLine();
                            System.out.print("Nama Dosen: ");
                            dsn[i].nama = sc.nextLine();
                            System.out.print("Masukkan Jenis Kelamin(Pria/Wanita): ");
                            gender = sc.nextLine();
                            if (gender.equalsIgnoreCase("Pria")) {
                                dsn[i].jenisKelamin = true;
                            } else if (gender.equalsIgnoreCase("Wanita")) {
                                dsn[i].jenisKelamin = false;
                            } else {
                                System.out.println("Gender salah, harp mengulang");
                                continue;
                            }
                            System.out.print("Masukkan Usia: ");
                            dsn[i].usia = sc.nextInt();
                            sc.nextLine();
                            list.tambahDosen(dsn[i]);
                        }
                    }
                    break;
                case 2:
                    list.tampil();
                    break;
                case 3:
                    list.SortingASC();
                    list.tampil();
                    break;
                case 4:
                    list.SortingDSC();
                    list.tampil();
                    break;
                default:
                    break;
            }
        }
    }
}
