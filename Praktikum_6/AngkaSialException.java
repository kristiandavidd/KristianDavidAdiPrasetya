// Nama file    : AngkaSialException.java
// tanggal      : 2 April 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas AngkaSialException yang berisi message eksepsi

package Praktikum_6;

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}
