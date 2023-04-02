// Nama file    : AngkaSial.java
// tanggal      : 2 April 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas AngkaSial untuk percobaan eksepsi

package Praktikum_6;

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!!!");
        }
    }
}

// PERTANYAAN: 
// 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
// 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

// JAWABAN
// 1. tidak, karena setelah adanya eksepsi maka kode akan dipaksa untuk 
// berhenti berjalan dan mengembalikan message eksepsi
// 2. ya, karena pada percobaan terdapat angka 13 yang dicoba untuk dieksekusi, 
// sedangkan angka 13 tidak diperbolehkan ada pada program, maka terjadi eksepsi