package edu.oakland.grizzfit.grizzfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        //Aligning xml elements with the java elements
        Button btnCalculate =  findViewById(R.id.btnCalculateBMI);
        final EditText fieldWeight = findViewById(R.id.fieldWeight);
        final EditText fieldHeight = findViewById(R.id.fieldHeight);
        final TextView labelOutput = findViewById(R.id.labelBMIOutput);

        //Calculating the BMI
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float weight = 0;
                float height = 0;
                float bmi = 0;

                //Calculates BMI after checking to make sure the information is valid.


                if ((fieldWeight.getText().toString().equals("")  || (fieldWeight.getText().toString().equals("0")))) {
                    Toast.makeText(getApplicationContext(), "Please enter in a proper Weight", Toast.LENGTH_SHORT).show();
                }
                else if ((fieldHeight.getText().toString().equals("")  || (fieldHeight.getText().toString().equals("0")))) {
                    Toast.makeText(getApplicationContext(),"Please enter in a proper Height", Toast.LENGTH_SHORT).show();
                }
                else {
                    weight = Integer.parseInt(fieldWeight.getText().toString());
                    height = Integer.parseInt(fieldHeight.getText().toString());
                    bmi = (703 * (weight / (height * height)));
                }

                labelOutput.setText(String.valueOf(bmi));

            }
        });
    }




}
