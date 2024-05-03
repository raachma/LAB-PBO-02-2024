package H071231029;


interface Teknologi {


void Move();

    
}



 class Smartphone implements Teknologi{

    int Price;
    String Brand;

    Smartphone(int Price, String Brand){
        this.Price = Price;
        this.Brand = Brand;

    }
 
    public void Move() {
      System.out.println("Smartphone Berpindah");
    }



}



class Car implements Teknologi{

    int  totalForwarGear;
    String Color;
    int maxSpeed;



    Car(int totalForwarGear, String Color, int maxSpeed){
        this.totalForwarGear = totalForwarGear;
        this.Color = Color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void Move() {
       System.out.println("Mobil Sedang berakselerasi");
        
    }

    
}
