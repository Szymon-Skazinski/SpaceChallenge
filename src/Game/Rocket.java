package Game;

public class Rocket implements SpaceShip {

    private int rocketCost;
    private int rocketWeight;
    private int rocketMaxLoad;
    double launchExplosionChance;
    double landingCrashChance;
    private int currentWeight;

    //METHODS

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    final public void carry(Item item) {
        if (canCarry(item)) {
            currentWeight += item.getWeight();
        }
    }

    final public boolean canCarry(Item item) {
        if ((getCurrentWeight() + item.getWeight()) > getRocketMaxLoad()) {
            return false;
        } else return true;
    }

    //GETTERS

    public int getRocketCost() {
        return rocketCost;
    }

    public int getRocketWeight() {
        return rocketWeight;
    }

    public int getRocketMaxLoad() {
        return rocketMaxLoad;
    }

    public double getLaunchExplosionChance() {
        return launchExplosionChance;
    }

    public double getLandingCrashChance() {
        return landingCrashChance;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    //SETTERS

    public void setRocketCost(int rocketCost) {
        this.rocketCost = rocketCost;
    }

    public void setRocketWeight(int rocketWeight) {
        this.rocketWeight = rocketWeight;
    }

    public void setRocketMaxLoad(int rocketMaxLoad) {
        this.rocketMaxLoad = rocketMaxLoad;
    }

    public void setLaunchExplosionChance(double launchExplosionChance) {
        this.launchExplosionChance = launchExplosionChance;
    }

    public void setLandingCrashChance(double landingCrashChance) {
        this.landingCrashChance = landingCrashChance;
    }


    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

}

