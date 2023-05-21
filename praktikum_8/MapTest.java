// Nama file    : MapTest.java
// tanggal      : 21 Mei 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Program yang menggunakan Generic untuk pasangan kunci-nilai

package praktikum_8;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci->integer, nilai->string
        Map<Integer,String> map = new HashMap<Integer,String>();
        // menempatkan elemen kunci dan nilai
        map.put(1,"satu");
        map.put(2,"dua");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        // mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();
        // bagaimana iterasi untuk mengambil keseluruhan
        // nilai dari kunci ? tulis pada laporan anda
        // petunjuk: gunakan iterasi seperti program ArrayListTest

        // Menggunakan for untuk mendefinisikan k sebagai elemen dari key
        // Kemudian melakukan pencetakan ke layar dengan menggunakan k itu sendiri
        // untuk mendapatkan value dari k, dapat menggunakan operator get()
        for (Integer k : key) {
            System.out.println(k+" "+map.get(k));
        }
    }
}
