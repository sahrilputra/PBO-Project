/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author ASUS
 */
public abstract class Pemasukan implements Aktivitas {

    @Override
    public abstract int pengubahSaldo(int nominal);

    @Override
    public abstract void pengeluaran();

    @Override
    public int pemasukan() {
        return 1 + 1;
    }
}
