import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Trend implements analisis {
    private List<Pemasukan> pemasukan;
    private List<Pengeluaran> pengeluaran;

    public Trend(List<Transaksi> pemasukan, List<Transaksi> pengeluaran) {
        this.pemasukan = pemasukan;
        this.pengeluaran = pengeluaran;
    }

    @Override
    public void analisisTren() {
        // TODO Auto-generated method stub
        Map<String, Double> pengeluaranPerKategori = pengeluaran.stream()
                .collect(
                        Collectors.groupingBy(Transaksi::getCatatan, Collectors.summingDouble(Transaksi::hitungTotal)));

        System.out.println("======= ANALISIS TREN =======");
        System.out.println("Grafik Pengeluaran per Kategori:");

        for (String kategori : pengeluaranPerKategori.keySet()) {
            double totalPengeluaran = pengeluaranPerKategori.get(kategori);
            System.out.println(kategori + ": " + totalPengeluaran);
        }

        System.out.println("=============================");
        System.out.println();
    }

}
