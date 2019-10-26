package com.drsports.hook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author vson
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bnt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HookHelper.hookIActivityManager();
                HookHelper.hookHandler();
                Intent intent = new Intent(MainActivity.this,TargetActivity.class);
                startActivity(intent);
            }
        });
    }
}
