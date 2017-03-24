package com.reserva;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity {

    TextView User, Pass;
    String US = "Gerardo";
    String PS = "CECYT9";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        User = (TextView)  findViewById(R.id.editTextUser);
        Pass = (TextView)  findViewById(R.id.editTextPasw);


    }

    public void enviar(View v) {

            Intent envia = new Intent(this, MainActivity.class);
            Bundle dato = new Bundle();
        if (User.getText().toString().trim() == US && Pass.getText().toString().trim() == PS) {
            dato.putString("Usuario", User.getText().toString().trim());
            dato.putString("Contra", Pass.getText().toString().trim());
            envia.putExtras(dato);
            finish();
            startActivity(envia);
        }
        else{
            System.out.println("error" );
        }

    }
}
