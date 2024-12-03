package pio;

import java.util.Random;

public class Game {
    private Player player;
    private final Random rand = new Random();

    public void addPlayer(Player player) {
        this.player = player;
    }

    public void play() {
        if (player == null) {
            return;
        }
        int number;
        int guess;

        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Cube: " + number);

            guess = this.player.guess();
            System.out.println("Player " + this.player.getName() + ": " + guess);

            if (number != guess) {
                System.out.println("Incorrect guess!");
            } else {
                System.out.println("You won!");
            }
        } while (number != guess);
    }
}
