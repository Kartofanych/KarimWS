package com.example.myapplicati;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends Activity {
    private EditText login, pass, name, pass1;
    private Button sign;
    private TextView noAcc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg);
        login = findViewById(R.id.mail);
        name = findViewById(R.id.name);
        sign = findViewById(R.id.sign);
        noAcc = findViewById(R.id.noAcc);
        pass = findViewById(R.id.pass);
        pass1 = findViewById(R.id.pass1);

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pass.getText().toString().length()<6 || login.getText().toString().length() == 0 || pass1.getText().toString().length()<6 || name.getText().toString().length()<6 || (!pass1.getText().toString().equals(pass.getText().toString()))){
                    Toast.makeText(Registration.this,"Lenght",Toast.LENGTH_LONG).show();
                }
                else{

                    Intent intent = new Intent(Registration.this, Main.class);
                    startActivity(intent);
                }
            }
        });
        noAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registration.this, Login.class);
                startActivity(intent);
            }
        });


    }
}
