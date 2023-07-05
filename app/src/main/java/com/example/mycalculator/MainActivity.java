package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView output;
    private Button sum, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        sum = findViewById(R.id.sum);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        output = findViewById(R.id.output);

//        int fnum = Integer.parseInt(num1.getText().toString());
//        int snum = Integer.parseInt(num2.getText().toString());

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().isEmpty() && num2.getText().toString().isEmpty() ||  num1.getText().toString().isEmpty() ||  num2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter number fisrt", Toast.LENGTH_SHORT).show();
                    return;
                }

                int fnum = Integer.parseInt(num1.getText().toString());
                int snum = Integer.parseInt(num2.getText().toString());

                output.setText(fnum +" + " + snum + " = " + (fnum + snum));
                num1.setText("");
                num2.setText("");
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().isEmpty() && num2.getText().toString().isEmpty() ||  num1.getText().toString().isEmpty() ||  num2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter number fisrt", Toast.LENGTH_SHORT).show();
                    return;
                }

                int fnum = Integer.parseInt(num1.getText().toString());
                int snum = Integer.parseInt(num2.getText().toString());
                output.setText(fnum +" - " + snum + " = " + (fnum - snum));
                num1.setText("");
                num2.setText("");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().isEmpty() && num2.getText().toString().isEmpty() || num1.getText().toString().isEmpty() ||  num2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter number fisrt", Toast.LENGTH_SHORT).show();
                    return;
                }

                int fnum = Integer.parseInt(num1.getText().toString());
                int snum = Integer.parseInt(num2.getText().toString());
                output.setText(fnum +" * " + snum + " = " + (fnum * snum));
                num1.setText("");
                num2.setText("");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().isEmpty() && num2.getText().toString().isEmpty() ||  num1.getText().toString().isEmpty() ||  num2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter number fisrt", Toast.LENGTH_SHORT).show();
                    return;
                }

                int fnum = Integer.parseInt(num1.getText().toString());
                int snum = Integer.parseInt(num2.getText().toString());
                output.setText(fnum +" / " + snum + " = " + (fnum / snum));
                num1.setText("");
                num2.setText("");
            }
        });
    }
}