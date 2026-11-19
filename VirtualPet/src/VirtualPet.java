// Part A

public class VirtualPet {
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private int weight;
    private int ageYear;
    private int ageMonth;

    public VirtualPet(String name){
        this.name = name;
        this.energyLevel = 0;
        this.happinessLevel = 0;
        this.weight = 5;
        this.ageYear = 0;
        this.ageMonth = 0;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " Information:\nEnergy: " + energyLevel +"\nHappiness: " + happinessLevel + "\nWeight: " + weight + "g\nAge: " + ageMonth + " months and " + ageYear + " years";
    }

    public void feed(Food item){
        weight += item.getWeightGain();
        happinessLevel += item.getHappinessIncrease();
        energyLevel += item.getEnergyIncrease();
        if(happinessLevel > 10){
            happinessLevel = 10;
        }

        if(energyLevel > 10){
            energyLevel = 10;
        }
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public boolean play(Game game){
        if(happinessLevel < 10){
            happinessLevel++;
        }
        if(weight > 5){
            weight--;
        }
    }

    public void updateStatus(){
        if(happinessLevel > 0){
            happinessLevel--;
        }
        if(energyLevel > 0){
            energyLevel--;
        }
        ageMonth++;
        if(ageMonth == 12){
            ageYear++;
            ageMonth = 0;
        }
    }
}
