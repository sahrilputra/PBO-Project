/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        Transact[] baru = new Transact[3];

        baru[0] = new Transact("test", "testDesc", "pemasukan", 20000);
        baru[1] = new Transact("test", "testDesc", "pemasukan", 20000);
        baru[2] = new Transact("keluar", "testDesc", "pengeluaran", 10000);
        baru[0].kontrol();
        for (int i = 0; i < baru.length; i++) {
            System.out.println(baru[i].getKeluar());
            System.out.println(baru[i].getMasuk());
        }
        System.out.println(baru[2].getNama());
        System.out.println(baru[2].kontrol());
        System.out.println(baru[2].getKeluar());
        System.out.println();
//        for (int i = 0; i < baru.length; i++) {
//            
//        }

    }

}
