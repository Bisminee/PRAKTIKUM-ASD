
public class AntrianLayanan {

    Mahasiswa data[];
    int front, rear;
    DPA dosen = new DPA(data, front);
    int size; //data yang sudah masuk
    int max; //ukuran Queue

    public AntrianLayanan(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = - 1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihat2Terdepan() {
        if (!IsEmpty()) {
            if (data[front + 1].nama != null) {
                System.out.println("Mahasiswa terdepan: ");
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[front].tampilkanData();
                data[front + 1].tampilkanData();
            } else {
                System.out.println("Mahasiswa terdepan: ");
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[front].tampilkanData();
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void lihatTerakhir() {
        if (!IsEmpty()) {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        }
        System.out.println("Daftar mahasiswa dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void clear() {
        if (IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil diosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa layaniMahasiswa() {
        Mahasiswa mhs;
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        }
        mhs = data[front];
        dosen.menerima(mhs);
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    public Mahasiswa layaniMahasiswa2() {
        Mahasiswa mhs;
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        }
        mhs = data[front+1];
        dosen.menerima(mhs);
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public int sudahDilayani(int count){ 
        count =+  2;
        return count;
    }
}
