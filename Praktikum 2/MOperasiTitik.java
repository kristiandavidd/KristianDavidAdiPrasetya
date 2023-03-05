// Nama file    : MTitik.java
// tanggal      : 5 Maret 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas yang berisi program utama yang memanfaatkan kelas OperasiTitik

public class MOperasiTitik {
    public static void main(String[] args) {
        Titik t = new Titik(4,4);

        System.out.printf("titik(%.1f,%.1f)\n", t.getAbsis(), t.getOrdinat());

        //OperasiTitik op = new OprasiTitik();
        System.out.printf("titik sebelum refleksi t(%.1f,%.1f)\n", t.getAbsis(), t.getOrdinat());
        OperasiTitik.refleksiX(t);
        OperasiTitik.refleksiY(t);
        System.out.printf("titik setelah refleksi t(%.1f,%.1f)\n", t.getAbsis(), t.getOrdinat());
    }
}
