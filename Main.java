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
        Transact[] baru = new Transact[5];

        baru[0] = new Transact("test", "testDesc", "pemasukan", 20000);
        baru[1] = new Transact("test", "testDesc", "pemasukan", 20000);
        baru[2] = new Transact("keluar", "testDesc", "pengeluaran", 30000);
        baru[3] = new Transact("keluar", "testDesc", "pengeluaran", 30000);
        baru[4] = new Transact("test", "testDesc", "pemasukan", 20000);
//        System.out.println(kontrol(baru,0));
        for (int i = 0; i < baru.length; i++) {
            System.out.println((i+1)+" "+baru[i].getNama()+" "+baru[i].getJenis()+" "+baru[i].getKeterangan()+" "+baru[i].generateId()+"\n"
                    +baru[i].kontrol(baru,i)+" "+baru[i].getMasuk()+" "+baru[i].getKeluar());
            System.out.println();
        }
//        System.out.println(kontrol(baru,3));
//        System.out.println(baru[2].getNama());
//        System.out.println(baru[2].kontrol());
//        System.out.println(baru[2].getKeluar());
//        System.out.println();
//        for (int i = 0; i < baru.length; i++) {
//            
//        }

    }
//    public static int kontrol(Transact[] bantu,int batas) {
//        int saldo=0;
//        for (int i = 0; i <= batas; i++) {
//            if (bantu[i].keterangan.toLowerCase().equals(("pemasukan"))) {
//                bantu[i].masuk = bantu[i].nominal;
//                saldo +=bantu[i].masuk;
//            } else if (bantu[i].keterangan.toLowerCase().equals(("pengeluaran"))) {
//                bantu[i].keluar = bantu[i].nominal;
//                saldo -= bantu[i].keluar;
//            }
//            
//        }
//        return saldo;
//    }

}
