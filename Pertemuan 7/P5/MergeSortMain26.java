package P5;

public class MergeSortMain26 {
    public static void main(String[] args) {
        MergeSorting26 mergeSort = new MergeSorting26();

        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("Sorting dengan merge sort");
        System.out.println("Data Awal");
        mergeSort.printArray(data);
        mergeSort.mergeSort(data);
        System.out.println("Setelah Diurutkan");
        mergeSort.printArray(data);

    }
}
