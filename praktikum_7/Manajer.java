package praktikum_7;

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.print("Nama : "+nama+", Gaji pokok : "+gajiPokok+"\nTunjangan : "+tunjangan+"\n");
    }
}
