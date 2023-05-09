// Nama file    : PolimorfismeCoercion.java
// tanggal      : 9 Mei 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas Polimorfisme bertipe Coercion

package praktikum_7;

public class PolimorfismeCoercion {
    public static int kuadrat(int bilangan) {
        return bilangan*bilangan;
    }

    public static void main(String[] args) {
        Integer bilangan = 10;

        int hasilKuadrat = kuadrat(bilangan);

        System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
    }
}
