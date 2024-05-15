public class Main1 {
    public static void main(String[] args) {
        NBA team1 = new NBA();
        PlayerNBA player = new PlayerNBA();
        team1.setTeamName("Detroit Pistons");

        team1.addPlayer("Cade Cunningham", 4.4);
        team1.addPlayer("Jalen Duren", 4.7);
        team1.addPlayer("Jaden Ivey", 4.6);
        team1.addPlayer("Bojan Bogdavonic", 4.0);
        team1.addPlayer("Isaiah Stewart", 4.2);

        team1.profileTeam();

        NBA team2 = new NBA();
        team2.setTeamName("Los Angeles Lakers");

        team2.addPlayer("D'Angelo Russell", 4.8);
        team2.addPlayer("Austin Reaves", 4.5);
        team2.addPlayer("Rui Hachimura", 4.3);
        team2.addPlayer("Anthony Davis", 4.1);
        team2.addPlayer("LeBron James", 4.6);

        team2.profileTeam();

        team1.launchBattleTo(team2);

        player.setName("Kevin");
        team1.players.remove(0);
        team1.addPlayer(player.getName(), 4.9);

        team1.profileTeam();
        team2.profileTeam();
        team2.launchBattleTo(team1);

    }
}