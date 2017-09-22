package com.example.admin.dagger2withretrofit.di.components;

import android.content.Context;

import com.example.admin.dagger2withretrofit.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by ADMIN on 22-09-2017.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Retrofit provideRetrofit();

    Context getContext();

}
