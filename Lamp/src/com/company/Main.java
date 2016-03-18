package com.company;

public class Main {

    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(1, StateEnum.halfLight);
        Lamp lamp2 = new Lamp(2, StateEnum.off);

        lamp1.TurnOn();
        lamp2.IsOn();
        lamp2.TurnHalfLight();
    }
}
