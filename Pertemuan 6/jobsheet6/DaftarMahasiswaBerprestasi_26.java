
package jobsheet6;

public class DaftarMahasiswaBerprestasi_26 {
    Mahasiswa_26 listMhs[] = new Mahasiswa_26[5];
    int idx;

    // method tambah()
    void tambah(Mahasiswa_26 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // method tampil()
    void tampil() {
        for (Mahasiswa_26 m : listMhs) {
            m.tampil();
            System.out.println("===========================");
        }
    }

    // method bubbleSort()
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - i - 1; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    Mahasiswa_26 tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }

    // method selectionSort()
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa_26 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // method insertionSort()
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa_26 tmp = listMhs[i];
            int j = i;
            while ((j > 0) && (listMhs[j - 1].ipk < tmp.ipk)) { // ubah kondisi perbandiangan menjadi <
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }
}
