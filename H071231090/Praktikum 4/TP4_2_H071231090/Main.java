package TP4_2_H071231090;

class Series{
    String judul, sutradara, genre, sinopsis;
    int jumlahEps;

    public Series(){
    }

    public Series (String judul, String sutradara, String genre, String sinopsis, int jumlahEps){
        this.judul = judul;
        this.sutradara = sutradara;
        this.genre = genre;
        this.sinopsis = sinopsis;
        this.jumlahEps = jumlahEps;
    }

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
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
    public int getJumlahEps() {
        return jumlahEps;
    }
    public void setJumlahEps(int jumlahEps) {
        this.jumlahEps = jumlahEps;
    }

    public void displayinfo(){
        System.out.println("-------------------------");
        System.out.println("Judul       : "+ judul);
        System.out.println("Sutradara   : "+ sutradara);
        System.out.println("Genre       : "+ genre);
        System.out.println("Sinopsis    : "+ sinopsis);
        System.out.println("Jumlah Eps  : "+ jumlahEps);
    }
}

public class Main {
    public static void main(String[] args) {

        Series series1 = new Series();
        series1.setGenre("action");
        series1.setJudul("Batman");
        series1.setJumlahEps(10);
        series1.setSinopsis("Batman is a hero");
        series1.setSutradara("Jam");
        series1.displayinfo();

        Series series2 = new Series("Series Indo", series1.getSutradara(), "komedi", "main", series1.getJumlahEps());
        series2.displayinfo();

        SelfUtils.displaySelfdata();
    }
}
