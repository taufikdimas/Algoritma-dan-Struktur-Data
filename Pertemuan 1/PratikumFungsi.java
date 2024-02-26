import java.util.Scanner;

public class PratikumFungsi {
    public static void main(String[] args) {
        int[][] stok = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };
        int[] harga = { 75000, 50000, 60000, 10000 };
        String[] bunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Lihat Pendapatan Cabang");
            System.out.println("2. Lihat Stok Bunga per Cabang");
            System.out.println("3. Perbarui Stok");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int totalPendapatan = hitungPendapatan(stok, harga);
                    System.out.println("Total pendapatan dari semua cabang: " + totalPendapatan);
                    break;
                case 2:
                    System.out.print("Masukkan nomor cabang (1-4): ");
                    int stokBunga = scanner.nextInt();
                    tampilkanStok(stok, bunga, stokBunga);
                    break;
                case 3:
                    System.out.print("Masukkan nomor cabang untuk diperbarui (1-4): ");
                    int perbaruiStok = scanner.nextInt();
                    updateStok(stok, bunga, scanner, perbaruiStok);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    public static int hitungPendapatan(int[][] stock, int[] prices) {
        int totalPendapatan = 0;
        for (int i = 0; i < stock.length; i++) {
            int branchPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                branchPendapatan += stock[i][j] * prices[j];
            }
            totalPendapatan += branchPendapatan;
            System.out.println("Pendapatan cabang " + (i + 1) + ": " + branchPendapatan);
        }
        return totalPendapatan;
    }

    public static void tampilkanStok(int[][] stok, String[] bunga, int tampilkanStok) {
        System.out.println("Stok bunga pada cabang " + tampilkanStok + ":");
        for (int j = 0; j < stok[tampilkanStok - 1].length; j++) {
            System.out.println(bunga[j] + ": " + stok[tampilkanStok - 1][j]);
        }
    }

    public static void updateStok(int[][] stok, String[] bunga, Scanner scanner, int perbaruiStok) {
        System.out.println("Perbarui Stok untuk Cabang " + perbaruiStok + ":");
        for (int j = 0; j < stok[perbaruiStok - 1].length; j++) {
            System.out.print("Masukkan jumlah stok " + bunga[j] + ": ");
            stok[perbaruiStok - 1][j] = scanner.nextInt();
        }
        System.out.println("Stok berhasil diperbarui untuk Cabang " + perbaruiStok + "!");
    }

}
