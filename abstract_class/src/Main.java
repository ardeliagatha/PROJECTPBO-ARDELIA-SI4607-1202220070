public class Main {
    public static void main(String[] args) {
        KotaSolo kotaSolo = new KotaSolo();
        kotaSolo.nama_kota = "Solo";
        kotaSolo.jumlah_kecamatan = "5 kecamatan";
        kotaSolo.pulau = "pulau Jawa";
        kotaSolo.nama_keraton = "keraton surakarta hadiningrat";
        kotaSolo.info_kota();
        kotaSolo.provinsi();
        kotaSolo.populasi();

        KotaBadung kotaBadung = new KotaBadung();
        kotaBadung.nama_kota = "Badung";
        kotaBadung.jumlah_kecamatan = "6 kecamatan";
        kotaBadung.pulau = "pulau Bali";
        kotaBadung.nama_pura = "pura luhur uluwatu";
        kotaBadung.info_kota();
        kotaBadung.provinsi();
        kotaBadung.populasi();
    }
}