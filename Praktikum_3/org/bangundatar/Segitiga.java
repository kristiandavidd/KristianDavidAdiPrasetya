// Nama file    : Segitiga.java
// tanggal      : 8 Maret 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas Segitiga yang merupakan extends dari Poligon

package Praktikum_3.org.bangundatar;

import Praktikum_3.org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return alas * tinggi / 2;
    }

    public void printInfo() {
        System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi());
    }
}
