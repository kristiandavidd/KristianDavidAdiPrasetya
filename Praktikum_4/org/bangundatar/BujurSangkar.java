// Nama file    : BujurSangkar.java
// tanggal      : 21 Maret 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas Bujur Sangkar

package Praktikum_4.org.bangundatar;

import Praktikum_4.org.poligon.Poligon;

public class BujurSangkar extends Poligon{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas() {
        return this.panjangSisi * this.panjangSisi;
    }

    public double getPanjangSisi() {
        return this.panjangSisi;
    }
}
