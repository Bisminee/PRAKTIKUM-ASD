public class SortingMain07 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting07 dataUrut1 = new Sorting07(a, a.length);

        System.out.println("Data Awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();
    }
}
