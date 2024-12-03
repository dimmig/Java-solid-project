package pio;

public class Main {

    public static void main(String[] args) {
        Player player = new PlayerComputer("zzz");
        Game game = new Game();
        game.addPlayer(player);
        game.play();
    }

}