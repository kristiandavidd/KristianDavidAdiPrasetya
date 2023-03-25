// Nama file    : MLingkaran.java
// tanggal      : 25 Maret 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Implementasi cara menghitung luas lingkaran

package Praktikum_5;

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lingkaran l = new Lingkaran();
        System.out.println("Masukkan jejari Lingkaran: ");
        double jejari = in.nextDouble();
        in.close();
        System.out.println("Luas Lingkaran dengan jejari "+jejari+" satuan adalah "+l.hitungLuas(jejari));
    }
}
