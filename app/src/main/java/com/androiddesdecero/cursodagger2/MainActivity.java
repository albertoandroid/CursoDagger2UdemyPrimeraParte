package com.androiddesdecero.cursodagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androiddesdecero.cursodagger2.di.BaseApplication;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

    private Motor motor;

    @Named("diesel")
    @Inject
    Motor motorDiesel;

    @Inject
    Coche coche;

    @Inject
    Lazy<Coche> cocheLazy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((BaseApplication)getApplication()).getMotorComponent().inject(this);


        motor = new Motor("Gasolina");
        Log.d("TAG1", motor.getTipoMotor());

        Log.d("TAG1", motorDiesel.getTipoMotor());

        Log.d("TAG1", coche.getCoche());

        Log.d("TAG1Lazy", cocheLazy.get().getCoche());
    }
}
