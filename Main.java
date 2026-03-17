package Perpustakaan;

public class Main {

    public static void main(String[] args) {

        Penulis p1 = new Penulis("Budi");

        Kategori teknologi = new Kategori("Teknologi");

        Buku buku1 = new Buku(
            "Java Dasar",
            teknologi,
            2020,
            new Penulis[]{p1},
            "Buku ini menjelaskan dasar dasar pemrograman Java mulai dari variabel hingga konsep objek"
        );

        Buku buku2 = new Buku(
            "Java Lanjutan",
            teknologi,
            2020,
            new Penulis[]{p1},
            "Buku ini membahas konsep lanjutan Java seperti OOP koleksi dan pengelolaan data"
        );

        System.out.println("Data Buku 1:");
        buku1.tampilkanInfo();

        System.out.println("Kesamaan buku : " + buku1.cekKesamaan(buku2) + "%");

        Buku copyBuku = buku1.copy();

        System.out.println("\nData buku hasil copy:");
        copyBuku.tampilkanInfo();

        buku1.simpanFile("dataBuku.txt");

        buku1.bacaFile("dataBuku.txt");

        int harga = 100000;

        System.out.println("\nHarga buku  : " + harga);
        System.out.println("Royalti 10% : " + buku1.hitungRoyalti(harga));
        System.out.println("Royalti 15% : " + buku1.hitungRoyalti(harga, 15));
    }
}
    