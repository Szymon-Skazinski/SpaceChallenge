package Game;

public class Rocket implements SpaceShip {


    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    final public boolean canCarry(Item item) {
        return false;
    }
    final public boolean carry(Item item) {
        return false;
    }
}