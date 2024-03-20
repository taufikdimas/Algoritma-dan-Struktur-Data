package LatihanPratikum;

public class HotelService_26 {
    private Hotel_26[] rooms;
    private int size;

    public HotelService_26(int kapasitas) {
        rooms = new Hotel_26[kapasitas];
        size = 0;
    }

    public void tambah(Hotel_26 H) {
        if (size < rooms.length) {
            rooms[size++] = H;
        } else {
            System.out.println("penuh");
        }
    }

    public void tampilAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(rooms[i]);
        }
    }

    // sorting harga (bubble sort)
    public void bubbleSortHarga() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (rooms[j].getHarga() > rooms[j + 1].getHarga()) {
                    // swap
                    Hotel_26 temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    // sorting harga (selection sort)
    public void selectionSortHarga() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (rooms[j].getHarga() < rooms[minIndex].getHarga()) {
                    minIndex = j;
                }
            }
            // swap
            Hotel_26 temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }

    // sorting Rating (selection sort)
    public void selectionSortRating() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (rooms[j].getBintang() > rooms[minIndex].getBintang()) {
                    minIndex = j;
                }
            }
            // swap
            Hotel_26 temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }

    // sorting Rating (bubble sort)
    public void bubbleSortRating() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (rooms[j].getBintang() < rooms[j + 1].getBintang()) {
                    // swap
                    Hotel_26 temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }
}
