package com.hanschen.androidjni;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.hanschen.androidjni.jni.NativeInterface;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context         context;
    private NativeInterface nativeInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        nativeInterface = new NativeInterface();

        findViewById(R.id.get_string_btn).setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.get_string_btn:
                Toast.makeText(context, nativeInterface.getStringFromNativeWorld(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}