package LatihanPratikum;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService(5);
        hotelService.tambah(new Hotel("A", "Jakarta  ", 580000, (byte) 4));
        hotelService.tambah(new Hotel("B", "Surabaya ", 400000, (byte) 3));
        hotelService.tambah(new Hotel("C", "Bali     ", 600000, (byte) 5));
        hotelService.tambah(new Hotel("D", "Malang   ", 450000, (byte) 2));
        hotelService.tambah(new Hotel("E", "Blitar   ", 750000, (byte) 1));

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nPilih opsi sorting:");
            System.out.println("1. Harga (dari termurah ke termahal)");
            System.out.println("2. Rating bintang (dari tertinggi ke terendah)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // hotelService.bubbleSortHarga();
                    hotelService.selectionSortHarga();
                    hotelService.tampilAll();
                    break;
                case 2:
                    // hotelService.selectionSortRating();
                    hotelService.bubbleSortRating();
                    hotelService.tampilAll();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
