
import java.util.Scanner;

public class MahasiswaDemo07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa07 stack = new StackTugasMahasiswa07(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Hitung Tugas Terkumpul");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa07 mhs = new Mahasiswa07(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa07 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai(0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa07 lihat = stack.peek();
                    Mahasiswa07 lihatBott = stack.peekBott();
                    if (lihat != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihatBott.nama);
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    System.out.println("Jumlah tugas terkumpul: " + stack.HitungTugas());
                    break;
                default:
                    throw new AssertionError();
            }
        } while (pilih >= 1 && pilih <= 5);
    }
}
