public class Karyawan {
    String nama, jabatan;
    int umur, gaji;
    boolean statusMenikah;
    Proyek proyek;
    Pengalaman pengalaman;
    Pendidikan pendidikan;

    public Karyawan(String nama, int umur, int proyek, String tentukanOrganisasi, boolean statusMenikah, String tingkatPendidikan) {
        this.nama = nama;
        this.umur = umur;
        this.gaji = 0;
        this.jabatan = "Karyawan";
        this.statusMenikah = statusMenikah;
        this.gaji = hitungGaji(proyek);
        this.proyek = new Proyek(proyek);
        this.pengalaman = new Pengalaman(tentukanOrganisasi);
        this.pendidikan = new Pendidikan(tingkatPendidikan);
        this.pengalaman.setTentukanOrganisasi(tentukanOrganisasi);
        this.pendidikan.setTingkatPendidikan(tingkatPendidikan);
    }
    
    public int hitungGaji(int proyek) {
        int gaji = 0;
        switch (proyek) {
            case 1:
                gaji = 5000000;
                break;
            case 2:
                gaji = 8000000;
                break;
            case 3:
                gaji = 12000000;
                break;
            case 4:
                gaji = 15000000;
            default:
                break;
        }
        return gaji;
    }

    public void displayDetail() {
        System.out.println();
        System.out.println("Detail karyawan:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jabatan: " + jabatan);
        System.out.printf("Gaji: " + gaji);
        System.out.println("\nStatus Pernikahan: " + (statusMenikah ? "Sudah Menikah" : "Belum Menikah"));
        System.out.print("Jumlah projek IT: ");
        switch (proyek.getProyek()) {
            case 1:
                System.out.println("minimal 4");
                break;
            case 2:
                System.out.println("minimal 8");
                break;
            case 3:
                System.out.println("minimal 12");
                break;
            case 4:
                System.out.println("lebih dari 15");
                break;
            default:
                break;
        }
        if (pengalaman != null) {
            pengalaman.prosesKehidupan();
        }
        if (pendidikan != null) {
            pendidikan.pendidikanInfo();
        }
    }
    
    public boolean isStatusMenikah() {
        return statusMenikah;
    }
    public void setStatusMenikah(boolean statusMenikah) {
        this.statusMenikah = statusMenikah;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}

abstract class Kehidupan {
    public abstract void prosesKehidupan();
}

class Pengalaman extends Kehidupan{
    String tentukanOrganisasi;

    public Pengalaman(String tentukanOrganisasi) {
        this.tentukanOrganisasi = tentukanOrganisasi;
    }

    public String getTentukanOrganisasi() {
        return tentukanOrganisasi;
    }

    public void setTentukanOrganisasi(String tentukanOrganisasi) {
        this.tentukanOrganisasi = tentukanOrganisasi;
    }
    
    public String OrganisasiInfo(int tentukanOrganisasi){
        String pilihan = "";
        switch (tentukanOrganisasi) {
            case 1:
                pilihan = "Ketua BEM";
                break;
            case 2:
                pilihan = "Ketua Himpunan";
                break;
            case 3:
                pilihan = "Sekretaris Divisi";
                break;
             case 4:
                pilihan = "bendahara Divisi";
                break;
            case 5:
                pilihan = "Panitia Acara";
                break
                ;
            default:
                pilihan  = "Tidak ada";
                break;
        }
        return pilihan;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("jenis organisasi: " + tentukanOrganisasi);
    }
}

class Pendidikan{
    String tingkatPendidikan;

    public Pendidikan(String tingkatPendidikan) {
        this.tingkatPendidikan = tingkatPendidikan;
    }

    public String getTingkatPendidikan() {
        return tingkatPendidikan;
    }
    public void setTingkatPendidikan(String tingkatPendidikan) {
        this.tingkatPendidikan = tingkatPendidikan;
    }
    
    public void pendidikanInfo(){
        System.out.println("Pendidikan terakhir: " + tingkatPendidikan);
    }
}

class Proyek {
    int proyek;

    public int getProyek() {
        return proyek;
    }

    public void setProyek(int proyek) {
        this.proyek = proyek;
    }

    public Proyek(int proyek) {
        this.proyek = proyek;
    }

}