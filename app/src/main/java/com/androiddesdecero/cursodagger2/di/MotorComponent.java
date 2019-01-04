package com.androiddesdecero.cursodagger2.di;

import com.androiddesdecero.cursodagger2.MainActivity;

import dagger.Component;

/**
 * Created by albertopalomarrobledo on 4/1/19.
 */

@Component(modules = {MotorModule.class})
public interface MotorComponent {
    void inject(MainActivity mainActivity);
}
