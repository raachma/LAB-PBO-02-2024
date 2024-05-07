public class PvPArena {
    String nama;
    String senjata;
    int power;
    PvPArena lawan;

    public PvPArena() {
    }

    public PvPArena(String nama, String senjata, int power) {
        this.nama = nama;
        this.senjata = senjata;
        this.power = power;
    }

    public String getNama() {
        return nama;
    }

    public String getSenjata() {
        return senjata;
    }

    public int getPower() {
        return power;
    }

    public void setLawan(PvPArena lawan) {
        this.lawan = lawan;
    }

    public void displayInfo() {
        System.out.println("Name: " + nama);
        System.out.println("Weapon(s): " + senjata);
        System.out.println("Power: " + power);
    }

    public void Battle() {
        if (this.lawan != null) {
            if (this.power > this.lawan.getPower()) {
                System.out.println(this.nama + " wins using " + this.senjata + " againts " + this.lawan.getNama() + " with " + this.lawan.getSenjata() + "!");
            } else if (this.power < this.lawan.getPower()) {
                System.out.println(this.nama + " loses using " + this.senjata + " againts " + this.lawan.getNama() + " with " + this.lawan.getSenjata() + "!");
            } else {
                System.out.println("Draw, " + this.nama + " using " + this.senjata + " and " + this.lawan.getNama() + " with " + this.lawan.getSenjata() + " had same power!");
            }
        } else {
            System.out.println("No opponent(s) founded");
        }
    }

    public static void main(String[] args) {
        PvPArena player1 = new PvPArena("Dark Knight", "Greatsword", 70);
        PvPArena player2 = new PvPArena("Black Mage", "Fire Staff", 70);

        System.out.println("Player 1 details:");
        player1.displayInfo();
        System.out.println();
       
        System.out.println("Player 2 details:");
        player2.displayInfo();
        System.out.println();

        player1.setLawan(player2);

        player2.setLawan(player1);

        System.out.println("Match result:");
        player2.Battle();
    }
}
