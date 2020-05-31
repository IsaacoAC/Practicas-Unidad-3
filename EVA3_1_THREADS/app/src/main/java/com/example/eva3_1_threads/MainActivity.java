package com.example.eva3_1_threads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //SIMULAR UNA ACTIVIDAD QUE TOME MUCHO TIEMPO
        //POR EJEMPLO UNA CONEXION A BASE DE DATOS
        //10 SEGUNDOS
        for(int i = 0 ; i<10; i++){
            //duemre al hilo principal
            try {
                Thread.sleep(1000);//1 seg =1000 milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
