package Game;

public class U1 extends Rocket {

    public U1 () {
        setRocketCost(100);
        setRocketWeight(10000);
        setRocketMaxLoad(18000);
        setLaunchExplosionChance(0.05);
        setLandingCrashChance(0.01);
        setCurrentWeight(getRocketWeight());
    }

    public boolean launch() {
        int maxWeight = getRocketMaxLoad();
        int currentWeight = getCurrentWeight();
        double probability = Math.random();
        double explosionChance = getLaunchExplosionChance()*((double)currentWeight/maxWeight);

        if (explosionChance<probability) {
            return true;
        } else{
            System.out.println("U1 exploded  when starting ");
            return false;
        }
    }

    public boolean land() {
        int maxWeight = getRocketMaxLoad();
        int currentWeight = getCurrentWeight();
        double probability = Math.random();
        double explosionChance = getLandingCrashChance()*((double)currentWeight/maxWeight);

        if (explosionChance<probability) {
            return true;
        } else{
            System.out.println("U1 exploded  when landing");
            return false;
        }
    }

}