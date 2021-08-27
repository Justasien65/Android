package com.Udemy.udemyfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText getFirstNumber, getSecondNumber;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFirstNumber = findViewById(R.id.edtFirstNumber);
                getSecondNumber = findViewById(R.id.edtSecondNumber);
                int mResult = (Integer.parseInt(getFirstNumber.getText().toString()) * Integer.parseInt(getSecondNumber.getText().toString()));
                text.setText("Your Answer is: " + mResult + "");
                Log.i("MySum", mResult + "");
            }
        });

        Button btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFirstNumber.setText("");
                getSecondNumber.setText("");
                text.setText("Your Answer is: ");
            }
        });

    }


}