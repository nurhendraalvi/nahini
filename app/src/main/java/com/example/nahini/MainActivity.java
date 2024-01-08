package com.example.nahini;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn_pengertian, btn_simulasi, btn_about;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_pengertian = findViewById(R.id.PengertianBotton);
        btn_simulasi =  findViewById(R.id.SimulasiBotton);
        btn_about = findViewById(R.id.AboutBottom);

        btn_pengertian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_pengertian = new Intent(getApplicationContext(), Pengertian.class);
                startActivity(view_pengertian);
            }
        });
        btn_simulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_simulasi = new Intent(getApplicationContext(), Simulasi1.class);
                startActivity(view_simulasi);
            }
        });
    }
}
