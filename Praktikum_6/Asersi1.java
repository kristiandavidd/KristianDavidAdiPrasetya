// Nama file    : Asersi1.java
// tanggal      : 2 April 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas Asersi1 untuk percobaan asersi

package Praktikum_6;

public class Asersi1 {
    public static void main(String[] args) {
    int x=0;
        if(x>0) {
            System.out.println("x bilangan positif");
        } else {
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
