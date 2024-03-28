class Product {
    String id;
    String nama;
    int stok;
    double harga;

    public Product(String id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    String getId() {
        return id;
    }

    String getNama() {
        return nama;
    }

    void setName(String nama) {
        this.nama = nama;
    }

    int getStok() {
        return stok;
    }

    void setStok(int stok) {
        this.stok = stok;
    }

    double getHarga() {
        return harga;
    }

    void setHarga(int harga) {
        this.harga = harga;
    }

    boolean cek() {
        return stok > 0;
    }

    public static void main(String[] args) {
        Product produk = new Product("H071231027", "kipas", 2, 250000);
        System.out.println("ID Product : " + produk.getId());
        System.out.println("Nama Product : " + produk.getNama());
        System.out.println("Stok Product : " + produk.getStok());
        System.out.println("Harga Product : " + produk.getHarga());
    }
}
