# <p align="center">JOBSHEET I - KONSEP DASAR PEMROGRAMAN</p>

<br><br>

<p align="center">
 
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/82948574-8b73-4e17-be0a-4fd3d9c857bf)



</p>

<br><br>

<p align="center">
    Nama : Taufik Dimas Edystara <br>
    NIM : 2341720062 <br>
    Kelas : TI-1B <br>
    Prodi : D4 Teknik Informatika
</p>

***

## Pemilihan
### **2.2.1 Praktikum Pemilihan**
```java
import java.util.Scanner;

public class PratikumPemilihan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        // Input nilai
        System.out.print("Masukkan nilai tugas : ");
        int nilaiTugas = scanner.nextInt();
        System.out.print("Masukkan nilai kuis  : ");
        int nilaiKuis = scanner.nextInt();
        System.out.print("Masukkan nilai UTS   : ");
        int nilaiUTS = scanner.nextInt();
        System.out.print("Masukkan nilai UAS   : ");
        int nilaiUAS = scanner.nextInt();
        System.out.println("===============================");
        System.out.println("===============================");

        // Validasi nilai

        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUTS > 100 || nilaiUAS > 100 || nilaiTugas < 0 || nilaiKuis < 0
                || nilaiUTS < 0 || nilaiUAS < 0) {
            System.out.println("Nilai tidak valid!");
            System.out.println("===============================");
            System.out.println("===============================");

            return;

        }

        // Hitung Nilai
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        // Konversi nilai ke huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 55) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 45) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // Output

        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);

        // Keterangan lulus/tidak lulus
        String keterangan;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
                nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("Keterangan: " + keterangan);

    }
}

```
### **2.2.2 Hasil Percobaan**
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/3eee0177-d799-4c88-84e2-61936038fca5)

``Jika nilai lebih besar dari ketentuan``<br>

![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/1206bfe6-ba65-4b76-9dc3-02f5ab57d321)


## Perulangan
### **2.3.1 Praktikum Perulangan**
```java
import java.util.Scanner;

public class PratikumPerulangan {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = sc27.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
```
### **2.3.2 Hasil Percobaan**

![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/4e805ca3-8ea3-478e-9670-0f5becca10d0)

## Array
### **2.4.1 Praktikum Array**
```java
import java.util.Scanner;

public class PratikumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // deklarasi variabel
        String[] namaMatakuliah = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        int[] nilaiAngka = new int[8];
        String[] nilaiHuruf = new String[nilaiAngka.length];
        double[] nilaiSetara = new double[nilaiAngka.length];
        int[] bobotSKS = { 2, 3, 3, 3, 2, 3, 2, 2 }; // SKS (contoh)

        // Input nilai matkul
        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.print("Masukkan nilai angka untuk mata kuliah " + namaMatakuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextInt();

            // konversi nilai
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
        }

        // hitung ip
        double totalSKS = 0;
        double totalBobotSKS = 0;
        for (int i = 0; i < bobotSKS.length; i++) {
            totalSKS += bobotSKS[i];
            totalBobotSKS += bobotSKS[i] * nilaiSetara[i];
        }

        double ipSemester = totalBobotSKS / totalSKS;

        System.out.println("=====================================================================================");
        System.out.println("| Mata Kuliah                            | Nilai Angka | Nilai Huruf | Nilai Setara |");
        System.out.println("=====================================================================================");
        for (int i = 0; i < namaMatakuliah.length; i++) {
            System.out.printf("| %-38s | %-11d | %-11s | %-12.2f |\n", namaMatakuliah[i], nilaiAngka[i], nilaiHuruf[i],
                    nilaiSetara[i]);
        }
        System.out.println("=====================================================================================");

        System.out.println("IP Semester : " + ipSemester);

        scanner.close();

    }
}

```

### **2.4.2 Hasil Percobaan**
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/ad6900b5-56fa-4758-bcc8-38cb5a999f9e)

## Fungsi
### **2.5.1 Praktikum Fungsi**
```java
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

```

### **2.5.2 Hasil Percobaan**
`` 1. menampilkan pendapatan setiap cabang jika semua bunga habis terjual.`` <br>

![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/38c3e5eb-6185-4fe2-a4a5-2e831bb68092) <br>
`` 2.a  fungsi untuk mengetahui jumlah Stock setiap jenis bunga pada cabang royalgarden 4`` <br> 

![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/14763a15-b2c2-423c-88a6-e6604283aba5) <br>

`` 2.b Jika terdapat informasi tambahan berupa pengurangan stock karena bunga tersebut mati.Dengan rincian Aglonema -1, Keladi -2, Alocasia -0, Mawar -5.`` <br>

![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/6d6e70f0-71ee-4092-9806-f09f67e8839e) <br>



## Tugas
### **3.1 Pertanyaan**
`` Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array pertama adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array dua dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil. Ketika pengguna memberikan input kode plat nomor maka program akan mengeluarkan nama kota dari kode plat nomor tersebut.
 ``


### **3.1.1 Kode Percobaan**
```java
import java.util.Scanner;

public class Tugas1_27 {
    public static void main(String[] args) {
        // Array kode plat mobil
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        // Array nama kota
        String[][] KOTA = {
                { "B", "A", "N", "T", "E", "N" },
                { "J", "A", "K", "A", "R", "T", "A" },
                { "B", "A", "N", "D", "U", "N", "G" },
                { "C", "I", "R", "E", "B", "O", "N" },
                { "B", "O", "G", "O", "R" },
                { "P", "E", "K", "A", "L", "O", "N", "G", "A", "N" },
                { "S", "E", "M", "A", "R", "A", "N", "G" },
                { "S", "U", "R", "A", "B", "A", "Y", "A" },
                { "M", "A", "L", "A", "N", "G" },
                { "T", "E", "G", "A", "L" }
        };

        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        char kode = sc27.next().charAt(0);
        sc27.close();

        // mencari nama kota berdasarkan kode plat mobil
        int kodeIndex = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                kodeIndex = i;
                break;
            }
        }

        // menampilkan kota sesuai kode plat
        if (kodeIndex != -1) {
            for (int j = 0; j < KOTA[kodeIndex].length; j++) {
                System.out.print(KOTA[kodeIndex][j]);
            }
        } else {
            System.out.println("Kode plat mobil tidak valid.");
        }
    }
}

```

### **3.1.2 Hasil Percobaan**

![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/f56eb4c1-686a-436c-af81-f3b09977ba3c)



