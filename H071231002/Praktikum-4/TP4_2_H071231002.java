// Live coding
class Series {
    String judul;
    int jumlahEpisode;
    String sutradara;
    String genre;
    String sinopsis;

    public Series(){

    }

    public Series(String judul, int jumlahEpisode, String sutradara, String genre, String sinopsis){
        this.judul = judul;
        this.jumlahEpisode = jumlahEpisode;
        this.sutradara = sutradara;
        this.genre = genre;
        this.sinopsis = sinopsis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getJumlahEpisode() {
        return jumlahEpisode;
    }

    public void setJumlahEpisode(int jumlahEpisode) {
        this.jumlahEpisode = jumlahEpisode;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }


    public void displayInfo(){
        System.out.println("--------------------------------");
        System.out.println("Judul Series    : " + this.getJudul());
        System.out.println("Jumlah Episode  : " + this.getJumlahEpisode());
        System.out.println("Nama Sutradara  : " + this.getSutradara());
        System.out.println("Genre Series    : " + this.getGenre());
        System.out.println("Sinopsis Series : " + this.getSinopsis());
    }    
}

class SelfUtils {
    public static void displaySelfData(){
        System.out.println("--------------------------------");
        System.out.println("Nama    : A. Muhammad Zulfikar");
        System.out.println("NIM     : H071231002");
    }

    public static void main(String[] args) {
        Series series1 = new Series("Lala", 10, "Lili", "Horor", "Menyeramkan");
        
        Series series2 = new Series();

        series2.setJudul("Series 2");
        series2.setJumlahEpisode(1);
        series2.setSutradara("Sutradara 2");
        series2.setGenre("Horor");
        series2.setSinopsis("Yah horor...");

        series1.displayInfo();
        series2.displayInfo();

        SelfUtils.displaySelfData();
    }
}

