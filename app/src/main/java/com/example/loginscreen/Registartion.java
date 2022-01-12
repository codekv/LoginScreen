package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registartion extends AppCompatActivity {

    EditText etEmail,etPass,etName,etconPass;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registartion);

        etEmail=findViewById(R.id.etEmail);
        etPass=findViewById(R.id.etPass);
        etconPass=findViewById(R.id.etconPass);
        etName=findViewById(R.id.etName);

        btnLogin=findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name,email,pass,conpass;
                email=etEmail.getText().toString();
                pass=etPass.getText().toString();
                conpass=etconPass.getText().toString();
                Name=etName.getText().toString();


                if (Name.equals(""))
                {
                    Toast.makeText(Registartion.this, "Email Required", Toast.LENGTH_SHORT).show();
                }
                else if(email.equals("")){
                    Toast.makeText(Registartion.this, "Password Required", Toast.LENGTH_SHORT).show();
                }
                if (pass.equals(""))
                {
                    Toast.makeText(Registartion.this, "Email Required", Toast.LENGTH_SHORT).show();
                }
                else if(conpass.equals("")){
                    Toast.makeText(Registartion.this, "Password Required", Toast.LENGTH_SHORT).show();
                }
                else if(!conpass.equals("pass")){
                    Toast.makeText(Registartion.this, "Password Mismatch", Toast.LENGTH_SHORT).show();
                }

                else{
                    //Authenticion
                }
            }
        });
    }
}
