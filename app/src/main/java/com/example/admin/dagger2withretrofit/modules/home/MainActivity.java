package com.example.admin.dagger2withretrofit.modules.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.dagger2withretrofit.R;
import com.example.admin.dagger2withretrofit.base.BaseActivity;
import com.example.admin.dagger2withretrofit.mvp.presenter.CakePresenter;
import com.example.admin.dagger2withretrofit.mvp.view.MainView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainView{
@Inject
    CakePresenter cakePresenter;
    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        cakePresenter.getCakes();
    }
}
