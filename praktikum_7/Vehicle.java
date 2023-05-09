// Nama file    : Vehicle.java
// tanggal      : 9 Mei 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas Vehicle yang berisi penggambaran mengenai Polimorfisme

package praktikum_7;

public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance*price;
        System.out.println("Vehicle price = "+fare);
    }
}
