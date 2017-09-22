package com.example.admin.dagger2withretrofit.mvp.presenter;

import com.example.admin.dagger2withretrofit.api.CakeApiService;
import com.example.admin.dagger2withretrofit.base.BasePresenter;
import com.example.admin.dagger2withretrofit.mvp.view.MainView;

import javax.inject.Inject;

/**
 * Created by ADMIN on 22-09-2017.
 */

public class CakePresenter extends BasePresenter  {
    @Inject protected CakeApiService mCakeApiService;

    @Inject
    public CakePresenter(){

    }

    public void getCakes() {
    }
}
