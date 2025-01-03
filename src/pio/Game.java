package pio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Game {
    private final ArrayList<Player> players = new ArrayList<>();
    private final Random rand = new Random();
    private final HashMap<Player, Integer> stats = new HashMap<>();

    public void addPlayer(Player player) {
        if (!players.contains(player)) {
            this.players.add(player);
        } else {
            throw new IllegalArgumentException("Player already exists");
        }
    }

    public void removePlayer(String name) {
        players.removeIf(player -> player.getName().equals(name));
    }

    public void play() {
        if (players.isEmpty()) {
            return;
        }
        int number;
        int guess;
        int i = 0;
        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Cube: " + number);

            guess = this.players.get(i).guess();
            System.out.println("Player " + this.players.get(i).getName() + ": " + guess);

            if (number != guess) {
                System.out.println("Incorrect guess!");
                if (i == players.size() - 1) {
                    i = 0;
                } else {
                    i++;
                }
            } else {
                if (!stats.containsKey(players.get(i))) {
                    stats.put(players.get(i), 1);
                } else {
                    stats.put(players.get(i), stats.get(players.get(i)) + 1);
                }
                System.out.println("PLayer " + this.players.get(i).getName() + " won!");
                return;
            }
        } while (number != guess);
    }

    void printPlayers() {
        for (Player player : players) {
            System.out.println(player.toString());
        }
    }

    void printStats() {
        System.out.println("-------------------");
        System.out.println("Statistics:");
        for (var entry : stats.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }
    }
}
