// Nama file    : LambdaHashmap.java
// tanggal      : 4 Juni 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Program Lambda pada Hashmap atau pasangan key-value

package praktikum_10;

import java.util.*;

public class LambdaHashmap {
    public static void main(String[] args) {
        // deklarasi Hashmap mhs
        Map<String, String> mhs = new HashMap<String, String>();

        // mengisikan data ke Hashmap mhs
        mhs.put("24060121130049", "Kristian David Adi Prasetya");
        mhs.put("24060121130092", "Dian Pagita");
        mhs.put("24060121130089", "Axelliano Rafael Situmeang");

        // menampilkan data mhs berdasarkan nim
        mhs.keySet().forEach((nim) -> System.out.println(nim + " " + mhs.get(nim)));
    }
}
