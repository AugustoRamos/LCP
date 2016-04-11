package com.company;

import Aula4.Classes.Buiding;
import Aula4.Classes.Door;
import Aula4.Classes.House;

public class Main {

    public static void main(String[] args) {

        Door door1 = new Door();
        Door door2 = new Door();
        Door door3 = new Door();
        Door door4 = new Door();
        Door door5 = new Door();
        Door door6 = new Door();
        House house = new House();
        Buiding building = new Buiding();

        door1.open();
        door1.setColor("Gray");
        door1.setColor("Blue");
        door1.setX(40.0);
        door1.setY(60.0);
        door1.setZ(30.0);
        door1.close();

        door2.open();
        door2.setColor("Red");
        door2.setColor("Green");
        door2.setX(40.0);
        door2.setY(60.0);
        door2.setZ(30.0);

        door3.open();
        door3.setColor("Red");
        door3.setColor("Green");
        door3.setX(40.0);
        door3.setY(60.0);
        door3.setZ(30.0);

        door4.close();
        door5.open();
        door6.open();

        house.setColor("Pink");
        house.setDoor(door1);
        house.setDoor(door2);
        house.setDoor(door3);

        building.setDoor(door1);
        building.setDoor(door2);
        building.setDoor(door3);
        building.setDoor(door4);
        building.setDoor(door5);
        building.setDoor(door6);

        building.addFloor();
        building.addFloor();
        building.addFloor();
        building.addFloor();

        System.out.println("Na casa há " + house.countOpenedDoors() + " portas abertas.");
        System.out.println("No edifício há " + building.countOpenedDoors()
                            + " portas abertas e " + building.getTotalFloors() +  " andares.");


    }
}
