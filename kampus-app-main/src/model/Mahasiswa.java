package model;

public class Mahasiswa {
    private String nim;
    public String getNim() {
        return nim;
    }

    private String nama;
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa(String nim, String nama, String idProdi) { //tambahkan konstruktor agar menerima 3 parameter (string idprodi)
        this.nim = nim;
        this.nama = nama;
        this.idProdi = idProdi; //tambahan
    }
// setter getter idprodi untuk mengakses dan mengatur nilai atribut 
    private String idProdi; 
    public String getIdProdi() {
        return idProdi;
    }

    public void setIdProdi(String idProdi) {
        this.idProdi = idProdi;
    }
}
