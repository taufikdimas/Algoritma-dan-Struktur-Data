package UTS;

import java.util.Arrays;

public class UTSClass26 {
    private int[] data;
    private int[] ascendingSorting;
    private int[] descendingSorting;

    public UTSClass26(int[] data) {
        this.data = Arrays.copyOf(data, data.length);
        ascendingSorting = Arrays.copyOf(data, data.length);
        descendingSorting = Arrays.copyOf(data, data.length);
    }

    public int[] Data() {
        return data;
    }

    public int[] AscendingSorting() {
        return ascendingSorting;
    }

    public int[] DescendingSorting() {
        return descendingSorting;
    }
}
