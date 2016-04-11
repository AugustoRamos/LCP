package Aula4.Classes;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public class House extends Realty{
    private Door door1;
    private Door door2;
    private Door door3;

    @Override
    public int countOpenedDoors(){
        int openned = 0;

        if(getDoor1() != null && getDoor1().isOpenned())
            openned++;
        if(getDoor2() != null && getDoor2().isOpenned())
            openned++;
        if(getDoor3() != null &&  getDoor3().isOpenned())
            openned++;

        return openned;
    }

    @Override
    public int totalDoors(){
        int totalDoors = 0;

        if(getDoor1() != null)
            totalDoors++;

        if(getDoor2() != null)
            totalDoors++;

        if(getDoor3() != null)
            totalDoors++;

        return totalDoors;
    }

    @Override
    public void setDoor(Door door) {
        if(door1 == null) {
            door1 = door;
            return;
        }
        else if(door2 == null){
            door2 = door;
            return;
        }
        else if(door3 == null) {
            door3 = door;
            return;
        }
        else{
            System.out.println("Todas as portas para esta casa já foram preenchidas!");
        }
    }

    @Override
    public int getTotalFloors() {
        return 0;
    }


    public Door getDoor1() {
        return door1;
    }

    public Door getDoor2() {
        return door2;
    }

    public Door getDoor3() {
        return door3;
    }


}
