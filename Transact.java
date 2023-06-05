/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author ASUS
 */
public class Transact {

    String nama;
    String jenis;
    String keterangan;
    int nominal;
    int masuk, keluar;

    public Transact() {
    }

    public Transact(String nama, String jenis, String keterangan, int nominal) {
        this.nama = nama;
        this.jenis = jenis;
        this.keterangan = keterangan;
        this.nominal = nominal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getMasuk() {
        return masuk;
    }

    public void setMasuk(int masuk) {
        this.masuk = masuk;
    }

    public int getKeluar() {
        return keluar;
    }

    public void setKeluar(int keluar) {
        this.keluar = keluar;
    }
    

    public int kontrol() {
        if (this.keterangan.toLowerCase().equals(("pemasukan"))) {
            this.masuk = this.nominal;
            return masuk += this.nominal;
        } else if (this.keterangan.toLowerCase().equals(("pengeluaran"))) {
            this.keluar = this.nominal;
            return keluar += this.nominal;
        }
        return -1;
    }
    

    public int pemasukan(int saldo) {
        return masuk = saldo;
    }

    public int pengeluaran(int saldo) {
        return keluar = saldo;
    }
}
