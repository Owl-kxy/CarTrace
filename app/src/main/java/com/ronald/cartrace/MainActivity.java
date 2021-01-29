package com.ronald.cartrace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button vbtnCliente, vbtnConductor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vbtnCliente = findViewById(R.id.btnCliente);
        vbtnConductor = findViewById(R.id.btnConductor);

        vbtnCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intcliente = new Intent(MainActivity.this, SelectOptionAuthActivity.class);
                startActivity(intcliente);
            }
        });

        vbtnConductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intconductor = new Intent(MainActivity.this,SelectOptionAuthActivity.class);
                startActivity(intconductor);
            }
        });
    }
}