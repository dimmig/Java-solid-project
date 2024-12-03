package pio;

import java.util.Random;

public class PlayerComputer extends Player {
    private final Random rand = new Random();

    public PlayerComputer() {}

    public PlayerComputer(String name) {
        super(name);
    }

    public int guess() {
        return rand.nextInt(6) + 1;
    }
}
