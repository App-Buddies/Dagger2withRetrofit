package com.example.admin.dagger2withretrofit.di.module;

import android.support.v4.content.PermissionChecker;

import com.example.admin.dagger2withretrofit.api.CakeApiService;
import com.example.admin.dagger2withretrofit.di.scopes.AppScope;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by ADMIN on 22-09-2017.
 */
@Module
public class CakeModule {
    @Provides
    @AppScope
    CakeApiService getApiservice(Retrofit retrofit) {
        return retrofit.create(CakeApiService.class);
    }
}
