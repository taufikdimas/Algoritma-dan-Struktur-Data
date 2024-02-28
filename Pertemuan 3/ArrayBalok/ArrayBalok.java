package ArrayBalok;

public class ArrayBalok {

    public static void main(String[] args) {
        Balok_26 blArray[] = new Balok_26[3];

        for (int i = 0; i < 3; i++) {
            blArray[i] = new Balok_26(100, 30, 12);
        }

        // blArray[0] = new Balok_26(100, 30, 12);
        // blArray[1] = new Balok_26(120, 40, 15);
        // blArray[2] = new Balok_26(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume Balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }

}
