package P7;

import java.util.Arrays;
import java.util.Comparator;

public class pencarianBuku26 {
    Buku26 listBK[] = new Buku26[5];
    int idx;

    void tambah(Buku26 m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            Buku26 m = listBK[i];
            m.tampilDataBuku();
        }
    }

    public int findSeqsearch(String cari) {
        int posisi = -1;
        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i].kodeBuku.equals(cari)) { // diubah menggunakan equals untuk membandingkan string
                posisi = i; // Mengatur posisi saat buku ditemukan
                break; // Keluar dari loop setelah buku ditemukan
            }
        }
        return posisi;
    }

    public void Tampilposisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public void TampilkanData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku \t: " + x);
            System.out.println("Judul \t\t: " + listBK[pos].judulBuku);
            System.out.println("Tahun Terbit \t: " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang \t: " + listBK[pos].Pengarang);
            System.out.println("Stock \t\t: " + listBK[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public Buku26 Findbuku(String cari) {
        int posisi = 0;
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].kodeBuku.equals(cari)) {
                break;
            }
        }
        return listBK[posisi];
    }

    // percobaan 2
    public int findBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari.equals(listBK[mid].kodeBuku)) {
                return mid;
            } else {
                int posisiKiri = findBinarySearch(cari, left, mid - 1);
                int posisiKanan = findBinarySearch(cari, mid + 1, right);
                if (posisiKanan != -1) {
                    return posisiKanan;
                } else if (posisiKiri != -1) {
                    return posisiKiri;
                }
            }
        }
        return -1;
    }

    public void sortBukuJudul() {
        Arrays.sort(listBK, 0, idx, Comparator.comparing(buku -> buku.judulBuku));
    }

    public int findBinarySearchJudul(String cari, int left, int right) {
        sortBukuJudul();

        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int compareResult = cari.compareTo(listBK[mid].judulBuku);
            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int findSeqSearchJudul(String cari) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (listBK[i].judulBuku.equalsIgnoreCase(cari)) {
                count++;
            }
        }
        return count;
    }
}