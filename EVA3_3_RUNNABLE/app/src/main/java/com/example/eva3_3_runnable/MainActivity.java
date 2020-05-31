package com.example.eva3_3_runnable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Runnable rRun1 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i<10; i++){
                    //duemre al hilo principal
                    try {
                        Thread.sleep(1000);//1 seg =1000 milisegundos
                        Log.wtf("Hilo1",""+i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.wtf("Hilo1",""+i);
                }
            }
        };
        Thread  tHilo = new Thread(rRun1);
        tHilo.start();
    }
}
