import java.util.ArrayList;
import java.util.List;

public class NBA {
    String teamName;
    List<PlayerNBA> players = new ArrayList<>();
    double averageRate;
    PlayerNBA player = new PlayerNBA();

    public NBA() {
    }

    public NBA(String teamName) {
        this.teamName = teamName;
    }

    public NBA(String teamName, double averageRate) {
        this.teamName = teamName;
        this.averageRate = averageRate;
    }

    public NBA(String teamName, double averageRate, String playerName) {
        this.teamName = teamName;
        this.averageRate = averageRate;
        this.player.name = playerName;
    }

    public NBA(String teamName, double averageRate, String playerName, double playerRate) {
        this.teamName = teamName;
        this.averageRate = averageRate;
        this.player.name = playerName;
        this.player.rate = playerRate;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(double averageRate) {
        this.averageRate = averageRate;
    }

    public void addPlayer(String playerName, Double playerRate) {
        PlayerNBA player = new PlayerNBA(playerName, playerRate);
        players.add(player);
        updateAverageRate();
    }

    private void updateAverageRate() {
        double totalRate = 0;
        for (PlayerNBA player : players) {
            totalRate += player.getRate();
        }
        if (players.size() > 0) {
            averageRate = totalRate / players.size();
        } else {
            averageRate = 0;
        }
    }

    public void profileTeam() {
        System.out.println("\n");
        System.out.println("==================== Players Profiles " + getTeamName() + " =====================");
        for (PlayerNBA player : players) {
            System.out.println("Name Player    : " + player.getName());
            System.out.println("Team           : " + getTeamName());
            System.out.println("Rate Player    : " + player.getRate());
            System.out.println();
        }
        System.out.printf("Average Rate   : %.2f\n", getAverageRate());
    }

    public void launchBattleTo(NBA enemy) {
        System.out.println();
        System.out.println("==================== Battle Report =====================");
        System.out.println(this.getTeamName() + " is battling against " + enemy.getTeamName());

        if (this.getAverageRate() > enemy.getAverageRate()) {
            System.out.println(this.getTeamName() + " wins the battle!");
        } else if (this.getAverageRate() < enemy.getAverageRate()) {
            System.out.println(enemy.getTeamName() + " wins the battle!");
        } else {
            System.out.println("It's a draw!");
        }
        System.out.println("\n");
    }
}