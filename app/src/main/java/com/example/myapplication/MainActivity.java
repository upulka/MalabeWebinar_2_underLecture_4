package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2;
    //type logt and press the tab key
    private static final String TAG = "MainActivity";//you can change the name inside the double quotes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.txtView2);
        textView2.setText(R.string.Msg2);
        //textView2.setText(R.string.Msg2);//this is what you typed in the previous line. when running the app it turns into the sentence given to that string

        //type logi and press tab key
        Log.i(TAG, "onCreate: ");
    }

    
    //write click and select generate then select override methods then select onStart and onStop
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    //write click and select generate then select override methods then select onResume(this method has updated as inPostResume) and onRestart
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG, "onPostResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }
}