package COBAA;


class Product{

    String brand;
    int SerialNumber;
    double price;
    
    Product(String brand, int SerialNumber, double price){
        this.brand = brand;
        this.SerialNumber = SerialNumber;
        this.price = price;
    }


    void DisplayInfo(){
        System.out.println("Brand :" + this.brand);
        System.out.println("Serial Number: " + this.SerialNumber);
        System.out.println("Price: " +"$"+ this.price);
    }

    
}



class Smartphone extends Product{
    double ScreenSize;
    int StorageCapacity;



    Smartphone(double ScreenSize, int StorageCapacity,String brand, int SerialNumber, double price){
        super(brand, SerialNumber, price);
        this.ScreenSize = ScreenSize;
        this.StorageCapacity = StorageCapacity;


    }


    void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Screen Size: " + this.ScreenSize + " inches");
        System.out.println("Storage Capacity: " + StorageCapacity + "GB");
    }
    

}



class Camera extends Product{
    int Resolution;
    String LensType;


    Camera(int Resolution, String LensType,String brand, int SerialNumber, double price){
        super(brand, SerialNumber, price);
        this.Resolution = Resolution;
        this.LensType = LensType;

    }

        void DisplayInfo(){
            super.DisplayInfo();
            System.out.println("Reoslusi " + this.Resolution);
            System.out.println("Tipe Lensa: " + this.LensType);
        }
    
}


class Laptop extends Product{

    int RamSize;
    String ProccesorType;




Laptop(int RamSize, String ProccesorType,String brand, int SerialNumber, double price){
   
    super(brand, SerialNumber, price);
    this.RamSize = RamSize;
    this.ProccesorType = ProccesorType;

}

    void DisplayInfo(){
        super.DisplayInfo();
        System.out.println(this.RamSize);
        System.out.println(this.ProccesorType);

    }



}


