package com.ronald.cartrace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    SharedPreferences vTipoUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        vTipoUsuario = getApplicationContext().getSharedPreferences("typeUser",MODE_PRIVATE);

        String UserSelected = vTipoUsuario.getString("user","");
        Toast.makeText(this,"Selecciono: "+UserSelected,Toast.LENGTH_SHORT).show();
    }
}