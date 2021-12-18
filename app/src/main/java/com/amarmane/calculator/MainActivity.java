package com.amarmane.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtFirstNumber, edtSecondNumber;
    TextView txtAns;
    Button btnAddition, btnSubtraction, btnMultiplication, btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFirstNumber = findViewById(R.id.edtFirstNumber);
        edtSecondNumber = findViewById(R.id.edtSecondNumber);

        txtAns = findViewById(R.id.txtAns);

        btnAddition = findViewById(R.id.btnAddition);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnDivision = findViewById(R.id.btnDivision);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstNumber, secondNumber, ans;

                firstNumber = Integer.parseInt(edtFirstNumber.getText().toString());
                secondNumber = Integer.parseInt(edtSecondNumber.getText().toString());

                ans = firstNumber + secondNumber;

                txtAns.setText("Ans is = " + ans);

            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstNumber, secondNumber, ans;

                firstNumber = Integer.parseInt(edtFirstNumber.getText().toString());
                secondNumber = Integer.parseInt(edtSecondNumber.getText().toString());

                ans = firstNumber - secondNumber;

                txtAns.setText("Ans is = " + ans);

            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstNumber, secondNumber, ans;

                firstNumber = Integer.parseInt(edtFirstNumber.getText().toString());
                secondNumber = Integer.parseInt(edtSecondNumber.getText().toString());

                ans = firstNumber * secondNumber;

                txtAns.setText("Ans is = " + ans);

            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstNumber, secondNumber, ans;

                firstNumber = Integer.parseInt(edtFirstNumber.getText().toString());
                secondNumber = Integer.parseInt(edtSecondNumber.getText().toString());

                ans = firstNumber / secondNumber;

                txtAns.setText("Ans is = " + ans);

            }
        });

    }
}