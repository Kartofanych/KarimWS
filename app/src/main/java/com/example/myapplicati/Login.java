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

import org.w3c.dom.Text;

public class Login extends Activity {
    private EditText login, pass;
    private Button sign;
    private TextView noAcc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        sign = findViewById(R.id.sign);
        noAcc = findViewById(R.id.noAcc);


        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pass.getText().toString().length()<6 || login.getText().toString().length() == 0){
                    Toast.makeText(Login.this,"Lenght",Toast.LENGTH_LONG).show();
                }
                else{

                    Intent intent = new Intent(Login.this, Main.class);
                    startActivity(intent);
                }
            }
        });
        noAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Registration.class);
                startActivity(intent);
            }
        });
    }
}
