package com.example.a2_1showname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {


    private Button showMeBtn;
    private EditText nameET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMeBtn = findViewById(R.id.button);
        nameET = findViewById(R.id.editText);

        cambiarBoton();

        showMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ShowMessageActivity.class);
                intent.putExtra("name", nameET.getText().toString());
                intent.putExtra("edad", 20);
                intent.putExtra("sexo", true);
                intent.putExtra("altura", 1.80f);
                startActivity(intent);
            }
        });
    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(View view) {
        // Do something in response to button


    }

    private void cambiarBoton() {
        showMeBtn.setTextSize(TypedValue.COMPLEX_UNIT_SP,35);
    }
}
