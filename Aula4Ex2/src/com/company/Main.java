package com.company;

import Classification.Species.CanisFamiliaris;
import Classification.Species.HomoSapiens;
import Classification.Species.MuscaDomestica;

public class Main {

    public static void main(String[] args) {
        HomoSapiens augusto = new HomoSapiens();
        CanisFamiliaris dog = new CanisFamiliaris();
        MuscaDomestica mosca = new MuscaDomestica();

        System.out.println(dog.getDescription());

        System.out.println(mosca.getDescription());

        System.out.println(augusto.getDescription());
    }
}
