// Nama file    : OperasiTitik.java
// tanggal      : 1 Maret 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Program Kelas Operasi Titik

public class OperasiTitik {

    private static void refleksiSumbuX(Titik titik) {
        Double ordinat = titik.getOrdinat();
        titik.setOrdinat(-1 * ordinat);
    }
    private static void refleksiSumbuY(Titik titik) {
        Double absis = titik.getAbsis();
        titik.setAbsis(-1 * absis);
    }

    public static Titik refleksiX(Titik t) {
        refleksiSumbuX(t);
        return t;
    }

    public static Titik refleksiY(Titik t) {
        refleksiSumbuY(t);
        return t;
    }
    
}
