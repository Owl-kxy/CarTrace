package com.ronald.cartrace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectOptionAuthActivity extends AppCompatActivity {

    Toolbar vToolbar;
    Button vbtnRegistrarme, vbtnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option_auth);

        vToolbar = findViewById(R.id.toolbar);
        vbtnRegistrarme = findViewById(R.id.btnRegistrarme);
        vbtnLogIn = findViewById(R.id.btnLogIn);

        setSupportActionBar(vToolbar);
        getSupportActionBar().setTitle("Selecciona una opcion");

        // arrow left to back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        vbtnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intLogIn = new Intent(SelectOptionAuthActivity.this, LoginActivity.class);
                startActivity(intLogIn);
            }
        });

    }
}