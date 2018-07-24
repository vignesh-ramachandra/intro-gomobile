package com.vignesh.demoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import demo.APIResponse;
import demo.Demo;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Demo.getUserViewModel(new APIResponse() {
                    @Override
                    public void onErrorResponse(String s) {
                        Toast.makeText(MainActivity.this, "Some error occured", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onSuccessResponse(byte[] bytes) {
                        Toast.makeText(MainActivity.this, "It works!", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}
