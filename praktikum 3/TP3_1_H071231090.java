class Condition{
    int minHealth = 10;
    int minHappiness = 10;
    int age;
    int candy;

    public Condition(){
    }

    public Condition(int minHealth, int minHappiness, int age, int candy){
        this.minHealth = minHealth;
        this.minHappiness = minHappiness;
        this.age = age;
        this.candy =  candy;
    }

    public int getMinHealth() {
        return minHealth;
    }
    public void setMinHealth(int minHealth) {
        this.minHealth = minHealth;
    }
    public int getMinHappiness() {
        return minHappiness;
    }
    public void setMinHappiness(int minHappiness) {
        this.minHappiness = minHappiness;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getCandy() {
        return candy;
    }
    public void setCandy(int candy) {
        this.candy = candy;
    }
}

class Pou{
    String name;
    Condition condition = new Condition();
    int health;
    int happiness;

    public Pou(){
    }

    public Pou(String name, int health, int happiness, int pouAge, int pouCandy){
        this.name = name;
        this.health = health;
        this.happiness = happiness;
        this.condition.age = pouAge;
        this.condition.candy = pouCandy;
    }

    public void checkStatus(){
        System.out.println("Your chara status");
        System.out.println("Name        : " + this.getName());
        System.out.println("Health      : " + this.getHealth());
        System.out.println("Happiness   : " + this.getHappiness());
        System.out.println("Age         : " + this.getCondition().getAge());
        System.out.println("Candy       : " + this.getCondition().getCandy());
    }

    public void pouEat(Pou energy){
        energy.health += this.condition.getMinHealth();
        energy.happiness += this.condition.getMinHappiness();
        System.out.printf("%s menikmati makanannya!", energy.getName());
        System.out.println("Health      : "+ energy.getHealth());
        System.out.println("Happiness   : "+ energy.getHappiness());
    }

    public void pouPlay(Pou energy){
        energy.health -= this.condition.getMinHealth();
        energy.happiness += this.condition.getMinHappiness();
        this.health -= this.condition.getMinHealth();
        this.happiness += this.condition.getMinHappiness();
        System.out.printf("%s mengajak bermain!\n", energy.getName());
        System.out.printf("%s bermain dengan gembira!\n", this.getName());
        System.out.println("Health      : "+ this.getHealth());
        System.out.println("Happiness   : "+ this.getHappiness());
        System.out.printf("%s bermain dengan gembira!\n", energy.getName());
        System.out.println("Health      : "+ energy.getHealth());
        System.out.println("Happiness   : "+ energy.getHappiness());
    }

    public void pouCandy(Pou energy){
        System.out.printf("%s mengambil candy %s...\n", energy.getName(), this.getName());
        energy.condition.candy += this.condition.getCandy();
        this.condition.candy -= this.condition.getCandy();
        System.out.printf("%s memiliki %s candy!\n", energy.getName(), energy.getCondition().getCandy());
        System.out.printf("%s memiliki %s candy!\n", this.getName(), this.getCondition().getCandy());
    }

    public void pouSick(Pou energy){
        if (energy.health <= 50){
            System.out.println(energy.getName() + " terlihat sakit, saatnya minum obat...");
            energy.setHealth(100);
            System.out.println(energy.getName() + " kembali sehat!");
            System.out.println("Health      : "+ energy.getHealth());
            System.out.println("Happiness   : "+ energy.getHappiness());
        } else {
            System.out.println(energy.getName() + " dalam keadaan sehat!");
            System.out.println("Health      : "+ energy.getHealth());
            System.out.println("Happiness   : "+ energy.getHappiness());
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Condition getCondition() {
        return condition;
    }
    public void setCondition(Condition condition) {
        this.condition = condition;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHappiness() {
        return happiness;
    }
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}

public class TP3_1_H071231090 {
    public static void main(String[] args) {
        Condition condition1 = new Condition();
        condition1.setAge(20);
        condition1.setCandy(5);
        Condition condition2 = new Condition();
        condition2.setAge(17);
        condition2.setCandy(2);
 
        Pou pou1 = new Pou("Pou ", 40, 60, condition1.getAge(), condition1.getCandy());
        Pou pou2 = new Pou("Mini Pou", 70, 70, condition2.getAge(), condition2.getCandy());

        printBarriers();
        pou1.checkStatus();
        printBarriers();
        pou2.checkStatus();
        printBarriers();
        pou1.pouEat(pou1);
        printBarriers();
        pou1.pouPlay(pou2);
        printBarriers();
        pou1.pouCandy(pou2);
        printBarriers();
        pou1.pouSick(pou1);
        printBarriers();
        pou2.pouSick(pou2);
        printBarriers();
        pou1.checkStatus();
        printBarriers();
        pou2.checkStatus();
    }
        public static void printBarriers() {
            System.out.println("=============================================");
    }
}