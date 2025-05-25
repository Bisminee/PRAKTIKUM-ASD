
public class DPA {

    Mahasiswa ditampung[] = new Mahasiswa[30];
    String nip, nama, kode;

    public DPA() {
        this.nip = "2121212";
        this.nama = "Bisma";
        this.kode = "123";

    }

    public void menerima(Mahasiswa ditampung) {
        for (int i = 0; i < this.ditampung.length; i++) {
            if (this.ditampung[i].nama != null) {
                if (i >= 30) {
                    System.out.println("Data DPA " + this.nama + " sudah penuh");
                }
            }
            if (this.ditampung[i].nama == null) {
                this.ditampung[i] = ditampung;
            }
        }
    }
}
