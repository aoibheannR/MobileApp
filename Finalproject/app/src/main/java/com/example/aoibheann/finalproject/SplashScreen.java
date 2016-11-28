package com.example.aoibheann.finalproject;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Aoibheann on 25/11/2016.
 */

public class SplashScreen extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);}
                catch (InterruptedException e){
                    e.printStackTrace();}
                finally {
                    Intent intenet = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intenet);
                }
            }
        };
        timerThread.start();
    }

    protected void onPause(){
        super.onPause();
        finish();
    }
}
