package src.scene;

import java.util.List;
import src.entity.GameEntity;
import src.main.Choice;
import src.ui.TextDisplayer;

public class Scene extends GameEntity {
    private List<Choice> choices;

    public Scene(String title, String description, List<Choice> choices) {
        super(title, description);
        this.choices = choices;
    }

    @Override
    public void display() {
        TextDisplayer.slowType("\n" + name + "\n");
        TextDisplayer.normalType(description + "\n");
    }

    public String getTitle() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Choice> getChoices() {
        return choices;
    }
}