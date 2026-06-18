class Player {
    private String playerName;
    private int score;

    public Player(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public String getName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating player objects
        Player[] players = {
            new Player("Rahul", 95),
            new Player("Ankit", 88),
            new Player("Priya", 82),
            new Player("Neha", 76)
        };

        for (int i = 0; i < players.length - 1; i++) {

            for (int j = 0; j < players.length - i - 1; j++) {

                if (players[j].getScore() < players[j + 1].getScore()) {

                    Player temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }

        System.out.println("Players Ranked by Score:");

        for (int i = 0; i < players.length; i++) {
            System.out.println(
                (i + 1) + ". " +
                players[i].getName() +
                " - Score: " +
                players[i].getScore()
            );
        }
    }
}
