// Part B

public class Food {
    private String name;
    private int energyIncrease;
    private int happinessIncrease;
    private int weightGain;

    public Food(String name, int energyIncrease, int happinessIncrease, int weightGain){
        this.name = name;
        this.energyIncrease = energyIncrease;
        this.happinessIncrease = happinessIncrease;
        this.weightGain = weightGain;
    }

    public String getName() {
        return name;
    }

    public int getEnergyIncrease() {
        return energyIncrease;
    }

    public int getHappinessIncrease() {
        return happinessIncrease;
    }

    public int getWeightGain() {
        return weightGain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergyIncrease(int energyIncrease) {
        this.energyIncrease = energyIncrease;
    }

    public void setHappinessIncrease(int happinessIncrease) {
        this.happinessIncrease = happinessIncrease;
    }

    public void setWeightGain(int weightGain) {
        this.weightGain = weightGain;
    }
}
