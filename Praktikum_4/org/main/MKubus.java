// Nama file    : MKubus.java
// tanggal      : 21 Maret 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas MKubus yang merupakan Main dari kelas Kubus

package Praktikum_4.org.main;

import Praktikum_4.org.bangundatar.BujurSangkar;
import Praktikum_4.org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        System.out.println("Luas bujur sangkar adalah " + bujurSangkar.hitungLuas());

        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Volume kubus adalah " + kubus.hitungVolume());
        System.out.println("Luas alas kubus adalah " + kubus.hitungLuasAlas());
    }
}
