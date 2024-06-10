public class ChickenFight {
    // Attributes
    private String chicken1Name;
    private String chicken2Name;
    private int chicken1Health;
    private int chicken2Health;

    // Constructors
    public ChickenFight(String chicken1Name, String chicken2Name) {
        this.chicken1Name = chicken1Name;
        this.chicken2Name = chicken2Name;
        this.chicken1Health = 100; // Default health
        this.chicken2Health = 100; // Default health
    }

    // Behaviours
    public void attackChicken1(int damage) {
        chicken1Health -= damage;
        if (chicken1Health <= 0) {
            chicken1Health = 0;
            System.out.println(chicken1Name + " has been defeated!");
        } else {
            System.out.println(chicken1Name + " is attacked! " + chicken1Name + "'s health: " + chicken1Health);
        }
    }

    public void attackChicken2(int damage) {
        chicken2Health -= damage;
        if (chicken2Health <= 0) {
            chicken2Health = 0;
            System.out.println(chicken2Name + " has been defeated!");
        } else {
            System.out.println(chicken2Name + " is attacked! " + chicken2Name + "'s health: " + chicken2Health);
        }
    }

    public void displayInfo() {
        System.out.println("Chicken 1 Name: " + chicken1Name);
        System.out.println("Chicken 2 Name: " + chicken2Name);
        System.out.println("Chicken 1 Health: " + chicken1Health);
        System.out.println("Chicken 2 Health: " + chicken2Health);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a chicken fight
        ChickenFight fight = new ChickenFight("Ayam Jago", "Ayam Kampung");

        // Simulating the fight
        fight.attackChicken1(20); // Chicken 1 attacks Chicken 2
        fight.attackChicken2(30); // Chicken 2 attacks Chicken 1
        fight.attackChicken1(50); // Chicken 1 attacks Chicken 2
        fight.attackChicken2(40); // Chicken 2 attacks Chicken 1

        // Displaying the result
        fight.displayInfo();
    }
}
