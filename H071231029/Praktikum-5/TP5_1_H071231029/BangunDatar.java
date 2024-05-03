package Soal123;

public class BangunDatar {
double Luas;
double Keliling;

BangunDatar(double Luas, double Keliling){
    this.Luas = Luas;
    this.Keliling = Keliling;

}

}



class Persegi extends BangunDatar {
    double sisi;


    Persegi(double sisi,double Luas, double Keliling){
        super(Luas,Keliling);
        this.sisi = sisi;

    }


    double LuasPersegi(){
        return this.sisi * this.sisi;
        
    }

    double KelilingPersegi(){
        return 4* this.sisi;
    }
}


class PersegiPanjang extends BangunDatar{
    double Panjang;
    double Lebar;

    PersegiPanjang(double Panjang, double Lebar,double Luas, double Keliling){
        super(Luas, Keliling);
        this.Panjang = Panjang;
        this.Lebar = Lebar;
    }


    double LuasPersegiPanjang(){
        return this.Panjang * Lebar;
    }

    double KelilingPersegiPanjang(){
        return 2*(this.Panjang + this.Lebar);
    }


}

class Lingkaran extends BangunDatar{
    double JariJari; 


    Lingkaran(double JariJari, double Luas,double Kelilig){
        super(Luas, Kelilig);
        this.JariJari = JariJari;
    }


    double LuasLingkaran(){
       return  Math.PI * (this.JariJari * this.JariJari);
    }

    double KeliligLingkaran(){
        return 2* Math.PI * JariJari;
    }
}


class Trapesium extends BangunDatar{
    double Tinggi;
    double sisi1;
    double sisi2;
    double sisi3;
    double sisi4;


    Trapesium(double Tinggi, double sisi1, double sisi2, double sisi3, double sisi4, double Luas, double Kelilig){
        super(Luas, Kelilig);
        this.Tinggi = Tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
    }

    double LuasTrapesium(){
        return ((this.sisi1 + this.sisi2) * this.Tinggi/2);
    }
    double KeliligTrapesium(){
        return (this.sisi1 + this.sisi2 + this.sisi3 + this.sisi4 );
    }
}