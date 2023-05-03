package praktikum_7;

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.print("Nama : "+nama+", Gaji pokok : "+gajiPokok+"\nBonus : "+bonus+"\n");
    }
}
