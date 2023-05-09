// Nama file    : Car.java
// tanggal      : 9 Mei 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas Car yang merupakan extends dari Vehicle

package praktikum_7;

public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare-100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}
