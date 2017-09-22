package com.example.admin.dagger2withretrofit.modules.detail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.dagger2withretrofit.R;
import com.example.admin.dagger2withretrofit.base.BaseActivity;

public class DetailsActivity extends BaseActivity {


    @Override
    protected int getContentView() {
        return R.layout.activity_details;
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
    }
}
