
public class StackTugasMahasiswa07 {

    Mahasiswa07 stack[];
    int size;
    int top;
    int bottom;

    public StackTugasMahasiswa07(int size) {
        this.size = size;
        stack = new Mahasiswa07[size];
        top = -1;
        bottom = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa07 mhs) {
        if (!isFull()) {
            top++;
            bottom = 0;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa07 pop() {
        if (!isEmpty()) {
            Mahasiswa07 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa07 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa07 peekBott() {
        if (!isEmpty()) {
            return stack[bottom];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public int HitungTugas() {
        int count = 0;
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                count++;
            }
        }
        return count;
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi07 stack = new StackKonversi07();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while(!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
}
