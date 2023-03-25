// Nama file    : Lingkaran.java
// tanggal      : 25 Maret 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas implementasi IArea berupa cara menghitung luas lingkaran

package Praktikum_5;

import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    public double hitungLuas(double jejari) {
        return PI*jejari*jejari;
    }
}