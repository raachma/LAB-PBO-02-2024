package TP4_2_H071231027;

public class Series {
    String judul;
    int jumlahEpisode;
    String sutradara;
    String genre;
    String sinopsis;

    public Series() {

    }

    public Series(String judul, int jumlahEpisode, String sutradara, String genre, String sinopsis) {
        this.judul = judul;
        this.jumlahEpisode = jumlahEpisode;
        this.sutradara = sutradara;
        this.genre = genre;
        this.sinopsis = sinopsis;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setJumlahEpisode(int jumlahEpisode) {
        this.jumlahEpisode = jumlahEpisode;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getJudul() {
        return judul;
    }

    public Integer getJumlahEpisode() {
        return jumlahEpisode;
    }

    public String getSutradara() {
        return sutradara;
    }

    public String getGenre() {
        return genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void displayInfo() {
        System.out.println("Judul           : " + judul);
        System.out.println("Jumah Episode   : " + jumlahEpisode);
        System.out.println("Sutradara       : " + sutradara);
        System.out.println("Genre           : " + genre);
        System.out.println("Sinposis        :  " + sinopsis);
    }
}

class Main1 {
    public static void main(String[] args) {
        Series series = new Series();
        series.setJudul("cars2");
        series.setGenre("action");
        series.setJumlahEpisode(2);
        series.setSutradara("Kevin2");
        series.setSinopsis("Mobil-mobil");
        series.displayInfo();

        Series series2 = new Series("Cars", 2, "Kevin", "action", "mobil-mobil");
        System.out.println("Judul           : " + series2.getJudul());
        System.out.println("Jumah Episode   : " + series2.getJumlahEpisode());
        System.out.println("Sutradara       : " + series2.getSutradara());
        System.out.println("Genre           : " + series2.getGenre());
        System.out.println("Sinposis        :  " + series2.getSinopsis());

        SelfUtils.displaySelfData();

    }
}
