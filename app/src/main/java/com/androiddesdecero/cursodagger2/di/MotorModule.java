package com.androiddesdecero.cursodagger2.di;

import com.androiddesdecero.cursodagger2.Coche;
import com.androiddesdecero.cursodagger2.Motor;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */

@Module
public class MotorModule {

    @Singleton
    @Named("diesel")
    @Provides
    public Motor providesMotorDiesel(){
        return new Motor("Diesel");
    }

    @Singleton
    @Named("gasolina")
    @Provides
    public Motor providesMotorGasolina(){
        return new Motor("Gasolina");
    }

    @Provides
    public Coche providesCoche(@Named("gasolina") Motor motor){
        return new Coche(motor);
    }
}
