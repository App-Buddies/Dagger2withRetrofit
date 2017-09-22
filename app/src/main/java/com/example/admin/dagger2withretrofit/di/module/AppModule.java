package com.example.admin.dagger2withretrofit.di.module;

import android.content.Context;

import com.example.admin.dagger2withretrofit.application.CakeApplication;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ADMIN on 22-09-2017.
 */
@Module
public class AppModule {
    String baseurl;
    Context mContext;

    public AppModule(String Url, Context context) {
        baseurl = Url;
        mContext = context;
    }


    @Singleton
    @Provides
    Retrofit provideRetrofit(OkHttpClient okHttpClient, GsonConverterFactory gsonConverterFactory, RxJavaCallAdapterFactory rxJavaCallAdapterFactory) {
        return null;
    }

    @Provides
    @Singleton
    OkHttpClient getHttpClient() {
        return new OkHttpClient.Builder().
                connectTimeout(60, TimeUnit.SECONDS).
                readTimeout(60, TimeUnit.SECONDS).
                build();
    }

    @Singleton
    @Provides
    GsonConverterFactory provideGson() {
        return GsonConverterFactory.create();
    }

    @Provides
    @Singleton
    RxJavaCallAdapterFactory providerxjava() {
        return RxJavaCallAdapterFactory.create();
    }

    @Provides
    @Singleton
    Context getContext() {
        return mContext;
    }
}
