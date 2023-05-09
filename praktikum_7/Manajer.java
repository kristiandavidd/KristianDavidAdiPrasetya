// Nama file    : Manajer.java
// tanggal      : 9 Mei 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas Manajer yang merupakan extends dari Pegawai

package praktikum_7;

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.print("Nama : "+nama+", Gaji pokok : "+gajiPokok+"\nTunjangan : "+tunjangan+"\n");
    }
}
