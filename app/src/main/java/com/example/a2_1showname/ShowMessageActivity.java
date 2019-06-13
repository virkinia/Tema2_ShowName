package com.example.a2_1showname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMessageActivity extends AppCompatActivity {

    private TextView nameET;
    private TextView edadET;
    private TextView sexoET;
    private TextView alturaET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra("name");
        Integer edad = intent.getIntExtra("edad", 0);
        Boolean sexo = intent.getBooleanExtra("sexo", false);
        Float altura = intent.getFloatExtra("altura", 0.0f);


        nameET = findViewById(R.id.showName);
        edadET = findViewById(R.id.showEdad);
        sexoET = findViewById(R.id.showSexo);
        alturaET = findViewById(R.id.showAltura);


        nameET.setText(message);
        edadET.setText(edad.toString());
        sexoET.setText(sexo ? "femenino": "masculino");
        alturaET.setText(altura.toString());


    }


}
