package com.example.eva3_4_multiples_hilos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MiHilo miHilo = new MiHilo();
        miHilo.start();
        //---------------
        MiRunnable miRun = new MiRunnable();
        Thread tHilo = new Thread(miRun);
        tHilo.start();
    }
}
