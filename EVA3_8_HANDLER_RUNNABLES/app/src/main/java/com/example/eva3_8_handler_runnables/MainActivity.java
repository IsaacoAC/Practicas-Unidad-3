package com.example.eva3_8_handler_runnables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;
import android.widget.ThemedSpinnerAdapter;

public class MainActivity extends AppCompatActivity {
    TextView txtMnesa;
    int i;

    Handler miHandler = new Handler();
    Runnable backGroundRun = new  Runnable(){ //Trabajo pesado
        @Override
        public void run() {
            i=0;
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                miHandler.post(foreGroundRun);
                Log.wtf("MiRunnable", i + "");
                i++;
            }
        }
    };

    Runnable foreGroundRun = new Runnable() { //Modificar la UI
        @Override
        public void run() {
            txtMnesa.append("valor i:= "+ i+ "\n");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMnesa=findViewById(R.id.txtMens);

        Thread tHilo = new Thread(backGroundRun);
        tHilo.start();
    }
}
