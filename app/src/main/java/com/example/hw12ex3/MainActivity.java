package com.example.hw12ex3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

//Задание 3
public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread MyThread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 60; i++) {
                    try {
                        sleep(1000l);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (i >= 5) {
                        progressBar.setVisibility(View.GONE);
                    }
                }
            }

        };
                MyThread.start();

    }
}