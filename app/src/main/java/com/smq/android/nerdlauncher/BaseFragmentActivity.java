package com.smq.android.nerdlauncher;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by smq on 2016/11/21.
 */

public abstract class BaseFragmentActivity extends AppCompatActivity {

    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);

        FragmentManager fm=getSupportFragmentManager();
        Fragment fragment=fm.findFragmentById(R.id.activity_fragment_container);

        if(fragment==null){
            fragment=createFragment();
            fm.beginTransaction()
                    .add(R.id.activity_fragment_container,fragment)
                    .commit();


        }

    }

}
