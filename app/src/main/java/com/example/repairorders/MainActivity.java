package com.example.repairorders;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    double numbers = 0.0;
    TextView totalTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //UI created here!
        setContentView(R.layout.activity_main);
        totalTV = findViewById(R.id.textView10); //first $0.0

        Random gen = new Random();
        double number = gen.nextDouble();
        String v1 = "$" + number;
        totalTV.setText(v1);

        String value = totalTV.getText().toString();

        Log.i("TEST",value);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}