package Jobsheet12;

public class DoubleLinkedList {

    Node01 head, tail;

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

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        Node01 current = head;
        if(current == null){
            System.out.println("Linked List Masih Kosong");
        } else{
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
        
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println(" Linked List masih Kosong, tidak dapat dihapus!");
            return;
        } 
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
            return;
        } 
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data sudah dihapus. Data yang terhapus adalah: ");
        tail.data.tampil();
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

}
