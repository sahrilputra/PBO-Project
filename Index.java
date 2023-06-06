import java.util.List;
import java.util.UUID;

public class Index {
    public static void cariTransaksi(List<Transaksi> catatan, UUID uuid) {
        boolean ditemukan = false;
        System.out.println("============== Hasil Pencarian ================");
        for (Transaksi data : catatan) {
            System.out.println("mencari Transaksi");
            if (data.getID().equals(uuid.toString())) {
                System.out.println(uuid);
                data.printData();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Transaksi dengan ID " + uuid.toString() + " tidak ditemukan.");
        }

        System.out.println("=====================================================");
        System.out.println();
    }
}

// class Laba implements LaporanKeuangan {

//     private List<Pemasukan> pemasukan;
//     private List<Pengeluaran> pengeluaran;

//     public Laba(List<Transaksi> pemasukan, List<Transaksi> pengeluaran) {
//         this.pemasukan = pemasukan;
//         this.pengeluaran = pengeluaran;
//     }

//     @Override
//     public void generateLaporan() {
//         // TODO Auto-generated method stub

//     }

// }