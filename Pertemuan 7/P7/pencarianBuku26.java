package P7;

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

    public int FindSeqsearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public void TampilkanData(int x, int pos) {
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

    // percobaan 2
    public int FindBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listBK[mid].kodeBuku == cari) {
                return mid;
            }
            if (listBK[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            }
            return FindBinarySearch(cari, mid + 1, right);
        }
        return -1;
    }

}
