package src.main;

import src.entity.GameEntity;

public class Choice extends GameEntity {
    private boolean isCorrect;
    private String consequence;

    public Choice(String description, boolean isCorrect, String consequence) {
        super("Choice", description);
        this.isCorrect = isCorrect;
        this.consequence = consequence;
    }

    @Override
    public void display() {
        System.out.println(description);
    }

    public String getDescription() {
        return description;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public String getConsequence() {
        return consequence;
    }

    
}