package UTS;

import java.util.Arrays;

public class UTSMain26 {

    public static void main(String[] args) {
        int[] data = { 31, 45, 15, 2, 9, 30, 32, 37, 36, 7, 48, 13, 3, 48, 28, 0, 44 };

        UTSClass26 UTSAlsd = new UTSClass26(data);

        System.out.println("Data awal : " + Arrays.toString(data));

        // Sorting ascending
        int[] ascendingData = UTSAlsd.AscendingSorting();
        UTS26.selectionSortAsc(ascendingData);
        System.out.println("Sorted data (ascending) : " + Arrays.toString(ascendingData));

        // Sorting descending
        int[] descendingData = UTSAlsd.DescendingSorting();
        UTS26.selectionSortDesc(descendingData);
        System.out.println("Sorted data (descending): " + Arrays.toString(descendingData));

        int key1 = 30; // Nilai sebelum sorting
        int key2 = 30; // Nilai setelah ascending sorting
        int key3 = 30; // Nilai setelah descending sorting
        int key4 = 26; // Nilai tidak ditemukan

        int[] dataAwal = UTSAlsd.Data();
        System.out.println("Index " + key1 + " sebelum sorting : " + UTS26.binarySearch(dataAwal, key1));
        System.out.println(
                "Index " + key2 + " setelah ascending sorting  : " + UTS26.binarySearch(ascendingData, key2));
        System.out.println(
                "Index " + key3 + " setelah descending sorting : " + UTS26.binarySearch(descendingData, key3));
        System.out.println("Nilai " + key4 + " tidak ditemukan : " + UTS26.binarySearch(dataAwal, key4));
    }
}
