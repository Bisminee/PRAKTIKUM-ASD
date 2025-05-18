
public class StackKonversi {

    int tumpukanBiner[];
    int size, top;

    public StackKonversi() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if (!isFull()) {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
