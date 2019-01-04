package com.androiddesdecero.cursodagger2;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */

public class Coche {

    private Motor motor;

    public Coche(){
        motor = new Motor("Diesel");
    }

    public Coche(Motor motor){
        this.motor = motor;
    }

    public String getCoche(){
        return ("Coche con " + motor.getTipoMotor());
    }
}
