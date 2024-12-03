package pio;

import java.util.Scanner;

public class PlayerHuman extends Player {
    public PlayerHuman() {}

    public PlayerHuman(String name) {
        super(name);
    }

    public int guess() {
        System.out.println("Type your guess:");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
