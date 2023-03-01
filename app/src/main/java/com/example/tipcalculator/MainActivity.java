package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button calculatorButton;
    private RadioGroup radioGc;
    private Switch roundUpSwitch;
    private TextView tipText;
    private double tipAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.costOfServiceText);
        calculatorButton = findViewById(R.id.calculatorButton);
        radioGc = findViewById(R.id.radioGroup);
        roundUpSwitch = findViewById(R.id.roundUpSwitch);
        tipText = findViewById(R.id.tipAmountText);

        calculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
double costOfService = Double.parseDouble(editText.getText().toString());
                int selectedId = radioGc.getCheckedRadioButtonId();
                if (selectedId == R.id.amazingRadioButton) {
                    tipAmount = costOfService * 0.15;
                } else if (selectedId == R.id.goodRadioButton) {
                    tipAmount = costOfService * 0.18;
                } else if (selectedId == R.id.okayRadioButton) {
                    tipAmount = costOfService * 0.20;
                }

                if (roundUpSwitch.isChecked()) {
                    tipAmount = Math.round(tipAmount);
                }

                tipText.setText("Tip Amount: $" + tipAmount);
            }
        });


    }


}
