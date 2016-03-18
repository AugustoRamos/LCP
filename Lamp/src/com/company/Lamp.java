package com.company;

/**
 * Created by augustochaves on 18/03/16.
 */
public class Lamp {

    private StateEnum State;
    private int LampId;

    public Lamp(int lampId, StateEnum state) {
        LampId = lampId;
        State = state;

    }


    public void TurnOn(){
        this.State = StateEnum.on;
        System.out.println("A lâmpada " + this.LampId + " foi acesa!");
    }

    public void TurnOff(){
        this.State = StateEnum.off;
        System.out.println("A lâmpada " + this.LampId + " foi apagada!");
    }

    public void TurnHalfLight(){
        this.State = StateEnum.halfLight;
        System.out.println("A lâmpada " + this.LampId + " foi colocada em meia-luz!");
    }

    public boolean IsOn(){
        if(this.State == StateEnum.on || this.State == StateEnum.halfLight){
            System.out.println("A lâmpada " + this.LampId + " não está apagada!");
            return true;
        }
        else{
            System.out.println("A lâmpada " + this.LampId + " está apagada!");
            return false;
        }
    }

}
