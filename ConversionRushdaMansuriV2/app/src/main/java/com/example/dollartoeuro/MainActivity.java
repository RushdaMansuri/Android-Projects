package com.example.dollartoeuro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText dollartxt;
    TextView eurostxt;
    Button conversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollartxt = findViewById(R.id.input_dollar_amounts);
        eurostxt = findViewById(R.id.euro_amount);
        conversion = findViewById(R.id.conversionButton);

        conversion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Double conversion_Amount;
                Double dollar_amount = Double.parseDouble(dollartxt.getText().toString());
                conversion_Amount = dollar_amount * 0.88;
                eurostxt.setText("Amount to Euros: " + conversion_Amount.toString() );
            }
        });
    }
}