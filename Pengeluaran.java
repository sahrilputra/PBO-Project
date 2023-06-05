/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author ASUS
 */
public class Pengeluaran extends Transact implements Aktivitas{
    int idTransaksi;
    int nominal;

    public Pengeluaran(){}

    public Pengeluaran(int idTransaksi, String nama, String jenis, String keterangan, int nominal) {
        super(nama, jenis, keterangan, nominal);
        this.nominal=nominal;
        this.idTransaksi = idTransaksi;
    }
    
    @Override
    public int pengubahSaldo(int nominal) {
        saldo = saldo - nominal;
        return saldo;
    }

    @Override
    public int pemasukan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pengeluaran() {
        
    }

}
