package com.example.administrator.acticitycycletesthehaolin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonA;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.activity_main);

        buttonA = (Button) findViewById(R.id.buttonA);

        buttonA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    /**
     * Activity准备好和用户进行交互的时候被调用
     */

    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    /**
     * Activity准备去启动或者恢复另一个Activity的时候调用
     */

    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    /**
     * 退出当前Activity或者跳转到新Activity时被调用
     * Activity完全不可见的时候调用
     */

    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    /**
     * 退出当前Activity时被调用,调用之后Activity就结束了
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy");
    }

    /**
     * Activity从后台重新回到前台时被调用
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart()");
    }
}
