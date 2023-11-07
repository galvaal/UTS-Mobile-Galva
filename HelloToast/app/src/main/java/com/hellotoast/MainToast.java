package com.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainToast extends AppCompatActivity {
    private int hitung = 0;
    private TextView showHitung;
    private int num1 = 1; // Nilai pertama dalam deret Fibonacci
    private int num2 = 1; // Nilai keduadalam deret Fibonacci

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        showHitung = (TextView)findViewById(R.id.show_count);
    }

    public void showtoast(View view) {
        Toast toast= Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        int nextFib = num1 + num2;
        showHitung.setText(Integer.toString(num1));

        // Geser nilai dalam deret Fibonacci
        num1 = num2;
        num2 = nextFib;
    }
}