public abstract class Kota {
    
    public String nama_kota;
    public String jumlah_kecamatan;
    public String pulau;

    public void info_kota() {
        System.out.println("Salah Satu Kota dari Pulau di Indonesia");
    }

    public abstract void provinsi();

    public abstract void populasi();

}
