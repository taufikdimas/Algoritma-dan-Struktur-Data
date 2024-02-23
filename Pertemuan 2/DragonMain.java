import java.util.Scanner;

public class DragonMain {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        Dragon27 playerTaufik = new Dragon27(0, 0, 10, 10);

        while (true) {
            // Cetak posisi dragon
            playerTaufik.printPosition();

            System.out.println("Pilih arah gerakan: ");
            System.out.println("1. Kiri");
            System.out.println("2. Kanan");
            System.out.println("3. Atas");
            System.out.println("4. Bawah");

            // Baca input
            int choice = sc27.nextInt();

            // Gerakan dragon berdasarkan input
            switch (choice) {
                case 1:
                    playerTaufik.moveLeft();
                    break;
                case 2:
                    playerTaufik.moveRight();
                    break;
                case 3:
                    playerTaufik.moveUp();
                    break;
                case 4:
                    playerTaufik.moveDown();
                default:
                    System.out.println("Input tidak valid.");
            }
        }
    }
}
