// Nama file    : Lingkaran.java
// tanggal      : 21 Mei 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : implementasi Lingkaran sebagai BangunDatar

package praktikum_8;

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    
    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
}
