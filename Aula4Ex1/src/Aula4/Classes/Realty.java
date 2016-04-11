package Aula4.Classes;

/**
 * Created by Gabriella on 10/04/2016.
 */
public abstract class Realty {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract int countOpenedDoors();

    public abstract int totalDoors();

    public abstract void setDoor(Door door);

    public abstract int getTotalFloors();
}

