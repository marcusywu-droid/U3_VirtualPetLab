// Part B

public class Game {
    private String name;
    private int happinessIncr;
    private int weightDecr;

    public Game(String name, int happinessIncr, int weightDecr){
        this.name = name;
        this.happinessIncr = happinessIncr;
        this.weightDecr = weightDecr;
    }

    public String getName() {
        return name;
    }

    public int getHappinessIncr() {
        return happinessIncr;
    }

    public int getWeightDecr() {
        return weightDecr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHappinessIncr(int happinessIncr) {
        this.happinessIncr = happinessIncr;
    }

    public void setWeightDecr(int weightDecr) {
        this.weightDecr = weightDecr;
    }

    public boolean isWinner(){
        return Math.random() >= .5;
    }
}
