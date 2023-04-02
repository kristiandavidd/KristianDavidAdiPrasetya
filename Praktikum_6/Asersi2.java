// Nama file    : Asersi2.java
// tanggal      : 2 April 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas Asersi2 untuk percobaan asersi

package Praktikum_6;

//class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

//PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas?

// JAWABAN:
// Kesalahan konsep pada kode diatas adalah ketika penggunaan asersi
// seharusnya kondisi yang dicetak bukan "jadi jari tidak boleh nol"
// melainkan "jari jari tidak boleh kurang dari sama dengan 0"