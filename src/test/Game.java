package test;

public class Game implements Player{
    private Environment env;
    Game(Environment env) {
        this.env = env;
    }
    public Environment getEnvironment() {
        return env;
    }
    public int getId() {
        return playerId;
    }
    public int move() {
        return 0;
    }
}
