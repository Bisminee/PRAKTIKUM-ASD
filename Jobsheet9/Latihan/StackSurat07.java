public class StackSurat07 {
    
    Surat07 stack[];
    int size;
    int top;

    public StackSurat07(int size) {
        this.size = size;
        stack = new Surat07[size];
        top = -1;
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

    public void push(Surat07 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat07 pop() {
        if (!isEmpty()) {
            Surat07 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diverifikasi.");
            return null;
        }
    }

    public Surat07 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    public Surat07 cariSurat(String namaMahasiswa) {
        Surat07 balikan = null;
        for (int i = top; i >= 0; i--) {
            if(namaMahasiswa.equalsIgnoreCase(stack[i].namaMahasiswa)){
                balikan = stack[i];
            } else {
                balikan = null;
            }
        }
        return balikan;
    }

}
