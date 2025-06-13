package Jobsheet12;

public class DoubleLinkedList {

    Node01 head, tail;
    int size = 0;

    public DoubleLinkedList(Node01 head, Node01 tail) {
        this.head = null;
        this.tail = null;
    }

    public DoubleLinkedList() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;

        while (current != null && !current.data.nama.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void add(int index, Mahasiswa01 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node01 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node01 ndBaru = new Node01(input);
            temp.next = ndBaru;
            ndBaru.prev = temp;
            if (temp.next.next == null) {
                tail = temp.next;
            }
            size++;
        }
    }

    public void print() {
        Node01 current = head;
        if (current == null) {
            System.out.println("Linked List Masih Kosong");
        } else {
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void getData(int index) {
        Node01 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampil();
    }

    public void getFirst(){
        head.data.tampil();
    }

    public void getLast(){
        tail.data.tampil();
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println(" Linked List masih Kosong, tidak dapat dihapus!");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }

    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size = 0;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data sudah dihapus. Data yang terhapus adalah: ");

        tail.data.tampil();
    }

    public void removeAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;

        while (current != null && !current.data.nama.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        if (current == head) {
            removeFirst();
        } else if (current == tail) {
            removeLast();
        } else {
            current = current.prev;
            current.next = current.next.next;
            current.next.prev = current;
        }
        size--;

        System.out.println("Node berhasil Dihapus setelah NIM " + keyNim);
    }

    public void removeAtIndex(int index) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node01 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            if (temp.next.next == null) {
                tail = temp.next;
            }
            size--;
        }
    }

    public Node01 search(String nim) {
        Node01 tmp = head;
        while (tmp != null) {
            if (tmp.data.nim.equals(nim)) {
                return tmp;
            }
            tmp = tmp.next;
        }
        return null;
    }

    public int getSize(){
        return size;
    }

}
