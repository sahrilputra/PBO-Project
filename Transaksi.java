
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * Transaksi
 */
abstract class Transaksi implements Total {
    public String catatan;
    public double nominal;
    public String ID;
    public LocalDateTime localDate = LocalDateTime.now();
    public String waktu;
    public String tanggal;
    public String kategori;
    public double saldo;

    public Transaksi(String catatan, double nominal, String kategori) {
        this.catatan = catatan;
        this.nominal = nominal;
        this.ID = UUID.randomUUID().toString();
        this.waktu = DateTimeFormatter.ofPattern("HH:mm:ss").format(localDate);
        this.tanggal = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(localDate);
        this.kategori = kategori;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
    }

    public double getNominal() {
        return nominal;
    }

    public String getID() {
        return ID;
    }

    public String getKategori() {
        return kategori;
    }

    public abstract void printData();
}