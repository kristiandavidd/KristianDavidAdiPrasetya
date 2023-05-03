package praktikum_7;

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("pegawai bernama "+nama+" memiliki gaji pokok sebesar " + gajiPokok);
    }
}
