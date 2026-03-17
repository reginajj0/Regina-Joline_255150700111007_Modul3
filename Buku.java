package Perpustakaan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buku {

    private String judul;
    private Kategori kategori;
    private int tahun;
    private Penulis[] penulis;
    private String sinopsis;

    //constructor semua atribut
    public Buku(String judul, Kategori kategori, int tahun, Penulis[] penulis, String sinopsis){
        this.judul = judul;
        this.kategori = kategori;
        this.tahun = tahun;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }

    public String getJudul(){
        return judul;
    }

    public String getSinopsis(){
        return sinopsis;
    }
    
    public Kategori getKategori(){
        return kategori;
    }

    //method hitung jumlah kata sinopsis
    public int hitungJumlahKata(){

        String[] kata = sinopsis.split(" ");
        return kata.length;

    }

    //method cek tingkat kesamaan
    public double cekKesamaan(Buku bukuLain){

        int sama = 0;
        int total = 4;

        if(this.judul.equalsIgnoreCase(bukuLain.judul)){
            sama++;
        }

        if(this.kategori.getNama().equalsIgnoreCase(bukuLain.kategori.getNama())){
            sama++;
        }

        if(this.tahun == bukuLain.tahun){
            sama++;
        }

        if(this.sinopsis.equalsIgnoreCase(bukuLain.sinopsis)){
            sama++;
        }

        return (sama * 100.0) / total;  

    }

    //method copy object
    public Buku copy(){

        return new Buku(
            
            this.judul,
            this.kategori,
            this.tahun,
            this.penulis,
            this.sinopsis
        );
    }

    //tampilkan data
    public void tampilkanInfo(){

        System.out.println("Judul Buku   : " + judul);
        System.out.println("Kategori     : " + kategori.getNama());

        System.out.print("Penulis      : ");

        for(int i = 0; i < penulis.length; i++){
            System.out.print(penulis[i].getNama());
            if(i < penulis.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println("\nTahun Terbit : " + tahun);
        System.out.println("Sinopsis     : " + sinopsis);
        System.out.println("Jumlah kata sinopsis : " + hitungJumlahKata());
        System.out.println("------------------------------");
    }

    //method simpan file
    public void simpanFile(String namaFile){

        try{

            FileWriter writer = new FileWriter(namaFile);

            writer.write(judul + ";");
            writer.write(kategori.getNama() + ";");

            for(int i = 0; i < penulis.length; i++){
                writer.write(penulis[i].getNama());
                if(i < penulis.length - 1){
                    writer.write(",");
                }
            }

            writer.write(";");
            writer.write(tahun + ";");
            writer.write(sinopsis);

            writer.close();

        System.out.println("Data berhasil disimpan ke file");

        }catch(IOException e){
            System.out.println("Terjadi kesalahan saat menyimpan file");
        }

    }


    //method baca file
    public void bacaFile(String pathFile){

        try{

            BufferedReader reader = new BufferedReader(new FileReader(pathFile));

            String data = reader.readLine();

            String[] bagian = data.split(";");

            this.judul = bagian[0];
            this.kategori = new Kategori(bagian[1]);

            String[] namaPenulis = bagian[2].split(",");
            Penulis[] p = new Penulis[namaPenulis.length];

            for(int i = 0; i < namaPenulis.length; i++){
                p[i] = new Penulis(namaPenulis[i]);
            }

            this.penulis = p;

            this.tahun = Integer.parseInt(bagian[3]);
            this.sinopsis = bagian[4];

            reader.close();

            System.out.println("Data berhasil dibaca dari file");

        }catch(IOException e){
            System.out.println("Terjadi kesalahan membaca file");
        }

    }


    //method hitung royalti 10%
    public double hitungRoyalti(double hargaBuku){

        return hargaBuku * 0.10;

    }


    //method hitung royalti dengan persen
    public double hitungRoyalti(double hargaBuku, double persen){

        return hargaBuku * (persen / 100);

    }
}
