package src.entity;

public class Player {
    private int daysLeft = 10;

    public int getDaysLeft() {
        return daysLeft;
    }

    public void loseDay() {
        daysLeft--;
    }

    public boolean isAlive() {
        return daysLeft > 0;
    }
}