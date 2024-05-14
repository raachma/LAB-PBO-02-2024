public interface DogInfo{
    void move();
    void describe();
}

abstract class Dog implements DogInfo {
    int position, averageLength;
    
    public Dog(int position, int averageLength){
        this.position = position;
        this.averageLength = averageLength;
    }
}

class Pitbull extends Dog{
    public Pitbull(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 3;
        System.out.println("-".repeat(50));
        System.out.println("Pitbull berpindah sejauh " + position + " titik.");
    }

    public void describe(){
        System.out.println("Pitbull setia dan berani.");
    }
}

class SiberianHusky extends Dog{
    public SiberianHusky(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 2;
        System.out.println("-".repeat(50));
        System.out.println("Siberian Husky berpindah sejauh " + position + " titik.");
    }

    public void describe(){
        System.out.println("Siberian Husky tahan terhadap cuaca dingin.");
    }
}

class Bulldog extends Dog{
    public Bulldog(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 1;
        System.out.println("-".repeat(50));
        System.out.println("Bulldog berpindah sejauh " + position + "  titik.");
    }

    public void describe(){
        System.out.println("Bulldog cenderung agresif.");
    }
}

class GermanShepherd extends Dog{
    public GermanShepherd(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 3;
        System.out.println("-".repeat(50));
        System.out.println("German Shepherd berpindah sejauh " + position + " titik.");
    }

    public void describe(){
        System.out.println("German Shepherd pengembala domba.");
    }
}