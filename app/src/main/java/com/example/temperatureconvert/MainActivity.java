package com.example.temperatureconvert;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText celsiusEditText;
    private TextView fahrenheitTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celsiusEditText = findViewById(R.id.celsiusEditText);
        fahrenheitTextView = findViewById(R.id.fahrenheitTextView);
    }

    public void convertTemperature(View view) {
        String celsiusString = celsiusEditText.getText().toString();
        if (!celsiusString.isEmpty()) {
            double celsius = Double.parseDouble(celsiusString);
            double fahrenheit = celsius * 9/5 + 32;
            fahrenheitTextView.setText(String.format("%.2f°F", fahrenheit));
        } else {
            fahrenheitTextView.setText("Enter a valid temperature");
        }
    }
}