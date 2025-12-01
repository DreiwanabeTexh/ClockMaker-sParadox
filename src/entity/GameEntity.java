package src.entity;

public abstract class GameEntity {
    protected String name;
    protected String description;
    
    public GameEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public abstract void display();
    
    public String getName() { return name; }
    public String getDescription() { return description; }
}