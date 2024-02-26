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



