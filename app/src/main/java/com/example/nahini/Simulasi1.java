package com.example.nahini;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Simulasi1 extends AppCompatActivity {
    private Button ball_simulation_btn, not_ready_simulation_btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.untuksimulasi);
        ball_simulation_btn = findViewById(R.id.button1);
        not_ready_simulation_btn = findViewById(R.id.button2);

        ball_simulation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BallSimuation.class);
                startActivity(intent);
            }
        });
        not_ready_simulation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), SecoundSimulation.class);
                startActivity(intent2);
            }
        });
    }
}
