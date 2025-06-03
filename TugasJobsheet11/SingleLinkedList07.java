package TugasJobsheet11;

public class SingleLinkedList07 {

    NodeMahasiswa07 head;
    NodeMahasiswa07 tail;
    int size = 0, max = 10;

    boolean isEmpty() {
        return (head == null);
    }

    boolean isFull() {
        return (size >= max);
    }

    int count(){
        return size;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa07 tmp = head;
            System.out.println("\nIsi Linked List");
            while (tmp != null) {
                tmp.data.tampilIformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("\nLinked List kosong");
        }
    }

    public void printFirst(){
        if (!isEmpty()) {
            System.out.println("\nIsi Linked List depan:");
            head.data.tampilIformasi();
        } else {
            System.out.println("\nLinked List kosong");
        }
    }

        public void printLast(){
        if (!isEmpty()) {
            System.out.println("\nIsi Linked List depan:");
            tail.data.tampilIformasi();;
        } else {
            System.out.println("\nLinked List kosong");
        }
    }

    public void add(Mahasiswa07 input) {
        if (isFull()) {
            System.out.println("\nLinked List Penuh broo");
        } else {
            NodeMahasiswa07 ndInput = new NodeMahasiswa07(input, null);
            if (isEmpty()) {
                head = ndInput;
                tail = ndInput;
                size++;
            } else {
                tail.next = ndInput;
                tail = ndInput;
                size++;
            }
        }
    }

    public void dequeueFirst() {
        if (isEmpty()) {
            System.out.println(" Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head.data.tampilIformasi();
            head = tail = null;
            size--;
        } else {
            head.data.tampilIformasi();
            head = head.next;
            size--;
        }
    }

    public void clear(){
        head = tail = null;
        size = 0;
    }
}
