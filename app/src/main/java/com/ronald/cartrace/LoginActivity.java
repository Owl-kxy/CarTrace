package com.ronald.cartrace;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginActivity extends AppCompatActivity {

    Button vbtnLogInUser;
    EditText vedtpassword, vedtemail;

    // FireBase variable
    FirebaseAuth vFirebaseAuth;

    // DB variable
    DatabaseReference vDatabaseRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        vbtnLogInUser = findViewById(R.id.btnLogInUser);
        vedtpassword = findViewById(R.id.edtPassword);
        vedtemail = findViewById(R.id.edtEmail);

        vFirebaseAuth = FirebaseAuth.getInstance();
        vDatabaseRef = FirebaseDatabase.getInstance().getReference();

        vbtnLogInUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogIn();
            }
        });
    }

    private void LogIn()
    {
        String email = vedtemail.getText().toString();
        String password = vedtpassword.getText().toString();

        if(!email.isEmpty() && !password.isEmpty())
        {
            if(password.length()>=6)
            {
                vFirebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(LoginActivity.this,"Exito", Toast.LENGTH_SHORT).show();
                        }

                        else
                        {
                            Toast.makeText(LoginActivity.this,"Fail", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

            else
            {
                Toast.makeText(LoginActivity.this, "Verifique la contraseña",Toast.LENGTH_SHORT).show();
            }
        }

        else{
            Toast.makeText(LoginActivity.this, "Se necesita usuario y password", Toast.LENGTH_SHORT).show();
        }

    }

}