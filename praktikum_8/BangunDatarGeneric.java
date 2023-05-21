// Nama file    : BangunDatarGeneric.java
// tanggal      : 21 Mei 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : kelas konstruksi generic untuk BangunDatar

package praktikum_8;

public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 BangunDatar;

    public void set(T1 tipeBangunDatar) {
        BangunDatar = tipeBangunDatar;
    }

    public T1 get() {
        return BangunDatar;
    }

    public double hitungKeliling() {
        return BangunDatar.hitungKeliling();
    }

    // Mengganti T dengan karakter lain
    // Dalam kasus ini T diganti dengan T1
    // Hal ini tidak akan merubah apapun dalam program
    // Karena generic tidak akan mendefinisikan sebuah objek sampai dieksekusi
}
