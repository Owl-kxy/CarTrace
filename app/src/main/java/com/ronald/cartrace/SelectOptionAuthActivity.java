package com.ronald.cartrace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class SelectOptionAuthActivity extends AppCompatActivity {

    Toolbar vToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option_auth);

        vToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(vToolbar);
        getSupportActionBar().setTitle("Selecciona una opcion");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}