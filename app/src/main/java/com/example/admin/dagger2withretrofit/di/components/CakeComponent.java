package com.example.admin.dagger2withretrofit.di.components;

import com.example.admin.dagger2withretrofit.di.module.CakeModule;
import com.example.admin.dagger2withretrofit.di.scopes.AppScope;
import com.example.admin.dagger2withretrofit.modules.home.MainActivity;

import dagger.Component;
import dagger.Module;

/**
 * Created by ADMIN on 22-09-2017.
 */
@AppScope
@Component(modules = CakeModule.class, dependencies = AppComponent.class)
public interface CakeComponent {
    void inject(MainActivity activity);

}
