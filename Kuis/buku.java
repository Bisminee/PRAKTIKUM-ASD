class buku07{
    public String judul07;
    public String penulis07;
    public double harga07;
    public int tahunTerbit07;

    public buku07(String judul07, String penulis07, double harga07, int tahunTerbit07){
        this.judul07 = judul07;
        this.penulis07 = penulis07;
        this.harga07 = harga07;
        this. tahunTerbit07 = tahunTerbit07;
    }

    public buku07(){

    }

    void tampilkanInformasi(){
            System.out.println("Judul           : " + this.judul07);
            System.out.println("Nama Penulis    : " + this.penulis07);
            System.out.println("Harga Buku      : " + this.harga07);
            System.out.println("Tahun terbit    : " + this.tahunTerbit07);
            System.out.println();
        
    }

    double hitungHargaDiskon(double harga07){
        int sekarang07 = 2025;
        int tahun07 = sekarang07 - tahunTerbit07;
        double x = 0;

        return x;
    }

}