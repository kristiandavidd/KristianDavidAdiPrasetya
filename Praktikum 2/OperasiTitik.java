// Nama file    : OperasiTitik.java
// tanggal      : 1 Maret 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Program Kelas Operasi Titik

public class OperasiTitik {

    private void refleksiSumbuX(Titik titik) {
        Double ordinat = titik.getOrdinat();
        titik.setOrdinat(-1 * ordinat);
    }
    private void refleksiSumbuY(Titik titik) {
        Double absis = titik.getAbsis();
        titik.setAbsis(-1 * absis);
    }

    public void refleksiX(Titik t) {
        refleksiSumbuX(t);
    }

    public void refleksiY(Titik t) {
        refleksiSumbuY(t);
    }
}
