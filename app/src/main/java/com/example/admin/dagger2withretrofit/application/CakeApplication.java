package com.example.admin.dagger2withretrofit.application;

import android.app.Application;
import android.content.Context;

import com.example.admin.dagger2withretrofit.di.components.AppComponent;
import com.example.admin.dagger2withretrofit.di.module.AppModule;

/**
 * Created by ADMIN on 22-09-2017.
 */

public class CakeApplication extends Application {
    private AppComponent mApplicationComponent;
    Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeApplicationComponent();

    }

    private void initializeApplicationComponent() {
    DaggerAppComponent.builder.build();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public AppComponent getApplicationComponent(){
        return  mApplicationComponent;
    }
}
