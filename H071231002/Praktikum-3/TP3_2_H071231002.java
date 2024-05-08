public class TP3_2_H071231002 {

    String name;
    double speed, cash;
    int winningAmount;
    
    public TP3_2_H071231002(){
    }

    public TP3_2_H071231002(String name, double speed, double cash, int winningAmount) {
      this.name = name;
      this.speed = speed;
      this.cash = cash;
      this.winningAmount = winningAmount;
    }
  
    public void showSpec() {
      System.out.println("========== Specification ==========");
      System.out.println("Name            : " + getName()); 
      System.out.println("Speed           : " + getSpeed()); 
      System.out.println("Winning Amount  : " + winningAmount);
      System.out.println("Cash            : Rp. " + getCash() + "\n");
    }
  
    public void upgraded(int budget) {
      if (budget > getCash()) {
        System.out.printf("%s cannot be upgraded, not enough money...\n", getName()); 
      } else {
        int increaseSpeed = budget / 50000;
        this.speed += increaseSpeed;
        setCash(getCash() - budget + (budget % 50000));
        System.out.printf("Increases the speed of %s by %d...\n", getName(), increaseSpeed);
      }
    }
  
    public void raceTo(TP3_2_H071231002 enemy) {
      if (this.speed > enemy.speed) {
        setWinningAmount(getWinningAmount() + 1);
        setCash(getCash() + 40000); 
        System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", this.name, this.name, getWinningAmount()); // Use getter method for winningAmount
      } else if (this.getSpeed() == enemy.getSpeed()) {
        System.out.printf("%s with %s are equally strong! The match ended in a draw...\n", getName(), enemy.getName());
      } else {
        enemy.setWinningAmount(enemy.getWinningAmount() + 1); 
        enemy.setCash(enemy.getCash() + 40000); 
        System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", enemy.getName(), enemy.getName(), enemy.getWinningAmount()); // Use getter method for enemy's winningAmount
      }
    }

    // TODO 10: Create getter and setter methods for all the attributes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getWinningAmount() {
        return winningAmount;
    }

    public void setWinningAmount(int winningAmount) {
        this.winningAmount = winningAmount;
    }

    public static void main(String[] args) {
      TP3_2_H071231002 marcebesDenz = new TP3_2_H071231002("Mercebes-Denz", 4, 20000, 0);
      
      TP3_2_H071231002 ferharri = new TP3_2_H071231002(null, 0, 0, 0);
      ferharri.setName("Ferhari");
      ferharri.setSpeed(4);
      ferharri.setCash(50000);

      System.out.println();
      marcebesDenz.showSpec();
      ferharri.showSpec();

      printBarriers();
      marcebesDenz.upgraded(50000);
      printBarriers();
      ferharri.upgraded(50000);
      printBarriers();

      System.out.println();
      ferharri.showSpec();

      printBarriers();
      ferharri.raceTo(marcebesDenz);
      printBarriers();
      marcebesDenz.raceTo(ferharri);
      printBarriers();

      System.out.println();
      marcebesDenz.showSpec();
      ferharri.showSpec();

  }
  public static void printBarriers(){
      System.out.println("====================================");
  }
}
