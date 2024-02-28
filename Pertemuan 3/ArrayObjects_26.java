// import java.util.Scanner;

// public class ArrayObjects_26 {
//     public static void main(String[] args) {
//         PersegiPanjang_26[] ppArray = new PersegiPanjang_26[3];
//         Scanner sc = new Scanner(System.in);

//         for (int i = 0; i < 3; i++) {
//             ppArray[i] = new PersegiPanjang_26();
//             System.out.println("Persegi Panjang ke-" + i);
//             System.out.print("Masukkan panjang: ");
//             ppArray[i].panjang = sc.nextInt();
//             System.out.print("Masukkan lebar: ");
//             ppArray[i].lebar = sc.nextInt();
//         }

//         for (int i = 0; i < 3; i++) {
//             System.out.println("Persegi Panjang ke-" + i);
//             System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
//         }
//Jobhseet Percobaan 1
//         // ppArray[0] = new PersegiPanjang_26();
//         // ppArray[0].panjang = 110;
//         // ppArray[0].lebar = 30;

//         // ppArray[1] = new PersegiPanjang_26();
//         // ppArray[1].panjang = 80;
//         // ppArray[1].lebar = 40;

//         // ppArray[2] = new PersegiPanjang_26();
//         // ppArray[2].panjang = 100;
//         // ppArray[2].lebar = 20;

//         // System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang +
//         // ", lebar: " + ppArray[0].lebar);
//         // System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang +
//         // ", lebar: " + ppArray[1].lebar);
//         // System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang +
//         // ", lebar: " + ppArray[2].lebar);
//     }
// }

import java.util.Scanner;

public class ArrayObjects_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input panjang array
        System.out.print("Masukkan jumlah Persegi Panjang : ");
        PersegiPanjang_26[] ppArray = new PersegiPanjang_26[sc.nextInt()];

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang_26();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan Panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", Lebar : " + ppArray[i].lebar);
        }
    }
}
