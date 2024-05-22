public class SangPetarunk {
    private String name;
    private Sarunk sarunk;
    private int health;
    private double coordinate;

    public SangPetarunk(String name, Sarunk sarunk, int health, double coordinate) {
        this.name = name;
        this.sarunk = sarunk;
        this.health = health;
        this.coordinate = coordinate;
    }

    public void checkStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Coordinate: " + coordinate);
        System.out.println("Sarunk Type: " + sarunk.getType());
        System.out.println("Sarunk Damage: " + sarunk.getDamage());
    }

    public void travelToCoordinate(double coordinate) {
        this.coordinate = coordinate;
        System.out.println(name + " is now at coordinate " + coordinate);
    }

    public void upgradeSarunk(String type, int damage) {
        sarunk.setType(type);
        sarunk.setDamage(damage);
        System.out.println("Sarunk upgraded to type: " + type + " with damage: " + damage);
    }

    public void launchBattleTo(SangPetarunk enemy) {
        // Contoh interaksi dengan attribute instance variable
        System.out.println(name + " launches battle to " + enemy.getName());
        // Implementasi logika pertarungan bisa ditambahkan di sini
    }

    // Getter dan setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sarunk getSarunk() {
        return sarunk;
    }

    public void setSarunk(Sarunk sarunk) {
        this.sarunk = sarunk;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(double coordinate) {
        this.coordinate = coordinate;
    }
}