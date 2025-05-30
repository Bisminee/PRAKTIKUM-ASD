package Jobsheet11;

public class SLLMain07 {
    public static void main(String[] args) {
        SingleLinkedList07 sll = new SingleLinkedList07();
        Mahasiswa07 mhs1 = new Mahasiswa07("244107020216", "Bisma","1B", 3.7);
        Mahasiswa07 mhs2 = new Mahasiswa07("234107020216", "Agatha","2B", 3.1);
        Mahasiswa07 mhs3 = new Mahasiswa07("224107020216", "Aksa","3B", 2.7);
        Mahasiswa07 mhs4 = new Mahasiswa07("214107020216", "Samudra","4B", 4);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Samudra", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    
    }
}
