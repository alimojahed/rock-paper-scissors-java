package logic;

public class Player {

    private String name;
    private Choice currentChoice;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Choice getCurrentChoice() {
        return currentChoice;
    }

    public void setCurrentChoice(Choice currentChoice) {
        this.currentChoice = currentChoice;
    }
}
