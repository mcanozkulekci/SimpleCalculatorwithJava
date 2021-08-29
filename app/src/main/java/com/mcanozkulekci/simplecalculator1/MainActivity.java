package com.mcanozkulekci.simplecalculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    // We need to define our variables globally
    // since we should reach them out from the methods.

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         // We get the number1 and number2 from the user ( as we named in the UI)
         number1Text = findViewById(R.id.number1Text);
         number2Text = findViewById(R.id.number2Text);
         // We do the same thing for result text
         resultText = findViewById(R.id.resultText);


        // We get the user input as string format
        //number1Text.getText().toString()
        // However, this process should be done inside the functions
        // Because it does it make any sense to do this in onCreate method.
        // We should get the user data when user click to button.

    }


    public void sum(View view){

        // If the user input is an empty string for number1 or number2
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Invalid type of input");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 + number2;

            resultText.setText("Result: " + result);
        }

    }


    public void subtract(View view){
        // If the user input is an empty string for number1 or number2
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Invalid type of input");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 - number2;

            resultText.setText("Result: " + result);
        }
    }


    public void multiply(View view){
        // If the user input is an empty string for number1 or number2
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Invalid type of input");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 * number2;

            resultText.setText("Result: " + result);
        }

    }


    public void divide(View view){
        // If the user input is an empty string for number1 or number2
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Invalid type of input");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 / number2;

            resultText.setText("Result: " + result);
        }

    }



}