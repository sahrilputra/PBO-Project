
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

    public Transaksi(String catatan, double nominal) {
        this.catatan = catatan;
        this.nominal = nominal;
        this.ID = UUID.randomUUID().toString();
        this.waktu = DateTimeFormatter.ofPattern("HH:mm:ss").format(localDate);
        this.tanggal = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(localDate);
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

    public abstract void printData();
}