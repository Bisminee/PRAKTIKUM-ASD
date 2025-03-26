
public class SortingMain07 {

    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting07 dataUrut1 = new Sorting07(a, a.length);
        int b[] = {30, 20, 2, 8, 14};
        Sorting07 dataUrut2 = new Sorting07(b, b.length);
        int c[] = {40, 10, 4, 9, 3};
        Sorting07 dataUrut3 = new Sorting07(c, c.length);

        System.out.println("\nData Awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();

        System.out.println("\nData Awal 2");
        dataUrut2.tampil();
        dataUrut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataUrut2.tampil();

        System.out.println("\nData Awal 3");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataUrut3.tampil();
    }
}
