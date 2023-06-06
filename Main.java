import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    static public List<Transaksi> catatan = new ArrayList<>();
    static double totalPemasukan = 0;
    static double totalPengeluaran = 0;
    static String[] kategoriPemasukan = { "Gaji", "Bonus", "Pendapatan Bisnis", "lainnya" };
    static String[] kategoriPengeluaran = { "Konsumsi", "Transport", "Biaya Sewa", "lainnya" };
    static int[] simpanPemasukan = { 0, 0, 0, 0, 0 };
    static int[] simpanPengeluaran = { 0, 0, 0, 0, 0 };

    public static void main(String[] args) {
        userControl();
        catatan.size();
    }

    public static void userControl() {

        totalPemasukan = 0;
        totalPengeluaran = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("=========== MENU ==============");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("1. Buat transaksi baru");
        System.out.println("2. Tampilkan Riwayat Transaksi");
        System.out.println("3. Cari Transaksi");
        System.out.println("4. Lihat Transaksi Berdasarkan Kategory");
        System.out.println("5. Keluar");
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
                ListKategory();
            case 5:
                return;
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
        System.out.println("Pilih Tipe Transaksi \n 1. Pemasukan \n 2. Pengeluaran\n");
        System.out.print("Masukan Anda : ");
        int tipe = sc.nextInt();

        int i = 1;
        int pilihanKategori = 0;
        if (tipe == 1) {
            for (String kategori : kategoriPemasukan) {
                System.out.println(i + ". " + kategori);
                i++;
            }
            System.out.print("Pilih kategori Pemasukan (1-4) : ");
            pilihanKategori = sc.nextInt();
            simpanPemasukan[pilihanKategori - 1] += 1;
        } else if (tipe == 2) {
            for (String kategori : kategoriPengeluaran) {
                System.out.println(i + ". " + kategori);
                i++;
            }
            System.out.print("Pilih kategori Pengeluaran (1-4) : ");
            pilihanKategori = sc.nextInt();
            simpanPengeluaran[pilihanKategori - 1] += 1;
        }

        System.out.print("Masukan Catatan : ");
        String keterangan = sc.next();

        System.out.print("Masukan Nominal : ");
        double nominal = sc.nextDouble();

        if (tipe == 1) {
            String newKategori = kategoriPemasukan[pilihanKategori - 1];
            Transaksi pemasukan = new Pemasukan(keterangan, nominal, newKategori);
            catatan.add(pemasukan);
            pemasukan.printData();

        } else if (tipe == 2) {
            String newKategori = kategoriPengeluaran[pilihanKategori - 1];
            Transaksi pengeluaran = new Pengeluaran(keterangan, nominal, newKategori);
            catatan.add(pengeluaran);
            pengeluaran.printData();
        } else {
            System.out.println("Tipe transaksi tidak valid.");
        }
        // for (Transaksi data : catatan) {
        // data.printData();
        // }

        // for (Transaksi data : catatan) {
        // if (data instanceof Pemasukan) {
        // totalPemasukan += data.hitungTotal();
        // } else if (data instanceof Pengeluaran) {
        // totalPengeluaran += data.hitungTotal();
        // }
        // }

        userControl();
    }

    public static void riwayatTransaksi() {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\n ========= Riwayat Transaksi ========= \n");
        for (Transaksi data : catatan) {
            data.printData();
            if (data instanceof Pemasukan) {
                totalPemasukan += data.hitungTotal();
            } else if (data instanceof Pengeluaran) {
                totalPengeluaran += data.hitungTotal();
            }

        }
        System.out.println("Total Pengeluaran: " + totalPengeluaran);
        System.out.println("Total Pemasukan: " + totalPemasukan);
        double saldo = totalPemasukan - totalPengeluaran;
        System.out.println("Saldo Anda Tersisa: " + saldo);

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

    public static void ListKategory() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\\r\\n]+");
        System.out.println("\n");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("+====== Kategori Transaksi ======+ ");
        System.out.println("++++++++++++++++++++++++++++++");
        

        if (catatan.size() == 0) {
            System.out.println("data tidak tersedia, silahkan buat transaksi baru\n\n");
            userControl();
        }

        System.out.println("Pilih Tipe Transaksi \n 1. Pemasukan \n 2. Pengeluaran\n");
        System.out.print("Masukan Anda : ");
        int tipe = sc.nextInt();

        int i = 1;
        int pilihanKategori = 0;
        if (tipe == 1) {

            for (String kategori : kategoriPemasukan) {
                System.out.println(i + ". " + kategori  + "("+simpanPemasukan[i - 1]+")");
                i++;
            }
            System.out.print("Pilih kategori Pemasukan (1-4) : ");
            pilihanKategori = sc.nextInt();
            String test = kategoriPemasukan[pilihanKategori - 1];

            

            if (simpanPemasukan[pilihanKategori - 1] == 0) {
                System.out.println("Belum Ada Transaksi Pada Kategori INi \n\n");
                userControl();
            }

            String newKategori = kategoriPemasukan[pilihanKategori - 1];

            for (Transaksi data : catatan) {
                if (newKategori.equalsIgnoreCase(data.getKategori())) {
                    data.printData();
                }
            }

        } else if (tipe == 2) {
            
            for (String kategori : kategoriPengeluaran) {
                System.out.println(i + ". " + kategori + "("+simpanPengeluaran[i - 1]+")");
                i++;
            }
            System.out.print("Pilih kategori Pengeluaran (1-4) : ");
            pilihanKategori = sc.nextInt();

            
            if (simpanPengeluaran[pilihanKategori - 1] == 0) {
                System.out.println("Belum Ada Transaksi Pada Kategori INi \n\n");
                userControl();
            }
            
            String newKategori = kategoriPengeluaran[pilihanKategori - 1];

            for (Transaksi data : catatan) {
                if (newKategori.equalsIgnoreCase(data.getKategori())) {
                    data.printData();
                }
            }
        }

        userControl();

    }

}
