import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;


public class Main {
    static public List<Transaksi> catatan = new ArrayList<>();
    static double totalPemasukan = 0;
    static double totalPengeluaran = 0;


    public static void main(String[] args) {
        userControl();
        catatan.size();
    }

    public static void userControl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("=========== MENU ==============");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("1. Buat transaksi baru");
        System.out.println("2. Tampilkan Riwayat Transaksi");
        System.out.println("3. Cari Transaksi");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        int pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                TransaksiBaru();
            case 2:
                riwayatTransaksi();
            case 3:
                CariTransaksi();
            case 4:
                CariTransaksi();
            default:
                break;
        }
    }

    public static void TransaksiBaru() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\\r\\n]+");
        System.out.println("\n");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("+====== Transaksi Baru ======+ ");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Pilih Tipe Transaksi \n 1. Pemasukan \n 2. Pengeluaran");
        System.out.print("Masukan Anda : ");
        int tipe = sc.nextInt();

        System.out.print("Masukan Catatan : ");
        String keterangan = sc.next();
        System.out.print("Masukan Nominal : ");
        double nominal = sc.nextDouble();

        if (tipe == 1) {
            Transaksi pemasukan = new Pemasukan(keterangan, nominal);
            catatan.add(pemasukan);
            pemasukan.printData();

        } else if (tipe == 2) {
            Transaksi pengeluaran = new Pengeluaran(keterangan, nominal);
            catatan.add(pengeluaran);
            pengeluaran.printData();
        } else {
            System.out.println("Tipe transaksi tidak valid.");
        }
        //for (Transaksi data : catatan) {
        //    data.printData();
        //}

        for (Transaksi data : catatan) {
            if (data instanceof Pemasukan) {
                totalPemasukan = data.hitungTotal();
            } else if (data instanceof Pengeluaran) {
                totalPengeluaran = data.hitungTotal();
            }
        }

        userControl();
    }

    public static void riwayatTransaksi() {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\n ========= Riwayat Transaksi ========= \n");
        for (Transaksi data : catatan) {
            data.printData();
        }
        System.out.println("Total Pengeluaran: " + totalPengeluaran);
        System.out.println("Total Pemasukan: " + totalPemasukan);

        System.out.println("==================================");
        System.out.println();

        userControl();
    }

    public static void CariTransaksi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Id Transaksi : ");
        String idTransaksi = sc.next();
        UUID uuid = UUID.fromString(idTransaksi);
        System.out.println("this UUID" + uuid);
        Index.cariTransaksi(catatan, uuid);

        userControl();
    }

}
