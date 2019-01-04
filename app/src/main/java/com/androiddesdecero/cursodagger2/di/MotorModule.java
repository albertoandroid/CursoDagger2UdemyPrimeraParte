package com.androiddesdecero.cursodagger2.di;

import com.androiddesdecero.cursodagger2.Coche;
import com.androiddesdecero.cursodagger2.Motor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */

@Module
public class MotorModule {

    @Provides
    public Motor providesMotorDiesel(){
        return new Motor("Diesel");
    }

    @Provides
    public Coche providesCoche(Motor motor){
        return new Coche(motor);
    }
}
