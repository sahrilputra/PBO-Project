class Pengeluaran extends Transaksi {

    public Pengeluaran(String catatan, double nominal, String kategori) {
        super(catatan, nominal, kategori);
    }

    @Override
    public String getKategori() {
        // TODO Auto-generated method stub
        return super.getKategori();
    }

    @Override
    public double hitungTotal() {
        // TODO Auto-generated method stub
        return nominal;
    }

    @Override
    public void printData() {
        // TODO Auto-generated method stub
        System.out.println("\n===== Pengeluaran =====\n");
        System.out.println("ID : " + ID);
        System.out.println("Kategori : " + kategori);
        System.out.println("Catatan : " + catatan);
        System.out.printf("Nominal : Rp.%.2f \n", nominal);
        System.out.println("Waktu Transaksi : " + waktu);
        System.out.println("Tanngal Transaksi : " + tanggal);
        System.out.println("===== ========== =====\n");
    }
}
