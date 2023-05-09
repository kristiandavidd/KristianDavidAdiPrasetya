// Nama file    : Programmer.java
// tanggal      : 9 Mei 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas Programmer yang merupakan extends dari Pegawai

package praktikum_7;

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.print("Nama : "+nama+", Gaji pokok : "+gajiPokok+"\nBonus : "+bonus+"\n");
    }
}
