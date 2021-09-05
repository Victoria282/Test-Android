package com.example.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Настин комит от 05.09.21
    // Nastya commit
    // 11111 22222 33333

    TextView resultField;
    Button addNumberButton;

    public int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultField = findViewById(R.id.result);
        addNumberButton = findViewById(R.id.addNumber);

        // приложение запущено впервые => счётчик обнуляется
        if(savedInstanceState == null) {
            number = 0;
        }

        // обработчик нажатия на кнопку
        addNumberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNumber();
            }
        });
    }

    public void addNumber() {
        number += 1;
        resultField.setText(String.valueOf(number));
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        number = savedInstanceState.getInt("number");
        resultField.setText(String.valueOf(number));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("number", number);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}


