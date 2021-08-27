package com.udemy.petage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Year;

public class MainActivity extends AppCompatActivity {

    EditText ageInput;
    Button btnSubmit, btnClear;
    TextView txtAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ageInput = findViewById(R.id.ageInput);
        btnClear = findViewById(R.id.btnClear);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtAnswer = findViewById(R.id.realAge);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Year year = Year.now();
                int totalAge = year - Integer.parseInt(ageInput.toString());
            }
        }

    }
}