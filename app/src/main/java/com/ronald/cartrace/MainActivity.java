package com.ronald.cartrace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button vbtnCliente, vbtnConductor;
    SharedPreferences vTipoUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vbtnCliente = findViewById(R.id.btnCliente);
        vbtnConductor = findViewById(R.id.btnConductor);

        vTipoUsuario = getApplicationContext().getSharedPreferences("typeUser",MODE_PRIVATE);
        final SharedPreferences.Editor editor = vTipoUsuario.edit();

        vbtnCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("user","client");
                editor.apply();

                TypeClient();
            }
        });

        vbtnConductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("user","driver");
                editor.apply();

                TypeDriver();
            }
        });
    }

    private void TypeClient()
    {
        Intent intcliente = new Intent(MainActivity.this, SelectOptionAuthActivity.class);
        startActivity(intcliente);
    }

    private void TypeDriver()
    {
        Intent intconductor = new Intent(MainActivity.this,SelectOptionAuthActivity.class);
        startActivity(intconductor);
    }
}