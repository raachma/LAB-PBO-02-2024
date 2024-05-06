public class TP3_1_H071231023 {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa("Adi", 16);
        System.out.println("Nama: " + siswa1.getNama());
        System.out.println("Umur: " + siswa1.getUmur());
        siswa1.berbicara(); 
        System.out.println();

        Siswa siswa2 = new Siswa("Budi", 17, siswa1);
        System.out.println("Nama: " + siswa2.getNama());
        System.out.println("Umur: " + siswa2.getUmur());
        siswa2.berbicara(); 

        System.out.println();

        siswa1.tambahTeman(siswa2);
        siswa1.berbicara(); 
    }
}

class Siswa {
    private String nama;
    private int umur;
    private Siswa teman;

    public Siswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public Siswa(String nama, int umur, Siswa teman) {
        this.nama = nama;
        this.umur = umur;
        this.teman = teman;
    }

    public void berbicara() {
        if (teman != null) {
            System.out.println(nama + " sedang berbicara dengan " + teman.getNama());
        } else {
            System.out.println(nama + " tidak punya teman untuk diajak berbicara.");
        }
    }

    public void tambahTeman(Siswa teman) {
        this.teman = teman;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}
