package Soal123;


class BangunRuang{
    double Luas;
    double Volume;


    BangunRuang(double Luas, double Volume){
        this.Luas = Luas;
        this.Volume = Volume;
    }

}


class Kubus extends BangunRuang{
 
    double sisi;
    double Panjang;
    double Lebar;
    double Tinggi;


    
    Kubus(double sisi, double Luas, double Volume){
        super(Luas, Volume);
        this.sisi = sisi;  
    }

        double LuasKubus(){
           return  6*(this.sisi*this.sisi);
        }

        double Volume(){
           return  (this.sisi * this.sisi * this.sisi);
        }

}
class  Balok extends BangunRuang{

    double Tinggi;
    double Panjang;
    double Lebar;



    Balok(double Tinggi, double Panjang, double Lebar,double Luas, double Volume){
         super(Luas, Volume);
        this.Tinggi = Tinggi;
        this.Panjang = Panjang;
        this.Lebar = Lebar;
    }

    double LuasBalok(){
        return this.Panjang * this.Lebar * this.Tinggi;
    }

    double VolumeBalok(){
        return  4*(this.Panjang + this.Lebar + this.Tinggi);
    }
}




class Bola extends BangunRuang{
    double jarijari;


    Bola( double jarijari,double Luas, double Volume){
        super(Luas, Volume);
        this.jarijari = jarijari;
    }

    double  LuasBola(){
        return  4*Math.PI * (this.jarijari * this.jarijari);
    }

    double VolumeBola(){
        return 4/3*(Math.PI*this.jarijari*this.jarijari*this.jarijari);
    }
}



class Tabung extends BangunRuang{
    double tinggi;
    double jarijari;




    Tabung(double tinggi, double jarijari, double Luas, double Volume){

        super(Luas, Volume);
        this.tinggi = tinggi;
        this.jarijari = jarijari;
        }
        

       
        double LuasTabung(){
          return  ((2*this.jarijari*Math.PI)*this.tinggi)+(2*(Math.PI*this.jarijari*this.jarijari));
        }

        double Volume(){
            return ((Math.PI*this.jarijari*this.jarijari)*this.tinggi);
        }

    }

