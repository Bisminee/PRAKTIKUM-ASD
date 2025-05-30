package Jobsheet11;

public class SingleLinkedList07 {

    NodeMahasiswa07 head;
    NodeMahasiswa07 tail;

    boolean isEmpty() {
        return (head == null);
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

    public void addFirst(Mahasiswa07 input){
        NodeMahasiswa07 ndInput = new NodeMahasiswa07(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa07 input){
        NodeMahasiswa07 ndInput = new NodeMahasiswa07(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa07 input){
        NodeMahasiswa07 ndInput = new NodeMahasiswa07(input, null);
        NodeMahasiswa07 temp = head;
        do { 
            if(temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa07 input){
        if(index < 0){
            System.out.println("Indeks salah");
        } else if(index == 0){
            addFirst(input);
        }else{
            NodeMahasiswa07 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa07(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }
}
