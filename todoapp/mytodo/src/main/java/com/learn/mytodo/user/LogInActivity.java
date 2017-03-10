package com.learn.mytodo.user;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

import com.learn.mytodo.R;

/**
 * Created by dongjiangpeng on 2017/3/6 0006.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Toolbar mToolbar;
    private FrameLayout mFrameLayout;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login_activity);
        initViews();
    }

    private void initViews() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mFrameLayout = (FrameLayout) findViewById(R.id.content_frame);
        LoginFragment loginFragment = new LoginFragment();
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.content_frame, loginFragment);
        mFragmentTransaction.commit();
    }

    @Override
    public void onClick(View view) {
    }
}