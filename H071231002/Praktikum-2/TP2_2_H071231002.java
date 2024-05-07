package Tuprak;

class Barang {
    String id;
    String nama;
    int stok;
    double harga;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String statusStok(){
        if (stok == 0){
            return "Stok Habis! Saatnya Re-stok";
        }else if (stok > 0 && stok <= 15 ){
            return "Stok Sisa Sedikit! Saatnya Re-stok ";
        }else if (stok >15 ){
            return "Stok Masih Banyak. Habiskan!";
        }else {
            return "Stoknya Kok Mines ?!";
        }
    }

    public static void main(String[] args) {
        Barang id2 = new Barang();
        id2.setId("W11001");
        System.out.println("ID : " + id2.getId());

        Barang nama2 = new Barang();
        nama2.setNama("Tango");
        System.out.println("Nama Barang : " + nama2.getNama());

        Barang stok2 = new Barang();
        stok2.setStok(19);
        System.out.println("Stok Tersedia : " + stok2.statusStok());

        Barang harga2 = new Barang();
        harga2.setHarga(17000.25);
        System.out.println("Harga Barang : " + harga2.getHarga());
    }
}
