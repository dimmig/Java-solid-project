package pio;

public class Main {

    public static void main(String[] args) {
        Player player = new PlayerComputer("zzz");
        Player player1 = new PlayerComputer("1111");
        Player player2 = new PlayerComputer("222");
//        Player player3 = new PlayerHuman("human");
        Game game = new Game();
        game.addPlayer(player);
        game.addPlayer(player1);
        game.addPlayer(player2);
//        game.addPlayer(player3);
        for (int i = 0; i < 10; i++) {
            game.play();
        }
        game.removePlayer("222");
        game.printPlayers();

        game.printStats();
    }

}