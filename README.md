# Program Perpustakaan Berbasis OOP (Java)

## Deskripsi Program

Program ini merupakan implementasi sederhana dari sistem perpustakaan yang dibuat menggunakan konsep **Object Oriented Programming (OOP)** pada bahasa pemrograman Java. Program ini digunakan untuk merepresentasikan data buku yang ada di perpustakaan dengan memanfaatkan beberapa class seperti **Buku, Penulis, dan Kategori**.

Setiap objek buku memiliki atribut seperti judul, kategori, penulis, tahun terbit, dan sinopsis. Program ini juga dilengkapi dengan beberapa method tambahan untuk menghitung jumlah kata pada sinopsis, mengecek tingkat kesamaan antara dua buku, menyalin objek buku, membaca data buku dari file, menyimpan data buku ke file, serta menghitung royalti penjualan buku.

Program ini dibuat sebagai bagian dari praktikum pemrograman berorientasi objek untuk memahami penerapan konsep **class, object, constructor, method, method overloading, serta file handling pada Java**.

## Struktur Class

Program ini terdiri dari beberapa class utama, yaitu:

### 1. Class Penulis

Class ini merepresentasikan penulis dari sebuah buku.
Atribut utama:

* `nama` : menyimpan nama penulis.

Method yang tersedia:

* `getNama()` : mengembalikan nama penulis.

### 2. Class Kategori

Class ini digunakan untuk merepresentasikan kategori dari sebuah buku.

Atribut utama:

* `nama` : menyimpan nama kategori buku.

Method yang tersedia:

* `getNama()` : mengembalikan nama kategori.

### 3. Class Buku

Class ini merupakan class utama yang menyimpan informasi buku.

Atribut yang dimiliki:

* `judul` : judul buku
* `kategori` : kategori buku
* `penulis` : daftar penulis buku
* `tahun` : tahun terbit buku
* `sinopsis` : ringkasan isi buku

Method yang tersedia:

* `hitungJumlahKata()` : menghitung jumlah kata pada sinopsis.
* `cekKesamaan(Buku bukuLain)` : menghitung tingkat kesamaan antara dua objek buku dalam bentuk persentase.
* `copy()` : membuat salinan objek buku dengan nilai atribut yang sama.
* `tampilkanInfo()` : menampilkan informasi lengkap buku.
* `simpanFile(String namaFile)` : menyimpan data buku ke dalam file teks.
* `bacaFile(String pathFile)` : membaca data buku dari file teks.
* `hitungRoyalti(double hargaBuku)` : menghitung royalti sebesar 10% dari harga buku.
* `hitungRoyalti(double hargaBuku, double persen)` : menghitung royalti berdasarkan persentase yang ditentukan.

### 4. Class Main

Class ini berfungsi sebagai tempat menjalankan program.
Di dalam class ini dilakukan pembuatan objek buku, menampilkan informasi buku, mengecek kesamaan buku, menyalin objek buku, menyimpan data ke file, membaca data dari file, serta menghitung royalti buku.

## Contoh Output Program

Berikut contoh output yang dihasilkan saat program dijalankan:

Data Buku 1
Judul Buku : Java Dasar
Kategori : Teknologi
Penulis : Budi
Tahun Terbit : 2020
Sinopsis : Buku ini menjelaskan dasar dasar pemrograman Java mulai dari variabel hingga konsep objek
Jumlah kata sinopsis : 13

Kesamaan buku : 50.0%

Data buku hasil copy
Judul Buku : Java Dasar
Kategori : Teknologi
Penulis : Budi
Tahun Terbit : 2020
Sinopsis : Buku ini menjelaskan dasar dasar pemrograman Java mulai dari variabel hingga konsep objek
Jumlah kata sinopsis : 13

Data berhasil disimpan ke file
Data berhasil dibaca dari file

Royalti 10% : 10000.0
Royalti 15% : 15000.0

## Konsep yang Digunakan

Program ini menerapkan beberapa konsep penting dalam pemrograman berorientasi objek, yaitu:

* **Encapsulation** – atribut pada class dibuat private dan diakses melalui method.
* **Object dan Class** – setiap data direpresentasikan dalam bentuk objek.
* **Constructor** – digunakan untuk menginisialisasi atribut objek.
* **Method Overloading** – digunakan pada method `hitungRoyalti`.
* **File Handling** – digunakan untuk membaca dan menyimpan data buku dalam file teks.
* **Object Copy** – digunakan untuk membuat salinan objek buku.

## Kesimpulan

Program perpustakaan ini menunjukkan bagaimana konsep OOP dapat digunakan untuk memodelkan objek dunia nyata dalam bentuk program. Dengan memanfaatkan class dan method yang terstruktur, data buku dapat dikelola dengan lebih rapi dan mudah dikembangkan. Program ini juga memperkenalkan penggunaan file untuk menyimpan dan membaca data serta perhitungan tambahan seperti royalti penjualan buku.

