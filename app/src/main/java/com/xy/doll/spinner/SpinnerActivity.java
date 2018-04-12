package com.xy.doll.spinner;

import android.os.Bundle;
import android.widget.Spinner;

import com.xy.doll.R;

import app.ui.base.BaseActivity;
import butterknife.BindView;

public class SpinnerActivity extends BaseActivity {

    @BindView(R.id.spinner)
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
    }

    @Override
    protected void initUI() {

    }

    @Override
    protected void initData() {

    }
}
