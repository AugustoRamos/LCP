package Aula4.Classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public class Buiding extends Realty {
    private int totalDoors;
    private int totalFloors;
    private List<Door> doors;

    public Buiding() {
        doors = new ArrayList<Door>();
    }

    public void addFloor(){
        this.totalFloors++;
    }

    @Override
    public int countOpenedDoors() {
        int totalDoors = 0;

        for (Door door: doors) {
            if(door.isOpenned())
                totalDoors++;
        }

        return totalDoors;
    }

    @Override
    public int totalDoors() {
        return doors.size();
    }

    @Override
    public void setDoor(Door door) {
        this.doors.add(door);
    }

    @Override
    public int getTotalFloors() {
        return totalFloors;
    }
}
