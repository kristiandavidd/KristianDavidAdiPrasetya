// Nama file    : MTitik.java
// tanggal      : 22 Februari 2023
// Nama/NIM     : Kristian David Adi Prasetya/24060121130049
// Deskripsi    : Kelas yang berisi program utama yang memanfaatkan kelas Titik

public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3 = new Titik(5,6);
        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);
        System.out.println("Jumlah objek titik: " + t1.getCounterTitik());
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat()+")");
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat()+")");
        System.out.printf("t3(%.1f,%.1f)\n", t3.getAbsis(), t3.getOrdinat());

    }
}
