package H071231029;


abstract class Dog{

    int Position;
    int averageLength;


    abstract void Move();
    abstract void describe(); 
  
}



class Pitbul extends Dog{

 
  public void Move(){
    Position += 3;
    System.out.println("Posisi pitbull berpindah sebanyak: "  + Position +" Ke kanan");
    
  }

  public void describe(){
    averageLength = 12;
    System.out.println("tinggi dari pitbull adalah: " + averageLength);

  }   

  
}




class SiberianHusky extends Dog{

  public void Move(){
  Position += 2;
  System.out.println("Posisi SisberianHusky berpindah sebanyak:  " + Position + " Ke kanan");
  
  }



public void describe(){
  System.out.println(" SiberianHusky memiliki tubuh besar, bulu lebat dah halus, bersahabat ");
}


}



class Bulldog extends Dog{

  public void Move(){
    Position += 1;
    System.out.println("Posisi Bulldog berpindah sebanyak: " + Position + " ke kanan");
  }

  
 public  void describe() {
  System.out.println("Bulldog memiliki tubuh lebar, besar, berkaki pendek dan memiliki ekstra kulit yang jatuh berlipat");
    
  }

  
}



class GermanShepherd extends Dog{

  // @Override
  void Move() {
    Position += 3;
    System.out.println("Posisi GermanShepherd berpindah sebanyak: " + Position + " ke kanan");
    
  }

  // @Override
  void describe() {
    System.out.println("Ras German Shepherd adalah ras anjing yang cerdas dan lincah");
    
  }




  
}