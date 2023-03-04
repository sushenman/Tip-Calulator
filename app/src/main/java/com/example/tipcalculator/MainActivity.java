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
    private EditText ConvertValue;
    private RadioGroup radioGroup;
    private Switch switch1;
    private Button Calculate;
    private TextView Amount;
    private double convertionRate;
    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConvertValue = findViewById(R.id.ConversionNumber);
        radioGroup = findViewById(R.id.radioGroup);
        switch1 = findViewById(R.id.switch1);
        Calculate = findViewById(R.id.Calcluatebutton);
        Amount = findViewById(R.id.Result);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = ConvertValue.getText().toString();
                int value1 = Integer.parseInt(value);
                int radioId = radioGroup.getCheckedRadioButtonId(); // get the id of the selected radio button/





                //use switch case
                switch(radioId)
                {
                    case (R.id.MM):
                        if(switch1.isChecked())
                        {
                            convertionRate= 29.573;

                        }
                        else
                        {
                            convertionRate= 0.033814;
//                            double result = value1*0.033814;
//                            Amount.setText(String.valueOf(result));
                        }
                        break;
                    case( R.id.GC):

                        if(switch1.isChecked())
                        {
                            convertionRate= 240;
//                            double result = value1 *240;
//                            Amount.setText(String.valueOf(result));

                        }

                        else
                        {
                            convertionRate= 0.008;
//                            double result = value1*0.008;
//                            Amount.setText(String.valueOf(result));
                        }
                        break;
                }
                double result = value1*convertionRate;
                Amount.setText(String.valueOf(result));
            }
        });
    }

}