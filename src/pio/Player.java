package pio;

public abstract class Player {
    private final String DEFAULT_NAME = "Default name";
    private String name = DEFAULT_NAME;

    abstract int guess();

    public Player() {}

    public Player(String name) {
       setName(name);
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        String regExp = "^[A-Za-z\\d.\\-_]{3,}$";
        if (name != null && name.matches(regExp)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Player name does not implement needed requirements");
        }
    }

    public String toString() {
        return "[" + getClass().getSimpleName() + "]" + " " + name;
    }
}
