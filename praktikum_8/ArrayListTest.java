// Nama file    : ArrayListTest.java
// tanggal      : 21 Mei 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : program penggunaan objek ArrayList sebagai Collection class

package praktikum_8;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // inisialisasi ArrayList yang hanya dapat berisi objek string
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum ");
        strings.add("collection ");
        strings.add("dan generics ");
        // menghapus elemen
        strings.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for(String s : strings) {
            System.out.print(s+"");
        }
    }
}
