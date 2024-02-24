# Jobsheet 02 - Object

**Nama  :** Taufik Dimas Edystara<br>
**NIM   :** 2341720062<br>
**Kelas :** TI-1B<br>
**Absen :** 27

## Pratikum

### 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method

### 2.1.2 Verifikasi Hasil Percobaan
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/ecaca441-5d0b-4cf6-93c1-64fdfd7d374b)
### 2.1.3 Pertanyaan
1. Sebutkan dua karakteristik class atau object!<br>
=> Encapsulation = karakteristik ini menyembunyikan atau memproteksi suatu proses dari kemungkinan interferensi atau penyalahgunaan dari luar sistem dan sekaligus menyederhanakan penggunaan sistem tersebut. contoh menyembunyikan variabel anggota (judul, stok, harga) dengan akses modifier default dan hanya dapat diakses dengan metode public seperti (terjual(), restock() )<br>
=> Inheritance = karakteristik ini mewariskan attribute dan method yang dimiliki oleh sebuah class kepada class turunannya. 
3. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
Buku? Sebutkan apa saja atributnya!<br>
=> terdapat 5 atribut yauti judul, pengarang, halaman, stok, harga
4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!<br>
=> Terdapat 4 method pada class tersebut yaitu tampilInformasi(), terjual(int jml), restock(int jml), gantiHarga(int hrg)
5. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut
sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!<br>
=> ![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/75975459-e6c8-4a91-b13f-0d74997e2811)
7. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?<br>
=> Method restock() memiliki satu parameter berupa bilangan bulat agar kita dapat dengan mudah menentukan jumlah buku yang akan ditambahkan ke stok tanpa perlu mengubah kode method setiap kali restok dilakukan.
### 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
### 2.2.2 Verifikasi Hasil Percobaan
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/814b5a1a-9f64-4a8d-a6ed-80f96412b6e4)
### 2.2.3 Pertanyaan
1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi!
Apa nama object yang dihasilkan?<br>
=>  Buku27 bk1 = new Buku27(); <br>
=> menghasilkan object bk1
3. Bagaimana cara mengakses atribut dan method dari suatu objek?<br>
=> dengan menuliskan nama object lalu ditambahkan titik dan ditambahkan atribut yang ingin diakses
4. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?,<br>
=> Output dari pemanggilan method tampilInformasi() pertama dan kedua berbeda karena nilai atribut objek bk1 telah diubah di antara dua pemanggilan tersebut.

### 2.3 Percobaan 3: Membuat Konstruktor
### 2.3.2 Verifikasi Hasil Percobaan
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/b73c3ee2-2155-4f00-80dc-c2d0d1ac42ea)
### 2.3.3 Pertanyaan
1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter!<br>
=> ![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/fd9b4a44-bb61-4ade-a099-715ea1b30f9e)

2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?
   ![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/3f4d81b6-89ad-4eff-8b27-ff0add41d882)
   => Objek bk2 diinstansiasi dengan memberikan nilai atribut melalui konstruktor berparameter secara langsung.dalam baris kode tersebut  objek bk2 dibuat dengan menggunakan konstruktor berparameter yang langsung menerima nilai untuk judul, pengarang, jumlah halaman, stok, dan harga.

4. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana
hasilnya? Jelaskan mengapa hasilnya demikian!<br>
=> akan terjadi error, karena saat mencoba menginstansiasi objek bk1 tanpa parameter, akan terjadi kesalahan kompilasi karena tidak ada konstruktor default yang tersedia. Sehingga, hasilnya adalah kesalahan kompilasi saat mencoba menginstansiasi objek bk1.
5. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses
secara berurutan? Jelaskan alasannya!<br>
=> tidak harus berurutan, karena ruutan deklarasi method tidak mempengaruhi cara pemanggilan method pada objeknya. Sehingga dapat memanggil method sesuai kebutuhan, tidak terikat pada urutan deklarasi method di dalam class.
7. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor
berparameter dari class Buku!<br>
=> ![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/ae3315d1-211d-453b-bb3a-c8777ca411e9)


### 2.4 Latihan Praktikum
### 1. tambahkan tiga method yaitu hitungHargaTotal(),hitungDiskon(), dan hitungHargaBayar() pada class Buku<br>
=> Kode Program<br>
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/1248de99-1e36-47cd-9d7b-bc499aa21c33)<br>

=> Output<br> 
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/b92abbc9-2fd4-4f1a-98de-61ea65c4a12d)

### 2.
=> Kode Program<br>
![asd p2 t2](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/53f54234-66a2-41c0-b4f2-f7f074c75b87)

=> Output <br>
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/e1655994-9cf6-492b-8d8d-b752085493fb)




  


```
