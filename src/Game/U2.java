package Game;

public class U2 extends Rocket {


    public U2 () {
        setRocketCost(120);
        setRocketWeight(18000);
        setRocketMaxLoad(29000);
        setLaunchExplosionChance(0.04);
        setLandingCrashChance(0.08);
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
            System.out.println("U2 exploded when landing");
            return false;
        }
    }

    public boolean land() {
        int maxWeight = getRocketMaxLoad();
        int currentWeight = getCurrentWeight();
        double probability = Math.random();
        double explosionChance = getLandingCrashChance() * ((double) currentWeight / maxWeight);

        if (explosionChance < probability) {
            return true;
        } else {
            System.out.println("U2 exploded when landing");
            return false;
        }
    }


}