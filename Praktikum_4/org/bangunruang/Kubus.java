// Nama file    : Kubus.java
// tanggal      : 21 Maret 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas Kubus

package Praktikum_4.org.bangunruang;

import Praktikum_4.org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan) {
        this.permukaan = permukaan;
    }

    public double hitungVolume() {
        return permukaan.hitungLuas() * permukaan.getPanjangSisi();
    }

    public double hitungLuasAlas() {
        return permukaan.hitungLuas();
    }
}
